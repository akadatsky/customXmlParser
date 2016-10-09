package com.loopme.customparser.vast.model;

import com.loopme.customparser.xml.Attribute;
import com.loopme.customparser.xml.Tag;

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
