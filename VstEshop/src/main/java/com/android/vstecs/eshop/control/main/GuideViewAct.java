package com.android.vstecs.eshop.control.main;

import android.content.Intent;
import android.support.v4.view.CustomViewPager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

import com.android.vstecs.eshop.R;
import com.android.vstecs.eshop.control.base.BaseAct;


/**
 * 引导页面（第一次进入时开启）
 * @description：
 * @author ldm
 * @date 2014年12月2日 上午9:25:21
 */
public class GuideViewAct extends BaseAct implements CustomViewPager.OnRightEndScrollListener {
	private CustomViewPager mViewPager;

	// private ImageView mPage0;
	// private ImageView mPage1;
	// private ImageView mPage2;
	@SuppressWarnings("unused")
	// private int currIndex = 0;
	public GuideViewAct() {
		setAllowFullScreen(true);
		setHiddenActionBar(true);
	}

	@Override
	public void setRootView() {
		setContentView(R.layout.layout_guide_view);
	}

	@Override
	protected void initWidget() {
		super.initWidget();
		mViewPager = (CustomViewPager) findViewById(R.id.whatsnew_viewpager);
		mViewPager.setRightEndScrollListener(this);
		// mViewPager.setOnPageChangeListener(new MyOnPageChangeListener());
		// mPage0 = (ImageView) findViewById(R.id.page0);
		// mPage1 = (ImageView) findViewById(R.id.page1);
		// mPage2 = (ImageView) findViewById(R.id.page2);
		PagerAdapter mPagerAdapter = new PagerAdapter() {

			@Override
			public boolean isViewFromObject(View arg0, Object arg1) {
				return arg0 == arg1;
			}

			@Override
			public int getCount() {
				return 4;
			}

			@Override
			public void destroyItem(View container, int position, Object object) {
				((ViewPager) container).removeView((View) object);
			}

			@Override
			public View instantiateItem(View container, int position) {
				LayoutInflater inflater = LayoutInflater.from(container.getContext());
				int layoutId = getResources().getIdentifier("view_guide_" + (position + 1), "layout", getPackageName());
				View pView = inflater.inflate(layoutId, (ViewPager) container, false);
				((ViewPager) container).addView(pView);
				return pView;
			}
		};

		mViewPager.setAdapter(mPagerAdapter);
	}

	@Override
	public void widgetClick(View v) {
		super.widgetClick(v);
	}

	/**
	 * 最后一张图片Viewpager上面的开始按钮
	 * 
	 * @param v
	 */
	public void startbutton(View v) {
		System.gc();
		Intent intent = new Intent();
		intent.setClass(GuideViewAct.this, MainActivity.class);
		startActivity(intent);
		this.finish();
	}

	@Override
	public void onRightEndScrollListener() {
		startbutton(null);
	}

	// public class MyOnPageChangeListener implements OnPageChangeListener {
	// public void onPageSelected(int arg0) {
	// switch (arg0) {
	// case 0:
	// mPage0.setImageResource(R.drawable.page_now);
	// mPage1.setImageResource(R.drawable.page);
	// mPage2.setImageResource(R.drawable.page);
	// break;
	// case 1:
	// mPage1.setImageResource(R.drawable.page_now);
	// mPage0.setImageResource(R.drawable.page);
	// mPage2.setImageResource(R.drawable.page);
	// break;
	// case 2:
	// mPage2.setImageResource(R.drawable.page_now);
	// mPage0.setImageResource(R.drawable.page);
	// mPage1.setImageResource(R.drawable.page);
	// break;
	// // case 4:
	// // mPage4.setImageResource(R.drawable.page_now);
	// // mPage3.setImageResource(R.drawable.page);
	// // break;
	// }
	// currIndex = arg0;
	// }
	//
	// @Override
	// public void onPageScrollStateChanged(int arg0) {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// @Override
	// public void onPageScrolled(int arg0, float arg1, int arg2) {
	// // TODO Auto-generated method stub
	//
	// }
	// }

}
