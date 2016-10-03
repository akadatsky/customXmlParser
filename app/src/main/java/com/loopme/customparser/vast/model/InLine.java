package com.loopme.customparser.vast.model;

import com.loopme.customparser.xml.Tag;

import java.util.List;

public class InLine {

    @Tag("AdSystem")
    private AdSystem adSystem;

    @Tag("Error")
    private Error error;

    @Tag("Impression")
    private List<Impression> impression;

    @Tag("Creatives")
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

    public List<Impression> getImpression() {
        return impression;
    }
}
