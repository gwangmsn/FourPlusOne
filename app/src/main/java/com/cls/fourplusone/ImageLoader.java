package com.cls.fourplusone;


import com.example.fourplusone.R;
import com.example.fourplusone.R.layout;
import com.example.fourplusone.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ImageView;

public class ImageLoader extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image_loader);
		// get intent data
				Intent i = getIntent();
				
				// Selected image id
				int position = i.getExtras().getInt("id");
				ImageAdapter imageAdapter = new ImageAdapter(this);
				
				ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
				imageView.setImageResource(imageAdapter.mThumbIds[position]);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.image_loader, menu);
		return true;
	}

}
