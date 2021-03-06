package com.android.vstecs.eshop.control.myinfo.activity;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;

import com.android.vstecs.eshop.R;
import com.android.vstecs.eshop.control.base.BaseAct;
import com.android.vstecs.eshop.control.common.TitleBarHelper;
import com.vstecs.android.funframework.utils.StringUtils;

public class ModifyNickNameActivity extends BaseAct {

    private EditText modify_nick_name;
    private String nickName;

    @Override
    public void setRootView() {
        setContentView(R.layout.activity_modify_nick_name);
    }

    @Override
    protected void initData() {
        super.initData();
        nickName=getIntent().getStringExtra(AccountManageActivity.MODIFY_NICK_NAME);
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        TitleBarHelper barHelper=new TitleBarHelper(this, R.string.common_empty, R.string.common_empty, R.string.common_empty);
        barHelper.setTitleMsg("修改昵称");
        barHelper.setRightMsg("确定");
        modify_nick_name= (EditText) findViewById(R.id.modify_nick_name);
        barHelper.setOnRightClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!StringUtils.isEmpty(getInputStr(modify_nick_name))) {
                    Intent intent=new Intent(aty, AccountManageActivity.class);
                    intent.putExtra(AccountManageActivity.MODIFY_NICK_NAME,getInputStr(modify_nick_name));
                    setResult(AccountManageActivity.MODIFY_NICK_NAME_COD,intent);
                    finish();
                }

            }
        });


        if (!StringUtils.isEmpty(nickName)){
            modify_nick_name.setText(nickName);
        }
    }
}
