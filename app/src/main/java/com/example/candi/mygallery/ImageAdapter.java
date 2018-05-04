package com.example.candi.mygallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by candi on 5/3/2018.
 */

public class ImageAdapter extends BaseAdapter{
    private Context context;

    public  Integer[] images = {
            R.drawable.a1, R.drawable.a2,
            R.drawable.a3, R.drawable.a4,
            R.drawable.a5, R.drawable.a6,
            R.drawable.a7, R.drawable.a8,
            R.drawable.a9, R.drawable.a10,
            R.drawable.a11, R.drawable.a12,
            R.drawable.a13, R.drawable.a14,
    };

    public ImageAdapter(Context c){
        this.context = c;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return images[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(240,240));
        return imageView;
    }
}
