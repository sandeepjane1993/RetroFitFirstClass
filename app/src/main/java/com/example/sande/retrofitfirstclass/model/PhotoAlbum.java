package com.example.sande.retrofitfirstclass.model;

import com.google.gson.annotations.SerializedName;

public class PhotoAlbum {

    @SerializedName("albumId")
    int albumId;
    @SerializedName("id")
    int id;
    @SerializedName("title")
    String title;
    @SerializedName("url")
    String imageUrl;
    @SerializedName("thumbnailUrl")
    String thumbnail;

    public PhotoAlbum(int albumId, int id, String title, String imageUrl, String thumbnail) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.thumbnail = thumbnail;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
