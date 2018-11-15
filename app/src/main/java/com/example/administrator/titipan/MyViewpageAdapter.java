package com.example.administrator.titipan;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyViewpageAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images = {R.drawable.new_bread, R.drawable.choice_bread, R.drawable.origin_bread};
    private String[] texts = {"       신제품 매콩 출시", "판매율 1위   초코식빵", "건강한 맛   우유 식빵"};

    public MyViewpageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_item, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imagebox);
        TextView textView = (TextView) view.findViewById(R.id.textbox);

        imageView.setImageResource(images[position]);
        //String text = (position + 1) +"/" + images.length;
        textView.setText(texts[position]);

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);

        return view;
    }

    /*인스턴트화한 메모리 제거 end역할*/
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}