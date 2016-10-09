package com.loopme.customparser.vast.model;

import com.loopme.customparser.xml.Attribute;
import com.loopme.customparser.xml.Tag;

public class Vast {

    @Attribute
    private String version;

    @Tag
    private Ad ad;

    public String getVersion() {
        return version;
    }

}
