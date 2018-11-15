package com.example.administrator.titipan;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MapActivity extends Fragment {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         view = inflater.inflate(R.layout.activity_map, container, false);

        Button btn01 = (Button) view.findViewById(R.id.mapButton_01);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(0);
            }
        });

        Button btn02 = (Button) view.findViewById(R.id.mapButton_02);
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(1);
            }
        });

        return view;
    }

    private void changeView(int index) {
        RelativeLayout map_Image_01 = (RelativeLayout) view.findViewById(R.id.midImage1);
        RelativeLayout map_Image_02 = (RelativeLayout) view.findViewById(R.id.midImage2);

        switch (index){
            case 0:
                map_Image_01.setVisibility(View.VISIBLE);
                map_Image_02.setVisibility(View.INVISIBLE);
                break;
            case 1:
                map_Image_01.setVisibility(View.INVISIBLE);
                map_Image_02.setVisibility(View.VISIBLE);
                break;
        }
    }


}
