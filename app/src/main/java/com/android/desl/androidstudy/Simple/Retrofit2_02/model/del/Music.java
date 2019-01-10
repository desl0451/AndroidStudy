package com.android.desl.androidstudy.Simple.Retrofit2_02.model.del;

public class Music {

    private String message;
    private boolean error;
    private Videos videos;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    @Override
    public String toString() {   //重写toString方法，便于观察后来的解析结果
        return "Music{" +
                "message=" + message +
                ", error=" + error +
                '}';
    }


    public Videos getVideos() {
        return videos;
    }

    public void setVideos(Videos videos) {
        this.videos = videos;
    }


}