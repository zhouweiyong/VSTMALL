package com.android.vstecs.eshop.control.myinfo.activity;

import android.content.Context;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.vstecs.eshop.R;
import com.android.vstecs.eshop.control.base.BaseAct;
import com.android.vstecs.eshop.control.common.TitleBarHelper;
import com.android.vstecs.eshop.views.XWEditText;

import java.util.Timer;
import java.util.TimerTask;


/**
 * @author chenyuan
 * @description：意见反馈
 * @date 2015年11月16日 上午11:25:04
 */
public class FeedbackActivity extends BaseAct {


    private XWEditText feedback_input_et;
    private TextView feedback_max_input_tv;
    private Button btn_submit_feedback;

    @Override
    public void setRootView() {
        setContentView(R.layout.activity_feedback);
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        new TitleBarHelper(this, R.string.common_empty, R.string.common_empty, R.string.common_empty).setTitleMsg("意见反馈");
        feedback_input_et = (XWEditText) findViewById(R.id.feedback_input_et);
        feedback_max_input_tv = (TextView) findViewById(R.id.feedback_max_input_tv);
        btn_submit_feedback = (Button) findViewById(R.id.btn_submit_feedback);
        btn_submit_feedback.setOnClickListener(this);
        feedback_input_et.addTextChangedListener(new MyTextChanged());
        showInput(feedback_input_et);


    }

    @Override
    public void widgetClick(View v) {
        super.widgetClick(v);
        if (v.getId() == R.id.btn_submit_feedback) {
            if (TextUtils.isEmpty(getInputStr(feedback_input_et))) {
                showToastMsg("反馈内容不能为空");
                return;
            }
            submitFeedBack();
        }
    }

    private void submitFeedBack() {

        showLoadingDialog(getString(R.string.common_loading));
//        JSONWrapAjaxParams ajaxParams = new JSONWrapAjaxParams();
//        getUserId(ajaxParams);
//        ajaxParams.putCommonTypeParam("feedbackType", 5 + "");//反馈类型：1、购买功能2、账号功能3、搜索问题4、邮件订阅问题5、其它问题6、商家反馈
//
//        ajaxParams.putCommonTypeParam("source", 2 + "");//数据来源1： 网站；2：安卓;3：IOS
//        ajaxParams.putCommonTypeParam("feedBackContent", getInputStr(feedback_input_et));
//
//        FormResultRequest<String> getResultRequest = new FormResultRequest<String>(
//                UrlConstants.MEMBERFEEDBACK, submitFeedBackReq, this,
//                new TypeToken<RequestResult<String>>() {
//                }.getType());
//        getResultRequest.setRequestParams(ajaxParams);
//        executeRequest(getResultRequest);

    }

//    private void getUserId(JSONWrapAjaxParams ajaxParams) {
//        long u_id = GlobalApp.getInstance().getUserId();
//        ajaxParams.putCommonTypeParam("userId", u_id);
//
//    }

//    private Response.Listener<RequestResult<String>> submitFeedBackReq = new Response.Listener<RequestResult<String>>() {
//
//        @Override
//        public void onResponse(RequestResult<String> result) {
//            if (result.flag == 1) {
//                finish();
//            }
//            showToastMsg(result.msg);
//            dismissLoadingDialog();
//
//        }
//    };

//    @Override
//    public void onErrorResponse(VolleyError error) {
//        // TODO Auto-generated method stub
//        super.onErrorResponse(error);
//        // enshipLv.onRefreshComplete();
//        dismissLoadingDialog();
//    }


    private class MyTextChanged implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count,
                                      int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before,
                                  int count) {
            feedback_input_et.setSelection(s.toString().length());
            if (getInputStr(feedback_input_et).length() > 1000) {
                feedback_max_input_tv.setText(Html.fromHtml("<font color=#f73a3a>" + (1000 - getInputStr(feedback_input_et).length()) + "</font>/" + 1000));
                feedback_input_et.setText(getInputStr(feedback_input_et).subSequence(0, 1000));
            } else {
                feedback_max_input_tv.setText(Html.fromHtml("" + (1000 - getInputStr(feedback_input_et).length()) + "/" + 1000)
                );
            }
        }

        @Override
        public void afterTextChanged(Editable s) {
//            feedback_input_et.setSelection(s.toString().length());
        }

    }

    public void showInput(final EditText et) {

        Timer timer = new Timer();

        timer.schedule(new TimerTask()

                       {

                           public void run()

                           {

                               InputMethodManager inputManager =

                                       (InputMethodManager) et.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);

                               inputManager.showSoftInput(et, 0);

                           }

                       },

                998);
    }
}

