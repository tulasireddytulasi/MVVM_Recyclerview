package com.example.mvvm_recyclerview;

import android.databinding.BindingAdapter;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DataModel {
    public String name, image;
    public DataModel(String name,String image){
        this.name = name;
        this.image = image;
    }

    @BindingAdapter({"imageUrl"})
    public static void setProfileImage(ImageView imageView, String image){
        Glide.with(imageView.getContext())
                .load(image)
                .apply(new RequestOptions().circleCrop())
                .into(imageView);
    }
}

