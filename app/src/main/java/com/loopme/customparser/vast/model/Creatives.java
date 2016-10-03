package com.loopme.customparser.vast.model;

import com.loopme.customparser.xml.Tag;

import java.util.List;

public class Creatives {

    @Tag("Creative")
    private List<Creative> creative;

    public List<Creative> getCreative() {
        return creative;
    }
}
