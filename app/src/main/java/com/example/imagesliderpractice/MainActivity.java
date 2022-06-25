package com.example.imagesliderpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Integer> imagelist = new ArrayList<>();
        List<String> nameslist = new ArrayList<>();

        viewPager2 = findViewById(R.id.viewpager2);

        nameslist.add("Sunset Tree");
        nameslist.add("Panda");
        nameslist.add("Moon");
        nameslist.add("Spiral");
        imagelist.add(R.drawable.image1);
        imagelist.add(R.drawable.image2);
        imagelist.add(R.drawable.image3);
        imagelist.add(R.drawable.image4);

        slideradapter myadapter = new slideradapter(imagelist,nameslist);
        viewPager2.setAdapter(myadapter);
        viewPager2.setPageTransformer(new ZoomOutPageTransformer());
        //for sliding featuer
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }
}