package com.sample.customparser.vast.model;

import com.sample.customparser.xml.Tag;

import java.util.List;

public class TrackingEvents {

    @Tag("Tracking")
    private List<Tracking> trackingList;

    public List<Tracking> getTrackingList() {
        return trackingList;
    }
}
