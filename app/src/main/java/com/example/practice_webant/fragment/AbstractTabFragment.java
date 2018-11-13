package com.example.practice_webant.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

public class AbstractTabFragment extends Fragment {

    private  String title;
    private  int img;
    protected View view;
    protected Context context;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
