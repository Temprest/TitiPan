package com.example.administrator.titipan;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private ArrayList<CardViewItem01> cardViewItem01s = new ArrayList<>();

    public MenuAdapter(){
        cardViewItem01s.add(new CardViewItem01(R.drawable.menu_1, "매콩", "11가지의 천연 향신료로 깊고 풍부한 티티팬만의 스파이시 칠리빵"));
        cardViewItem01s.add(new CardViewItem01(R.drawable.menu_02_chocolate, "초코 식빵", "진한 초콜릿을 넣어 반죽한 최고 품질의 초코 식빵"));
        cardViewItem01s.add(new CardViewItem01(R.drawable.menu_03_milk, "우유 식빵", "유기농 우유와 재료를 엄선해 만든 티티팬 우유 식빵"));
        cardViewItem01s.add(new CardViewItem01(R.drawable.menu_04_pumpkin, "단호박 식빵", "단호박의 단맛이 듬뿍, 단호박 식빵"));
        cardViewItem01s.add(new CardViewItem01(R.drawable.menu_05_bacon, "먹물베이컨 식빵", "오징어 먹물로 빚은 반죽 안에 베이컨까지! 먹물 베이컨 식빵"));
        cardViewItem01s.add(new CardViewItem01(R.drawable.menu_06_nut, "밤 식빵", "달달한 밤이 잔뜩 들어간 밤 식빵"));
        cardViewItem01s.add(new CardViewItem01(R.drawable.menu_07_blueberry, "블루베리 식빵", "보라빛 블루베리로 촉촉하게, 블루베리 식빵"));
        cardViewItem01s.add(new CardViewItem01(R.drawable.menu_08_cinnamon, "시나몬 식빵", "향긋한 시나몬 향을 품은 단맛, 시나몬 식빵"));
        cardViewItem01s.add(new CardViewItem01(R.drawable.menu_09_cheese, "치즈 식빵", "식빵 속에 치즈가? 치즈 식빵"));
        cardViewItem01s.add(new CardViewItem01(R.drawable.menu_10_cranberry, "크랜베리 식빵", "항균력 1위의 건강열매, 상큼한 크렌베리 식빵"));
        cardViewItem01s.add(new CardViewItem01(R.drawable.menu_11_redbean, "팥 식빵", "팥앙금이 잔뜩 들어간 팥 식빵"));
        cardViewItem01s.add(new CardViewItem01(R.drawable.menu_12_herv, "허브 치즈 식빵", "향긋한 허브와 치즈의 조합, 허브 치즈 식빵"));
        cardViewItem01s.add(new CardViewItem01(R.drawable.menu_13_nutgrain, "호두 잡곡 식빵", "건강 식빵의 최고봉! 호두 잡곡 식빵"));

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.firstpage, viewGroup, false);
        return new Rowcell(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        ((Rowcell)viewHolder).imageView.setImageResource(cardViewItem01s.get(position).ImageView);
        ((Rowcell)viewHolder).title.setText(cardViewItem01s.get(position).title);
        ((Rowcell)viewHolder).subtitle.setText(cardViewItem01s.get(position).subtitle);

    }

    @Override
    public int getItemCount() {
        return cardViewItem01s.size();
    }

    private class Rowcell extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView title;
        public TextView subtitle;

        public Rowcell(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.ViewImage1);
            title = (TextView) view.findViewById(R.id.ViewText1);
            subtitle = (TextView) view.findViewById(R.id.ViewText2);
        }
    }
}
