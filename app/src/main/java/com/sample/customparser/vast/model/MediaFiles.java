package com.sample.customparser.vast.model;

import com.sample.customparser.xml.Tag;

import java.util.List;

public class MediaFiles {

    @Tag("MediaFile")
    private List<MediaFile> mediaFileList;

    public List<MediaFile> getMediaFileList() {
        return mediaFileList;
    }
}
