package com.loopme.customparser.vast.model;

import com.loopme.customparser.xml.Tag;

public class Linear {

    @Tag
    private Duration duration;

    @Tag
    private TrackingEvents trackingEvents;

    @Tag
    private VideoClicks videoClicks;

    @Tag
    private MediaFiles mediaFiles;

    public Duration getDuration() {
        return duration;
    }

    public TrackingEvents getTrackingEvents() {
        return trackingEvents;
    }

    public VideoClicks getVideoClicks() {
        return videoClicks;
    }

    public MediaFiles getMediaFiles() {
        return mediaFiles;
    }
}
