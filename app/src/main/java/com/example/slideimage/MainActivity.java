package com.example.slideimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private SliderAdapter slideAdapter;
    private LinearLayout dotlayout;
   // private TextView[] dots;
   // private int[]layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager= findViewById(R.id.viewpagerId);
        slideAdapter = new SliderAdapter(this);
        viewPager.setAdapter(slideAdapter);

      //  addBottomsdot(0);
    }

//    private void addBottomsdot( int currentpage) {
//        dots = new TextView[layout.length];
//        int[] colorsActive = getResources().getIntArray(R.array.array_dot_active);
//        int[] colorsInactive = getResources().getIntArray(R.array.array_dot_inactive);
//
//
//        dotlayout.removeAllViews();
//        for (int i = 0; i < dots.length; i++) {
//            dots[i] = new TextView(this);
//            dots[i].setText(Html.fromHtml("&#8226;"));
//            dots[i].setTextSize(35);
//            dots[i].setTextColor(colorsInactive[currentpage]);
//            dotlayout.addView(dots[i]);
//        }
//
//        if (dots.length > 0)
//            dots[currentpage].setTextColor(colorsActive[currentpage]);
//
//    }
}
