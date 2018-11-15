package com.example.administrator.titipan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class SlideItemFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.slide_item, container, false);
        ImageView imageView = (ImageView)view.findViewById(R.id.imagebox);
        //$("#section1").find("P")
        imageView.setImageResource(getArguments().getInt("position"));
        return view;
    }


}
