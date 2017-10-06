package com.example.liuhe.googlemvpdemo.contract;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.liuhe.googlemvpdemo.R;
import com.example.liuhe.googlemvpdemo.model.localmodel.Model;

/**
 * 　对于Activity的提供的功能也是非常的简单，首先创建Fragment对象并将其添加到Activity当中。
 * 之后创建Presenter对象，并将Fragment也就是View传递到Presenter中。
 */
public class MainActivity extends Activity {

    private LocaPresent present;
    private Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LocaView locaView = new LocaView();

        model = new Model();
        present = new LocaPresent(model, locaView);

    }
}
