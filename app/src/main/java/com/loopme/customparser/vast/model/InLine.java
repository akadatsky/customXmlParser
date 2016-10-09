package com.loopme.customparser.vast.model;

import com.loopme.customparser.xml.Tag;

import java.util.List;

public class InLine {

    @Tag
    private AdSystem adSystem;

    @Tag
    private Error error;

    @Tag("Impression")
    private List<Impression> impressions;

    @Tag
    private Creatives creatives;

    public AdSystem getAdSystem() {
        return adSystem;
    }

    public Error getError() {
        return error;
    }

    public Creatives getCreatives() {
        return creatives;
    }

    public List<Impression> getImpressions() {
        return impressions;
    }
}
