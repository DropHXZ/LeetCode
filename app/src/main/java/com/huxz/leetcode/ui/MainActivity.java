package com.huxz.leetcode.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.huxz.leetcode.R;
import com.huxz.leetcode.design_pattern.build_pattern.User;
import com.huxz.leetcode.design_pattern.proxy_pattern.CglibProxy;
import com.huxz.leetcode.design_pattern.proxy_pattern.DynamicProxy;
import com.huxz.leetcode.design_pattern.proxy_pattern.ISeller;
import com.huxz.leetcode.design_pattern.proxy_pattern.Seller;
import com.huxz.leetcode.design_pattern.proxy_pattern.SellerProxy;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
//			Toast.makeText(MainActivity.this,"success",Toast.LENGTH_LONG).show();
//		}
		//build pattern
		User user = new User.Builder().setName("狗蛋").setPhone("15011110000").build();
		Log.i("build_pattern",user.toString());
		//proxy pattern
		ISeller target = new Seller();
		ISeller proxy = new SellerProxy(target);
		proxy.sell();
		//dynamic proxy pattern
		DynamicProxy dProxy = new DynamicProxy();
		dProxy.doThing();
		//CglibProxy
		CglibProxy cglibProxy = new CglibProxy();
		ISeller cTarget = (ISeller) cglibProxy.getProxy(Seller.class);
		cTarget.buy();
		cTarget.sell();
	}
}
