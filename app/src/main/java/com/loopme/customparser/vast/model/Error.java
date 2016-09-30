package com.loopme.customparser.vast.model;

import com.loopme.customparser.xml.Text;

public class Error {

    @Text
    private String text;

    public String getText() {
        return text;
    }
}
