package com.huxz.leetcode.design_pattern.proxy_pattern;

import android.util.Log;

/**
 * create by huxz on 2019/3/19
 * 功能：静态代理
 */
public class SellerProxy implements ISeller {

	private ISeller target;

	public SellerProxy(ISeller target) {
		this.target = target;
	}

	@Override
	public void sell() {
		Log.i("build_pattern","进货");
		target.sell();
	}

	@Override
	public void buy() {
		target.buy();
	}
}
