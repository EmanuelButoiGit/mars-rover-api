package com.mars.rover.responses;

import com.mars.rover.responseClasses.MarsMedia;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverApiResponse {
    List<MarsMedia> media = new ArrayList<>();

    @Override
    public String toString() {
        return "MarsRoverApiResponse{" +
                "media=" + media +
                '}';
    }

    public List<MarsMedia> getMedia() {
        return media;
    }

    public void setMedia(List<MarsMedia> media) {
        this.media = media;
    }
}
