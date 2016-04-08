package com.android.vstecs.eshop.control.common;

import android.os.Environment;

public class Constant {
	
	/**
	 * 文件夹路径
	 */
	/**log日志；现直接在框架中按包名处理*/
	public static final String LOG_PARH = "VstEshop/log";
	public static final String IMAGE_PARH = "/VstEshop/images";
	
	/**
	 * 广播部分
	 */
	/** 用户退出 */
	public static final String LOGIN_STATE = "com.huika.twm.member.config.loginState";
	/**
	 * 网址地址
	 */
	/** 注册服务协议 */
	public static final String AGREEMENT_TWM = "http://waimai.365sji.com/Agreement-twm.html";

	/**
	 * 数据部分
	 */
	public static final String ORDER_ID = "orderId";
	

	
	public static final String HOMEDIR = Environment.getExternalStorageDirectory().getAbsolutePath() + "/vst/VstEshop";
	public static final String IMAGE_DIR = "/images/";
	
	public static final String MYIMAGE = HOMEDIR + IMAGE_DIR;
	// 临时图片缓存目录
	public static final String TEMP_CACHE_DIR = HOMEDIR + "/temp/";
	

}
