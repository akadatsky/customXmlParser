package com.loopme.customparser.vast.model;

import com.loopme.customparser.xml.Attribute;
import com.loopme.customparser.xml.Tag;

public class Creative {

    @Attribute("id")
    private String id;

    @Attribute("sequence")
    private String sequence;

    @Tag("Linear")
    private Linear linear;

    @Tag("CompanionAds")
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
