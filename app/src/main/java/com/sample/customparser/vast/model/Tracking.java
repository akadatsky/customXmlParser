package com.sample.customparser.vast.model;

import com.sample.customparser.xml.Attribute;
import com.sample.customparser.xml.Text;

public class Tracking {

    @Attribute
    private String event;

    @Attribute
    private String offset;

    @Text
    private String text;

    public String getEvent() {
        return event;
    }

    public String getOffset() {
        return offset;
    }

    public String getText() {
        return text;
    }
}
