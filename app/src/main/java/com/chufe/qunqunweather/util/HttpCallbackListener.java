package com.chufe.qunqunweather.util;

/**
 * Created by chufe on 2016/11/10.
 */

public interface HttpCallbackListener {

    void onFinish(String response);
    void onError(Exception e);
}
