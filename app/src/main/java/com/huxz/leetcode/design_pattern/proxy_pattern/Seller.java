package com.huxz.leetcode.design_pattern.proxy_pattern;

import android.util.Log;

/**
 * create by huxz on 2019/3/19
 * 功能：
 */
public class Seller implements ISeller {
	@Override
	public void sell() {
		Log.i("build_pattern","卖出去");
	}

	@Override
	public void buy() {
		Log.i("build_pattern","出进来");
	}
}
