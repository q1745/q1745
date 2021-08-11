package com.bw.zzq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.bw.zzq.databinding.ActivitySecondBinding;

import java.util.ArrayList;



public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_second);

        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");


        ActivitySecondBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_second);
        viewDataBinding.setUu(new User("老柴","吃屁"));
        viewDataBinding.setIndex(0);
        viewDataBinding.setList(list);
    }
}