package com.loopme.customparser.vast.model;

import com.loopme.customparser.xml.Attribute;
import com.loopme.customparser.xml.Text;

public class AdSystem {

    @Attribute
    private String version;

    @Text
    private String text;

    public String getVersion() {
        return version;
    }

    public String getText() {
        return text;
    }
}
