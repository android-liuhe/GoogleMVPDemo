package com.example.liuhe.googlemvpdemo.contract;

import android.graphics.PorterDuff;

import com.example.liuhe.googlemvpdemo.model.InterModel;

import java.util.List;

/**
 * Created by liuhe on 2017/10/5.
 */

public class LocaPresent implements Contract.Present, InterModel.LocadModelCallBack {

    private InterModel model;
    private Contract.View locaview;

    public LocaPresent(InterModel model, Contract.View locaview) {
        this.model = model;
        this.locaview = locaview;
        locaview.setPresent(this);
    }

    @Override
    public void setData() {
        //TODO 写数据
    }

    @Override
    public void getData() {
        //TODO 取数据
    }

    @Override
    public void start() {
        getData();
    }

    @Override
    public void onModelLoad() {

    }

    @Override
    public void onModelNotAvailable() {

    }
}
