package com.android.vstecs.eshop.control.index.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import com.android.vstecs.eshop.R;
import com.android.vstecs.eshop.control.base.BaseAct;
import com.android.vstecs.eshop.control.base.BaseFra;
import com.android.vstecs.eshop.control.index.view.IndexHeaderView;
import com.android.vstecs.eshop.views.CommonSearchView;
import com.android.vstecs.eshop.views.ptrgridview.GridViewWithHeaderAndFooter;
import com.android.vstecs.eshop.views.ptrgridview.PullToRefreshGridViewWithHeaderAndFooter;


public class IndexFragment extends BaseFra {
    private PullToRefreshGridViewWithHeaderAndFooter ptrGv;
    private GridViewWithHeaderAndFooter gridView;
    private IndexHeaderView indexHeaderView;

    @Override
    protected View inflaterView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        return inflater.inflate(R.layout.fragment_index,container,false);
    }

    @Override
    protected void initWidget(View parentView) {
        new CommonSearchView((BaseAct) getActivity()).init();
        ptrGv = (PullToRefreshGridViewWithHeaderAndFooter) parentView.findViewById(R.id.ptr_gridview_fi);
        gridView = ptrGv.getRefreshableView();

        indexHeaderView = new IndexHeaderView(activity);
        gridView.addHeaderView(indexHeaderView.createHeaderView());
    }
}
