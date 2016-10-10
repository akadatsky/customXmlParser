package com.sample.customparser.vast.model;

import com.sample.customparser.xml.Attribute;
import com.sample.customparser.xml.Tag;

public class Vast {

    @Attribute
    private String version;

    @Tag
    private Ad ad;

    public String getVersion() {
        return version;
    }

    public Ad getAd() {
        return ad;
    }
}
