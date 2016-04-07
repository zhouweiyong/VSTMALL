package com.android.vstecs.eshop.control.myinfo.activity;

import android.view.View;
import android.widget.TextView;

import com.android.vstecs.eshop.R;
import com.android.vstecs.eshop.control.base.BaseAct;

public class SettingActivity extends BaseAct {

    private TextView tv_cache;//缓存大小


    @Override
    public void setRootView() {
        setContentView(R.layout.activity_setting);
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        findViewById(R.id.setting_feedback_rl).setOnClickListener(this);
        findViewById(R.id.setting_service_rl).setOnClickListener(this);
        findViewById(R.id.setting_about_us_rl).setOnClickListener(this);
        findViewById(R.id.setting_clearcash_rl).setOnClickListener(this);
        findViewById(R.id.check_version_tv).setOnClickListener(this);
        tv_cache= (TextView) findViewById (R.id.check_version_tv);
    }

    @Override
    public void widgetClick(View v) {

        switch (v.getId()){
            case R.id.setting_feedback_rl:
                showActivity(aty,FeedbackActivity.class);
                break;
            case R.id.setting_service_rl:
                showToastMsg("service");
                break;
            case R.id.setting_about_us_rl:
                showToastMsg("about");
                break;
            case R.id.setting_clearcash_rl:
                showToastMsg("huancun");
                break;
            case R.id.check_version_tv:
                showToastMsg("banben");
                break;
        }



        super.widgetClick(v);
    }


}
