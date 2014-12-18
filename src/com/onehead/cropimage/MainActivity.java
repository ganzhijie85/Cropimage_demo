package com.onehead.cropimage;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class MainActivity extends ActionBarActivity {
	private CropImageView mView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mView = (CropImageView) findViewById(R.id.cropimage);
		// 设置资源和默认长宽
		mView.setDrawable(getResources().getDrawable(R.drawable.test2), 300,
				300);
		// 调用该方法得到剪裁好的图片
		// Bitmap mBitmap= mView.getCropImage();
	}

}
