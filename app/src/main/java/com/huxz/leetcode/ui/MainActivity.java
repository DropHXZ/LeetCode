package com.huxz.leetcode.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.huxz.leetcode.R;
import com.huxz.leetcode.design_pattern.build_pattern.User;

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
	}
}
