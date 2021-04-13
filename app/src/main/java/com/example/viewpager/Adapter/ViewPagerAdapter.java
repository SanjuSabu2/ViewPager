package com.example.viewpager.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.viewpager.Model.ResponseArray;
import com.example.viewpager.R;

import java.util.ArrayList;

public class ViewPagerAdapter extends PagerAdapter {
    ArrayList<ResponseArray> myimage;
    Context context;
    LayoutInflater layoutInflater;

    public ViewPagerAdapter(ArrayList<ResponseArray> myimage, Context context, LayoutInflater layoutInflater) {
        this.myimage = myimage;
        this.context = context;
        this.layoutInflater = layoutInflater;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View itemView = layoutInflater.inflate(R.layout.item, container, false);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageViewMain);
        return super.instantiateItem(container, position);
        imageView.setImageResource(Integer.parseInt(myimage.get(position).getBannerImages()));

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.destroyItem(container, position, object);
    }

    @Override
    public int getCount() {
        return myimage.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((LinearLayout) object);
    }
}
