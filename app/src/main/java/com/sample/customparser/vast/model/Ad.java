package com.sample.customparser.vast.model;

import com.sample.customparser.xml.Attribute;
import com.sample.customparser.xml.Tag;

public class Ad {

    @Attribute
    private String id;

    @Tag
    private InLine inLine;

    public String getId() {
        return id;
    }

    public InLine getInLine() {
        return inLine;
    }
}
