package com.loopme.customparser.xml;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.StringReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

public class XmlParser {

    public static <T> T parse(String xml, Class<T> classOfT) throws XmlParserException {
        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = factory.newPullParser();
            parser.setInput(new StringReader(xml));
            return parseRoot(parser, classOfT);
        } catch (XmlPullParserException e) {
            throw new XmlParserException("Can't init XmlPullParser");
        } catch (Exception e) {
            throw new XmlParserException("XML parsing failed", e);
        }
    }

    private static <T> T parseRoot(XmlPullParser parser, Class<T> classOfT) throws Exception {
        if (parser.getEventType() != XmlPullParser.START_DOCUMENT) {
            throw new XmlParserException("START_DOCUMENT not found");
        }
        parser.next();
        return parseTag(parser, classOfT);
    }

    private static <T> T parseTag(XmlPullParser parser, Class<T> classOfT) throws Exception {
        T tagInstance = classOfT.newInstance();

        for (Field field : classOfT.getDeclaredFields()) {
            Attribute attribute = getAnnotation(field, Attribute.class);
            if (attribute == null) {
                continue;
            }
            String value = parser.getAttributeValue(null, attribute.name());
            field.setAccessible(true);
            field.set(tagInstance, value);
        }
        parser.next();

        while (parser.getEventType() == XmlPullParser.START_TAG
                || parser.getEventType() == XmlPullParser.TEXT) {
            if (parser.getEventType() == XmlPullParser.TEXT) {
                parseText(parser, tagInstance);
            } else {
                parseSubTag(parser, tagInstance);
            }
        }
        parser.next();

        return tagInstance;
    }

    private static <T> void parseText(XmlPullParser parser, T parent) throws Exception {
        if (parser.getEventType() != XmlPullParser.TEXT) {
            return;
        }
        Field textField = getFieldForText(parent);
        if (textField != null) {
            textField.setAccessible(true);
            textField.set(parent, parser.getText());
        }
        parser.next();
    }

    @SuppressWarnings("unchecked")
    private static <T> void parseSubTag(XmlPullParser parser, T parent) throws Exception {
        if (parser.getEventType() != XmlPullParser.START_TAG) {
            throw new XmlParserException("START_TAG not found");
        }

        String tagName = parser.getName();
        int tagDepth = parser.getDepth();

        Field tagField = getFieldForTag(parent, tagName);
        if (tagField == null) {
            skipTag(parser, tagName, tagDepth);
        } else {
            if (List.class.isAssignableFrom(tagField.getType())) {
                ParameterizedType listGenericType = (ParameterizedType) tagField.getGenericType();
                Class<?> listGenericClass = (Class<?>) listGenericType.getActualTypeArguments()[0];
                Object tag = parseTag(parser, listGenericClass);
                tagField.setAccessible(true);
                List list = (List) tagField.get(parent);
                if (list == null) {
                    list = new ArrayList();
                    tagField.set(parent, list);
                }
                list.add(tag);
            } else {
                Object tag = parseTag(parser, tagField.getType());
                tagField.setAccessible(true);
                tagField.set(parent, tag);
            }
        }
    }

    private static <T> Field getFieldForTag(T parent, String tagName) {
        for (Field field : parent.getClass().getDeclaredFields()) {
            Tag tagAnnotation = getAnnotation(field, Tag.class);
            if (tagAnnotation != null && tagAnnotation.name().equalsIgnoreCase(tagName)) {
                return field;
            }
        }
        return null;
    }

    private static <T> Field getFieldForText(T parent) {
        for (Field field : parent.getClass().getDeclaredFields()) {
            Text textAnnotation = getAnnotation(field, Text.class);
            if (textAnnotation != null) {
                return field;
            }
        }
        return null;
    }

    private static void skipTag(XmlPullParser parser, String name, int depth) throws XmlPullParserException, IOException {
        while (parser.getEventType() != XmlPullParser.END_TAG && !parser.getName().equalsIgnoreCase(name) && parser.getDepth() != depth) {
            parser.next();
        }
        parser.next();
    }


    @SuppressWarnings("unchecked")
    private static <T extends Annotation> T getAnnotation(AnnotatedElement element, Class<? extends Annotation> annotationType) {
        for (Annotation annotation : element.getDeclaredAnnotations()) {
            if (annotationType.isInstance(annotation)) {
                return (T) annotation;
            }
        }
        return null;
    }

}
