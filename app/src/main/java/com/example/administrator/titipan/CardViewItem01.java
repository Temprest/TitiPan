package com.example.administrator.titipan;

import android.widget.TextView;

public class CardViewItem01 {
    public int ImageView;
    public String title;
    public String subtitle;

    public CardViewItem01(int imageView, String title, String subtitle) {
        ImageView = imageView;
        this.title = title;
        this.subtitle = subtitle;
    }

    public int getImageView() {
        return ImageView;
    }

    public void setImageView(int imageView) {
        ImageView = imageView;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
