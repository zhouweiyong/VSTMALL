package com.android.vstecs.eshop.control.index.view;

import android.view.LayoutInflater;
import android.view.View;

import com.android.vstecs.eshop.MallApplication;
import com.android.vstecs.eshop.R;
import com.android.vstecs.eshop.control.base.BaseAct;
import com.android.vstecs.eshop.control.viewinteractor.HeaderInteractor;

/**
 * @author zwy
 * @email 16681805@qq.com
 * created on 2016/4/7
 * class description:请输入类描述
 */
public class IndexHeaderView implements HeaderInteractor{
    private BaseAct baseAct;

    public IndexHeaderView(BaseAct baseAct) {
        this.baseAct = baseAct;
    }

    @Override
    public View createHeaderView() {
        return LayoutInflater.from(baseAct).inflate(R.layout.layout_index_header,null);
    }

    @Override
    public void initView(View ParentView) {

    }
}
