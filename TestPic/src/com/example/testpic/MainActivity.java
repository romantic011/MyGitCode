package com.example.testpic;

import java.io.File;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

import com.lidroid.xutils.BitmapUtils;
import com.squareup.picasso.Picasso;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ImageView iv = (ImageView) findViewById(R.id.imageView1);
		// String url = "http://img3.3lian.com/2006/013/02/062.jpg";
		String url = "http://img3.3lian.com/2006/013/02/062.jpg";
		System.out.println("aaaaaaaaa" + Environment.getExternalStorageDirectory().getAbsoluteFile());
		Picasso.with(getApplicationContext()) //
				.load(new File(Environment.getExternalStorageDirectory().getAbsoluteFile() + "/Camera/" + "P40719-161032.jpg")) //
				.placeholder(R.drawable.ic_launcher) //
				.error(R.drawable.ic_launcher) //
				.fit() //
				.into(iv);
		ImageView iv2 = (ImageView) findViewById(R.id.imageView2);
		BitmapUtils bm = new BitmapUtils(getApplicationContext());
		bm.display(iv2, Environment.getExternalStorageDirectory().getAbsoluteFile() + "/Camera/" + "P40719-161032.jpg");
	}
}
