package com.loopme.customparser.vast.model;

import com.loopme.customparser.xml.Tag;

import java.util.List;

public class Creatives {

    @Tag("Creative")
    private List<Creative> creatives;

    public List<Creative> getCreatives() {
        return creatives;
    }
}
