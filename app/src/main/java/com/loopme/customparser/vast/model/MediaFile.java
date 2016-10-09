package com.loopme.customparser.vast.model;

import com.loopme.customparser.xml.Attribute;
import com.loopme.customparser.xml.Text;

public class MediaFile {

    @Attribute("id")
    private String id;

    /**
     * streaming, progressive
     */
    @Attribute("delivery")
    private String delivery;

    @Attribute("type")
    private String type;

    @Attribute("bitrate")
    private int bitrate;

    @Attribute("width")
    private int width;

    @Attribute("height")
    private int height;

    @Attribute("scalable")
    private boolean scalable;

    @Attribute("maintainAspectRatio")
    private boolean maintainAspectRatio;

    @Attribute("apiFramework")
    private String apiFramework;

    @Text
    private String text;

}
