package com.example.liuhe.googlemvpdemo.contract;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by liuhe on 2017/10/5.
 */

public class LocaView extends Fragment implements Contract.View {

    private Contract.Present present;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    @Override
    public void onResume() {
        super.onResume();
        present.start();
    }

    @Override
    public void setTitle(String string) {

    }

    @Override
    public void setMessageText(String string) {

    }

    @Override
    public void setPresent(Contract.Present present) {
        this.present = present;
    }
}
