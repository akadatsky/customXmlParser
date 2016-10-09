package com.loopme.customparser.vast.model;

import com.loopme.customparser.xml.Attribute;
import com.loopme.customparser.xml.Tag;

public class Creative {

    @Attribute
    private String id;

    @Attribute
    private String sequence;

    @Tag
    private Linear linear;

    @Tag
    private CompanionAds companionAds;

    public String getId() {
        return id;
    }

    public String getSequence() {
        return sequence;
    }

    public Linear getLinear() {
        return linear;
    }

    public CompanionAds getCompanionAds() {
        return companionAds;
    }
}
