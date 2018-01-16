package com.shoppalicious;

/**
 * Created by adi on 23/7/16.
 */

import android.app.Application;


public class Shoppalicious extends Application {

    private static Shoppalicious mInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;


    }

    public static synchronized Shoppalicious getInstance() {
        return mInstance;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }
}