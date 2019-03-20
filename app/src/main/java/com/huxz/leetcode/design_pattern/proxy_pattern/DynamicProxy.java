package com.huxz.leetcode.design_pattern.proxy_pattern;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * create by huxz on 2019/3/19
 * 功能：动态代理
 */
public class DynamicProxy {

	private ISeller iSeller = new Seller();

	public void doThing(){

		ISeller proxy = (ISeller) Proxy.newProxyInstance(iSeller.getClass().getClassLoader(),
				iSeller.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
						Object returnValue = method.invoke(iSeller,objects);
						Log.i("build_pattern","动态代理");
						return returnValue;
					}
				});
		proxy.sell();
		proxy.buy();
	}
}
