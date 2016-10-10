package com.sample.customparser.vast.model;

import com.sample.customparser.xml.Tag;

import java.util.List;

public class VideoClicks {

    @Tag("ClickThrough")
    private List<ClickThrough> clickThroughList;

    @Tag("ClickTracking")
    private List<ClickTracking> clickTrackingList;

    public List<ClickThrough> getClickThroughList() {
        return clickThroughList;
    }

    public List<ClickTracking> getClickTrackingList() {
        return clickTrackingList;
    }
}
