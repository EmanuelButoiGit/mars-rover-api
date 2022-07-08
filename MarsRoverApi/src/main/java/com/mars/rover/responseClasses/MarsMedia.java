package com.mars.rover.responseClasses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsMedia {
    private char date;
    private String explanation;
    @JsonProperty("media_type")
    private char mediaType;
    @JsonProperty("service_version")
    private char serviceVersion;
    private String title;
    private String url;

    public char getDate() {
        return date;
    }

    public void setDate(char date) {
        this.date = date;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public char getMediaType() {
        return mediaType;
    }

    public void setMediaType(char mediaType) {
        this.mediaType = mediaType;
    }

    public char getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(char serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "MarsMedia{" +
                "date=" + date +
                ", explanation='" + explanation + '\'' +
                ", mediaType=" + mediaType +
                ", serviceVersion=" + serviceVersion +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
