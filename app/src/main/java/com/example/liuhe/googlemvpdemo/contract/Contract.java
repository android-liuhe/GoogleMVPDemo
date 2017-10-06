package com.example.liuhe.googlemvpdemo.contract;

import com.example.liuhe.googlemvpdemo.BasePresenter;
import com.example.liuhe.googlemvpdemo.BaseView;

/**
 * Created by liuhe on 2017/10/5.
 */

public interface Contract {


    interface Present extends BasePresenter{

        void setData();
        void getData();

    }

    interface View extends BaseView<Present>{
        void setTitle(String string);
        void setMessageText(String string);
    }

}
