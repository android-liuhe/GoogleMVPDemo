package com.example.liuhe.googlemvpdemo.model.localmodel;

import com.example.liuhe.googlemvpdemo.model.InterModel;

/**
 * Created by liuhe on 2017/10/5.
 */

public class Model implements InterModel {


    @Override
    public void writeModel(LocadModelCallBack callBack) {
        //TODO  写数据


        /**
         * 是否成功都调用回调借口返回
         */
        if (true) {
            callBack.onModelLoad();
        } else {
            callBack.onModelNotAvailable();
        }
    }

    @Override
    public void readModel(LocadModelCallBack callBack) {

        //TODO 读数据

        if (true) {
            callBack.onModelLoad();
        } else {
            callBack.onModelNotAvailable();
        }

    }
}
