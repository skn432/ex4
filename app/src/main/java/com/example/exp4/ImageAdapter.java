package com.example.exp4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }
    public int getCount() {
        return mThumbIds.length;
    }
    public Object getItem(int position) {
        return null;
    }
    public long getItemId(int position) {
        return 0;
    }
    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(500, 500));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(100, 50, 50, 50);
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground,
            R.drawable.app, R.drawable.whatsapp,
            R.drawable.appstore, R.drawable.googledrive,
            R.drawable.instagram, R.drawable.social1,
            R.drawable.social2, R.drawable.social3,
            R.drawable.instagram,
            // adding all the images
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground,
            R.drawable.app, R.drawable.whatsapp,
            R.drawable.appstore, R.drawable.googledrive,
            R.drawable.instagram, R.drawable.social1,
            R.drawable.social2, R.drawable.social3,
            R.drawable.instagram,
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground,

    };
}

