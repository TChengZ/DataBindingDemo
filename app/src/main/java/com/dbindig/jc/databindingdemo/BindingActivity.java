package com.dbindig.jc.databindingdemo;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;

public class BindingActivity extends Activity {

    private com.dbindig.jc.databindingdemo.databinding.ActivityBindingBinding bindingData = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindingData = DataBindingUtil.setContentView(this, R.layout.activity_binding);
        bindingData.setTitle("测试");
    }
}
