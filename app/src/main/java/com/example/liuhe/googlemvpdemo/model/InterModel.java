package com.example.liuhe.googlemvpdemo.model;

import java.util.List;

/**
 * Created by liuhe on 2017/10/5.
 */

public interface InterModel {

    interface LocadModelCallBack{
        void onModelLoad();
        void onModelNotAvailable();
    }

    void writeModel(LocadModelCallBack callBack);
    void readModel(LocadModelCallBack callBack);

}
