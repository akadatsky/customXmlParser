package com.sample.customparser.vast.model;

import com.sample.customparser.xml.Text;

public class Error {

    @Text
    private String text;

    public String getText() {
        return text;
    }
}
