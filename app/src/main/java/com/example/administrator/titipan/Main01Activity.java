package com.example.administrator.titipan;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class Main01Activity extends Fragment {


    ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_main01, container, false);

        Button button01Fragment = (Button) view.findViewById(R.id.button01);
        button01Fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.main_frame, new MenuActivity());
                fr.commit();
            }
        });

        Button button02Fragment = (Button) view.findViewById(R.id.button02);
        button02Fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.main_frame, new IntroduceActivity());
                fr.commit();

            }
        });

        /*대상 위치 부분을 정의하고 외부 클래스 어댑터를 적용해 구현 */
        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        MyViewpageAdapter myviewpageAdapter = new MyViewpageAdapter(this.getActivity());

        viewPager.setAdapter(myviewpageAdapter);
        return view;
    }


}


