package com.huxz.leetcode.design_pattern.proxy_pattern;

import android.util.Log;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * create by huxz on 2019/3/20
 * 功能：cglib代理
 */
public class CglibProxy implements MethodInterceptor {



	public Object getProxy(Class clazz){
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		// TODO Auto-generated method stub
		Log.i("build_pattern","——————————————————————————");
		Log.i("build_pattern","下一位请登台发言");
		//目标方法调用
		Object result = methodProxy.invokeSuper(o, objects);
		//目标方法后执行
		Log.i("build_pattern","大家掌声鼓励");
		return result;
	}
}
