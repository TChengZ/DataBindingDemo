package com.dbinding.jc.databindingdemo.util;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chenzujie on 2020/9/13.
 */

public class BindingUtil {

    @BindingAdapter("android:src")
    public static void setImageUrl(ImageView view, String url) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(url);
        if(isNum.matches()) {
            view.setImageResource(Integer.valueOf(url));
        } else {
            Glide.with(view.getContext()).load(url).into(view);
        }
    }
}
