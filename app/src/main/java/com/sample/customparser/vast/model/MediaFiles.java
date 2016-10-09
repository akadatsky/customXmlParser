package com.sample.customparser.vast.model;

import com.sample.customparser.xml.Tag;

import java.util.List;

public class MediaFiles {

    @Tag("MediaFile")
    private List<MediaFile> mediaFiles;

    public List<MediaFile> getMediaFiles() {
        return mediaFiles;
    }

}
