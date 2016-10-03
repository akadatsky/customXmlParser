package com.loopme.customparser.vast.model;

import com.loopme.customparser.xml.Attribute;
import com.loopme.customparser.xml.Tag;

public class Vast {

    @Attribute("version")
    private String version;

    @Tag("ad")
    private Ad ad;

    public String getVersion() {
        return version;
    }

}
