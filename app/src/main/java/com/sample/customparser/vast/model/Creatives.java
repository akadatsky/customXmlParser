package com.sample.customparser.vast.model;

import com.sample.customparser.xml.Tag;

import java.util.List;

public class Creatives {

    @Tag("Creative")
    private List<Creative> creatives;

    public List<Creative> getCreatives() {
        return creatives;
    }
}
