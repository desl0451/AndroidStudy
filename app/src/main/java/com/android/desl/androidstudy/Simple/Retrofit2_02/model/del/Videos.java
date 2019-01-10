package com.android.desl.androidstudy.Simple.Retrofit2_02.model.del;

import java.util.List;

public class Videos {

    private List<Data> data;
    private int totalCount;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}