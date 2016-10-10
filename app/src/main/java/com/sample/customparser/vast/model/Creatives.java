package com.sample.customparser.vast.model;

import com.sample.customparser.xml.Tag;

import java.util.List;

public class Creatives {

    @Tag("Creative")
    private List<Creative> creativeList;

    public List<Creative> getCreativeList() {
        return creativeList;
    }
}
