package com.android.vstecs.eshop.views;

import android.view.View;

import com.android.vstecs.eshop.R;
import com.android.vstecs.eshop.control.base.BaseAct;
import com.android.vstecs.eshop.control.index.activity.SearchActivity;

/**
 * @author zwy
 * @email 16681805@qq.com
 * created on 2016/4/6
 * class description:请输入类描述
 */
public class CommonSearchView {
    private BaseAct baseAct;

    public CommonSearchView(BaseAct baseAct) {
        this.baseAct = baseAct;
    }

    public void init(){
        View view = baseAct.findViewById(R.id.layout_search_cls);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baseAct.showActivity(baseAct, SearchActivity.class);
            }
        });
    }

}
