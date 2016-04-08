package com.android.vstecs.eshop.control.myinfo.activity;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.vstecs.eshop.R;
import com.android.vstecs.eshop.control.base.BaseAct;
import com.android.vstecs.eshop.control.common.Constant;
import com.android.vstecs.eshop.control.common.TitleBarHelper;
import com.android.vstecs.eshop.utils.ImageTools;
import com.android.vstecs.eshop.utils.MMAlert;
import com.android.vstecs.eshop.views.RoundImageView;
import com.vstecs.android.funframework.utils.StringUtils;

import java.io.File;

public class AccountManageActivity extends BaseAct {


    private RelativeLayout info_details_user_icon_rl, info_details_nick_name_rl, info_details_goods_address_rl, info_details_account_safe_rl;
    private RoundImageView riv_info_details_user_icon;
    private TextView info_details_nick_name_tv;

    private static final String IMG_PATH = "img_path";
    private Dialog coverDialog;
    private String mImgPath;

    public static int MODIFY_NICK_NAME_COD=1000;
    public static String MODIFY_NICK_NAME="modify_nick_name";
    private File picFile;
    private File tempFile;
    private static final int ACTIVITY_RESULT_CROPCAMARA_WITH_DATA = 1;
    private static final int ACTIVITY_RESULT_CROPIMAGE_WITH_DATA = 2;

    @Override
    public void setRootView() {
        setContentView(R.layout.activity_account_manage);
    }



    @Override
    protected void initWidget() {
        super.initWidget();

        new TitleBarHelper(this, R.string.common_empty, R.string.common_empty, R.string.common_empty).setTitleMsg("账户管理");
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
                choosingWayOfPictures();
                break;
            case R.id.info_details_nick_name_rl:
                showActivity(aty, ModifyNickNameActivity.class);
                Intent intent=new Intent(aty, ModifyNickNameActivity.class);
                intent.putExtra(MODIFY_NICK_NAME,info_details_nick_name_tv.getText().toString());
                startActivityForResult(intent, MODIFY_NICK_NAME_COD);
                break;
            case R.id.info_details_goods_address_rl:
                showActivity(aty, GoodsAddressActivity.class);
                    break;
            case R.id.info_details_account_safe_rl:
                showActivity(aty, AccountSafeActivity.class);
                break;
        }
    }

    private void choosingWayOfPictures() {
        coverDialog = MMAlert.createTwoChoicAlertNoTitle(this, R.string.common_camera, R.string.common_gallery, new MMAlert.DialogOnItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {
                switch (position) {
                    case 0:// 拍照
                        takePhoto();
                        break;
                    case 1:// 从相册选择
                        selectPhoto();
                        break;
                    default:
                        break;
                }
            }
        });
        coverDialog.show();
    }

    private void takePhoto() {
        if (!ImageTools.isSDCardExist()) {
            showToastMsg("sd卡不可用");
            return;
        }
        Intent cameraIntent = null;
        picFile = ImageTools.initTempFile(aty);
        cameraIntent = ImageTools.getTakeCameraIntent(Uri.fromFile(picFile));
        startActivityForResult(cameraIntent, ACTIVITY_RESULT_CROPCAMARA_WITH_DATA);
    }

    private void selectPhoto() {
        Intent photoIntent = null;
        picFile = ImageTools.initTempFile(aty);
        photoIntent = ImageTools.cropPhotoOfCompressFromGalleryIntent2(Uri.fromFile(picFile));
        startActivityForResult(photoIntent, ACTIVITY_RESULT_CROPIMAGE_WITH_DATA);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode!=RESULT_OK)return;
        if (requestCode==MODIFY_NICK_NAME_COD){
            if (data!=null){
                info_details_nick_name_tv.setText(data.getStringExtra(MODIFY_NICK_NAME));
            }
        }else if(requestCode==ACTIVITY_RESULT_CROPCAMARA_WITH_DATA){
            showToastMsg("启动裁剪");
            Intent intent = ImageTools.cropPhotoOfCompressIntent(Uri.fromFile(picFile));
            startActivityForResult(intent, ACTIVITY_RESULT_CROPIMAGE_WITH_DATA);

        }else if(requestCode==ACTIVITY_RESULT_CROPIMAGE_WITH_DATA){
            if (null == data) {
                return;
            }
            if (picFile == null) {
                showToastMsg("选择头像失败");
                return;
            }
            if (TextUtils.isEmpty(picFile.toString()) || !picFile.exists()) {
                showToastMsg("没有选择到图片");
                return;
            }
//                uploadHd();
        }


    }





}
