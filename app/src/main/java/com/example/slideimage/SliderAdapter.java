package com.example.slideimage;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;

    //Image List

    public int[] image= {R.drawable.food1,R.drawable.food2,R.drawable.food3};

    //list of title

    public String[] title={"First Image", "Second Image" , "Third Image"};

    //list of description
    public String[] desc={"Description 1","Description 2","Description 3"};

    //list of background Color

//    public int[] list_backgroundColor = {
//            Color.rgb(55,55,55),
//            Color.rgb(239,85,85),
//            Color.rgb(110,49,89)
//    };



    public SliderAdapter(Context context){

        this.context= context;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

container.removeView ((LinearLayout)object);
//        super.destroyItem(container, position, object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
//        return super.instantiateItem(container, position);
        inflater= (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view= inflater.inflate(R.layout.slider,container,false);

        LinearLayout linearLayout = view.findViewById(R.id.slideLineralayoutId);
        ImageView imageView =  view.findViewById(R.id.sliderimg);
        TextView textView = view.findViewById(R.id.titleId);
        TextView textView1 = view.findViewById(R.id.descId);
      //  linearLayout.setBackgroundColor(list_backgroundColor[position]);

        imageView.setImageResource(image[position]);
        textView.setText(title[position]);
        textView1.setText(desc[position]);
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view==(LinearLayout)object);
    }
}
