package com.example.administrator.titipan;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MenuActivity extends  Fragment{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_menu, container, false);

        RecyclerView view = (RecyclerView) v.findViewById(R.id.Recycler_View);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        MenuAdapter menuAdapter = new MenuAdapter();
        view.setLayoutManager(layoutManager);
        view.setAdapter(menuAdapter);


        return v;
    }
}
