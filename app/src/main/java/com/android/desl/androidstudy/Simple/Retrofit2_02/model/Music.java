package com.android.desl.androidstudy.Simple.Retrofit2_02.model;

import java.util.List;

public class Music {

    private long id;
    private String title;
    private String headImg;
    private String duration;
    private boolean sh;
    private List<Artists> artists;
    private String valueName;
    private String value;
    private String hltitle;
    private String pubDate;
    private long userId;
    private String userName;
    private String userHeadImg;
    private String videoType;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setSh(boolean sh) {
        this.sh = sh;
    }

    public boolean getSh() {
        return sh;
    }

    public void setArtists(List<Artists> artists) {
        this.artists = artists;
    }

    public List<Artists> getArtists() {
        return artists;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setHltitle(String hltitle) {
        this.hltitle = hltitle;
    }

    public String getHltitle() {
        return hltitle;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserHeadImg(String userHeadImg) {
        this.userHeadImg = userHeadImg;
    }

    public String getUserHeadImg() {
        return userHeadImg;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getVideoType() {
        return videoType;
    }

    public static class Artists {

        private int id;
        private String name;
        private String hlName;

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setHlName(String hlName) {
            this.hlName = hlName;
        }

        public String getHlName() {
            return hlName;
        }

    }
}