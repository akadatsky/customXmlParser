package com.loopme.customparser.vast.model;

import com.loopme.customparser.xml.Attribute;
import com.loopme.customparser.xml.Tag;

public class Vast {

    @Attribute(name = "version")
    private String version;

    @Tag(name = "ad")
    private Ad ad;

    public String getVersion() {
        return version;
    }

}
