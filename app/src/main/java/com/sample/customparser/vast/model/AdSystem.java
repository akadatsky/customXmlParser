package com.sample.customparser.vast.model;

import com.sample.customparser.xml.Attribute;
import com.sample.customparser.xml.Text;

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
