package com.huxz.leetcode.design_pattern.proxy_pattern;

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
		target.sell();
	}
}
