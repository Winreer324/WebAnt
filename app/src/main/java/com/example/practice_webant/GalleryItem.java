package com.example.practice_webant;

public class GalleryItem {
    private String Caption;
    private String Id;
    private String Url;
    @Override
    public String toString() {
        return Caption;
    }

    public String getCaption() {
        return Caption;
    }

    public void setCaption(String caption) {
        Caption = caption;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
