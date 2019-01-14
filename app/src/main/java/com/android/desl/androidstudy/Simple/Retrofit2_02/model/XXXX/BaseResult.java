package com.android.desl.androidstudy.Simple.Retrofit2_02.model.XXXX;

public class BaseResult<T> {
    private int code;
    private String message;
    private T data;

    public boolean isSuccess() {
        return code == 1000;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
