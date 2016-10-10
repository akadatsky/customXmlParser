package com.sample.customparser.vast.model;

import com.sample.customparser.xml.Attribute;
import com.sample.customparser.xml.Tag;

public class Companion {

    @Attribute
    private String id;

    @Attribute
    private int width;

    @Attribute
    private int height;

    @Attribute
    private int expandedWidth;

    @Attribute
    private int expandedHeight;

    @Attribute
    private String apiFramework;

    @Tag
    private StaticResource staticResource;

    @Tag
    private TrackingEvents trackingEvents;

    @Tag
    private CompanionClickThrough companionClickThrough;

    @Tag
    private CompanionClickTracking companionClickTracking;

    public String getId() {
        return id;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getExpandedWidth() {
        return expandedWidth;
    }

    public int getExpandedHeight() {
        return expandedHeight;
    }

    public String getApiFramework() {
        return apiFramework;
    }

    public StaticResource getStaticResource() {
        return staticResource;
    }

    public TrackingEvents getTrackingEvents() {
        return trackingEvents;
    }

    public CompanionClickThrough getCompanionClickThrough() {
        return companionClickThrough;
    }
}
