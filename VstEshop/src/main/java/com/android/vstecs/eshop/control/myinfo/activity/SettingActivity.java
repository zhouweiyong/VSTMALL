package com.android.vstecs.eshop.control.myinfo.activity;

import android.app.Dialog;
import android.view.View;
import android.widget.TextView;

import com.android.vstecs.eshop.R;
import com.android.vstecs.eshop.control.base.BaseAct;
import com.android.vstecs.eshop.control.common.TitleBarHelper;
import com.android.vstecs.eshop.utils.MMAlert;

public class SettingActivity extends BaseAct {

    private TextView tv_cache;//缓存大小
    private Dialog coverDialog;


    @Override
    public void setRootView() {
        setContentView(R.layout.activity_setting);
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        new TitleBarHelper(this, R.string.common_empty, R.string.common_empty, R.string.common_empty).setTitleMsg("设置");

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
                coverDialog= MMAlert.createOneChoicAlertNoTitle(this, "15315315", new MMAlert.DialogOnItemClickListener() {
                    @Override
                    public void onItemClickListener(View v, int position) {
                        showToastMsg("fdsaf");
                    }
                });
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
