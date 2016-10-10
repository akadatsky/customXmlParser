package com.sample.customparser.vast.model;

import com.sample.customparser.xml.Attribute;
import com.sample.customparser.xml.Text;

public class StaticResource {

    @Attribute
    private String creativeType;

    @Text
    private String text;

    public String getText() {
        return text;
    }

    public String getCreativeType() {
        return creativeType;
    }
}
