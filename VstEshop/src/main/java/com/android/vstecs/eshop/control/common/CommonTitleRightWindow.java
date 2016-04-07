package com.android.vstecs.eshop.control.common;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.vstecs.eshop.R;
import com.android.vstecs.eshop.control.main.MainActivity;


/**
 * @author chenyuan
 * @date：2015年8月13日,下午3:59:13
 * @describe:标题的右侧弹出框
 */
public class CommonTitleRightWindow implements View.OnClickListener {

    private Activity act;
    private PopupWindow popupWindow;

    private TextView more_message_tv;
    private TextView more_has_message_tv;

    public CommonTitleRightWindow(Activity activity) {
        this.act = activity;
        initWindow();
    }

    /**
     * 初始化popwindow包括属性设置，数据封装，视图添加
     */
    private void initWindow() {
        View window = View.inflate(act, R.layout.item_title_evaluate_content, null);
        more_message_tv = (TextView) window.findViewById(R.id.more_message_tv);
        more_message_tv.setOnClickListener(this);
        more_has_message_tv = (TextView) window.findViewById(R.id.more_has_message_tv);
        more_has_message_tv.setOnClickListener(this);

//        if (new DindanDbHelper().getUnUsedableCountNum() > 0){
//            more_message_tv.setVisibility(View.GONE);
//            more_has_message_tv.setVisibility(View.VISIBLE);
//        }else{
//            more_message_tv.setVisibility(View.VISIBLE);
//            more_has_message_tv.setVisibility(View.GONE);
//        }

        window.findViewById(R.id.more_home_tv).setOnClickListener(this);
        popupWindow = new PopupWindow(window, LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.setFocusable(true);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.more_has_message_tv:
            case R.id.more_message_tv:
                dismissWindow();
//                Intent intent2 = new Intent(act, DindanActivity.class);
//                act.startActivity(intent2);
                break;

            case R.id.more_home_tv:
                dismissWindow();
                Intent intent = new Intent(act, MainActivity.class);
                act.startActivity(intent);
                break;
        }
    }

    /**
     * @author yy
     * @date 2015年8月13日, 下午5:53:33
     */
    private void dismissWindow() {
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
    }

    /**
     * @author yy
     * @date 2015年8月13日, 下午5:08:22
     */
    public void showWindow(View anchor) {
        dismissWindow();
        RelativeLayout layout = (RelativeLayout) anchor.getParent();
        int xoff = layout.getWidth() / 2 + anchor.getWidth()/3;
        popupWindow.showAsDropDown(layout, xoff, 0);
    }

    /**
     *
     * 显示在某个控件的左下角
     * @param anchor 菜单将显示在这个控件下方
     * @param xOff 相对于控件左下角 的 水平方向偏移量
     * @param yOff 相对于控件左下角 的 竖直方向偏移量
     */
    public void showWindow(View anchor,int xOff, int yOff) {
        dismissWindow();
        popupWindow.showAsDropDown(anchor, xOff, yOff);
    }
}
