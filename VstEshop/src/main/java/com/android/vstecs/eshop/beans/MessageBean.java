package com.android.vstecs.eshop.beans;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by user on 2016/4/6.
 */
public class MessageBean implements Serializable{

    public String name;
    public String time;
    public String tips;
    public String imgUrl;

    private ArrayList<MessageBean> datas=new ArrayList<MessageBean>();

    public ArrayList<MessageBean> getData(){

        for (int i = 0; i < 10; i++) {
            MessageBean bean=new MessageBean();
            bean.name="chen"+i;
            bean.time="2016060"+i;
            bean.tips="你却说花花世界不必当真";
            datas.add(bean);
        }
        return datas;
    }


}
