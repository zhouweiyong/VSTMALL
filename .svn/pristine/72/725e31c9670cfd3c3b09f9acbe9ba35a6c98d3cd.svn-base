package com.android.vstecs.eshop.control.myinfo.activity;

import android.app.Dialog;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.vstecs.eshop.R;
import com.android.vstecs.eshop.control.base.BaseAct;
import com.android.vstecs.eshop.views.RoundImageView;

public class AccountManageActivity extends BaseAct {


    private RelativeLayout info_details_user_icon_rl, info_details_nick_name_rl, info_details_goods_address_rl, info_details_account_safe_rl;
    private RoundImageView riv_info_details_user_icon;
    private TextView info_details_nick_name_tv;

    private static final String IMG_PATH = "img_path";
    private Dialog coverDialog;
    private String mImgPath;

    @Override
    public void setRootView() {
        setContentView(R.layout.activity_account_manage);
    }



    @Override
    protected void initWidget() {
        super.initWidget();

        findViewById(R.id.info_details_user_icon_rl).setOnClickListener(this);
        findViewById(R.id.info_details_nick_name_rl).setOnClickListener(this);
        findViewById(R.id.info_details_goods_address_rl).setOnClickListener(this);
        findViewById(R.id.info_details_account_safe_rl).setOnClickListener(this);

        riv_info_details_user_icon = (RoundImageView) findViewById(R.id.riv_info_details_user_icon);
        info_details_nick_name_tv = (TextView) findViewById(R.id.info_details_nick_name_tv);
    }



    @Override
    public void widgetClick(View v) {
        super.widgetClick(v);
        switch (v.getId()) {
            case R.id.info_details_user_icon_rl:
//                choosingWayOfPictures();
                break;
            case R.id.info_details_nick_name_rl:
                showActivity(aty, ModifyNickNameActivity.class);
                break;
            case R.id.info_details_goods_address_rl:
                showActivity(aty, GoodsAddressActivity.class);
                    break;
            case R.id.info_details_account_safe_rl:
                showActivity(aty, AccountSafeActivity.class);
                break;
        }
    }



}
