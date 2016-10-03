package com.loopme.customparser.vast.model;

import com.loopme.customparser.xml.Tag;

public class Linear {

    @Tag("Duration")
    private Duration duration;

    @Tag("TrackingEvents")
    private TrackingEvents trackingEvents;

    @Tag("VideoClicks")
    private VideoClicks videoClicks;

    @Tag("MediaFiles")
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
