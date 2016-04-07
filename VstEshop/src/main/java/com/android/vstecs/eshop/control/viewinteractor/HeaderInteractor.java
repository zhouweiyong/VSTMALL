package com.android.vstecs.eshop.control.viewinteractor;

import android.view.View;


/**
 * @author zwy
 * @email 16681805@qq.com
 * created on 2016/4/7
 * interface description:请输入接口描述
 */
public interface HeaderInteractor {
    //获取头部布局
    View createHeaderView();
    //初始化布局
    void initView(View Parent);

}
