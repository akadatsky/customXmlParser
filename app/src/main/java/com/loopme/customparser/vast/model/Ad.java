package com.loopme.customparser.vast.model;

import com.loopme.customparser.xml.Attribute;
import com.loopme.customparser.xml.Tag;

public class Ad {

    @Attribute(name = "id")
    private String id;

    @Tag(name = "InLine")
    private InLine inLine;

    public String getId() {
        return id;
    }

    public InLine getInLine() {
        return inLine;
    }
}
