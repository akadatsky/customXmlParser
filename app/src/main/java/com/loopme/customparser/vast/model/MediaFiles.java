package com.loopme.customparser.vast.model;

import com.loopme.customparser.xml.Tag;

import java.util.List;

public class MediaFiles {

    @Tag("MediaFile")
    private List<MediaFile> mediaFiles;

    public List<MediaFile> getMediaFiles() {
        return mediaFiles;
    }

}
