package com.android.vstecs.eshop.control.myinfo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.vstecs.eshop.R;
import com.android.vstecs.eshop.beans.MessageBean;
import com.android.vstecs.eshop.control.base.BaseAda;


public class MessageAdapter extends BaseAda<MessageBean> {
    public MessageAdapter(Context context) {
        super(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_message_entity, parent, false);
            vh = new ViewHolder(convertView);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        MessageBean bean = getItem(position);

        //设置数据
        vh.message_iv_icon.setImageResource(R.mipmap.ic_launcher);
        vh.message_time.setText(bean.time);
        vh.message_tips_tv.setText(bean.tips);
        vh.message_tv_name.setText(bean.name);
        return convertView;
    }

    class ViewHolder {

       public ImageView message_iv_icon;
       public TextView message_tv_name;
       public TextView message_time;
       public TextView message_tips_tv;

        public ViewHolder(View convertView) {
            message_iv_icon = (ImageView) convertView.findViewById(R.id.message_iv_icon);
            message_tv_name = (TextView) convertView.findViewById(R.id.message_tv_name);
            message_time = (TextView) convertView.findViewById(R.id.message_time);
            message_tips_tv = (TextView) convertView.findViewById(R.id.message_tips_tv);

        }
    }


}
