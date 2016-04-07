package com.android.vstecs.eshop.control.myinfo.activity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.android.vstecs.eshop.R;
import com.android.vstecs.eshop.beans.MessageBean;
import com.android.vstecs.eshop.control.base.BaseAct;
import com.android.vstecs.eshop.control.myinfo.adapter.MessageAdapter;
import com.android.vstecs.eshop.views.swipemenulistview.PullToSwipeMenuListView;
import com.android.vstecs.eshop.views.swipemenulistview.SwipeMenu;
import com.android.vstecs.eshop.views.swipemenulistview.SwipeMenuCreator;
import com.android.vstecs.eshop.views.swipemenulistview.SwipeMenuItem;
import com.android.vstecs.eshop.views.swipemenulistview.SwipeMenuListView;
import com.vstecs.android.funframework.utils.DensityUtils;

public class MessageActivity extends BaseAct {


    private PullToSwipeMenuListView ptrlv_messages;
    private MessageAdapter adapter;
    private MessageBean bean = new MessageBean();

    @Override
    public void setRootView() {
        setContentView(R.layout.activity_message);
    }

    @Override
    protected void initWidget() {
        super.initWidget();
//        ptrlv_messages = (PullToSwipeMenuListView) findViewById(R.id.ptrlv_messages);
//        adapter = new MessageAdapter(this);
//        ptrlv_messages.setAdapter(adapter);
//        adapter.setGroup(bean.getData());
//
//        SwipeMenuCreator creator = new SwipeMenuCreator() {
//
//            @Override
//            public void create(SwipeMenu menu) {
//                SwipeMenuItem deleteItem = new SwipeMenuItem(
//                        aty);
//                deleteItem.setBackground(new ColorDrawable(Color.rgb(0xFC,
//                        0x70, 0x2B)));
//                deleteItem.setWidth(DensityUtils.dip2px(aty, 105));
//                deleteItem.setTitle("删除");
//                deleteItem.setTitleSize(20);
//                deleteItem.setTitleColor(Color.WHITE);
//                menu.addMenuItem(deleteItem);
//            }
//        };
//        ptrlv_messages.setMenuCreator(creator);
//        ptrlv_messages.setOnMenuItemClickListener(new SwipeMenuListView.OnMenuItemClickListener() {
//            @Override
//            public void onMenuItemClick(int position, SwipeMenu menu, int index) {
//                if (index==0){
//                    adapter.removeItem(position);
//                    showToastMsg("删除成功"+position);
//                }
//            }
//        });
//
//        ptrlv_messages.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                int realPos = position - ((ListView) parent).getHeaderViewsCount();
//                if (realPos >= 0 && realPos < adapter.getCount()) {
//                    //跳转到详情
//                    showToastMsg("" + position);
//                }
//            }
//        });
    }


    @Override
    public void widgetClick(View v) {
        super.widgetClick(v);
    }
}
