package com.sample.customparser.vast.model;

import com.sample.customparser.xml.Tag;

import java.util.List;

public class CompanionAds {

    @Tag("Companion")
    private List<Companion> companionList;

    public List<Companion> getCompanionList() {
        return companionList;
    }
}
