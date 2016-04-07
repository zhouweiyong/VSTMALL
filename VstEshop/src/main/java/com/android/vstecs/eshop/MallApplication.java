package com.android.vstecs.eshop;

import android.app.Application;

/**
 * @author zwy
 * @email 16681805@qq.com
 * created on 2016/4/7
 * class description:请输入类描述
 */
public class MallApplication extends Application {
    private static MallApplication instance;

    public static MallApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
