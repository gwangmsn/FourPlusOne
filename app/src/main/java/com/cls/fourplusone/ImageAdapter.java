package com.cls.fourplusone;

import com.example.fourplusone.R;

import android.content.Context;
import android.content.res.Configuration;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	private Context mContext;
	
	// Keep all Images in array
	public Integer[] mThumbIds = {
			R.drawable.pic_10, R.drawable.pic_10,
			R.drawable.pic_10, R.drawable.pic_10,
			R.drawable.pic_10, R.drawable.pic_10,
			R.drawable.pic_10, R.drawable.pic_10,
			R.drawable.pic_10, R.drawable.pic_10,
			R.drawable.pic_10, R.drawable.pic_10,
			R.drawable.pic_10, R.drawable.pic_10,
			R.drawable.pic_10, R.drawable.pic_10,
			R.drawable.pic_10, R.drawable.pic_10,
			R.drawable.pic_10, R.drawable.pic_10,
			// 10
			R.drawable.pic_10, R.drawable.pic_10,
			R.drawable.pic_10, R.drawable.pic_10,
			R.drawable.pic_10, R.drawable.pic_10,
			R.drawable.pic_10, R.drawable.pic_10,
			R.drawable.pic_10, R.drawable.pic_10,
			R.drawable.pic_10, R.drawable.pic_10,
			R.drawable.pic_10, R.drawable.pic_10,
			R.drawable.pic_10, R.drawable.pic_10,
			R.drawable.pic_10, R.drawable.pic_10,
			R.drawable.pic_10, R.drawable.pic_10,
			// 20
			R.drawable.pic_10, R.drawable.pic_10,
			
			
	};

	static int totalCount = 0;
	static int [] userOne = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	static ImageView[] viewOne = {null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static ImageView[] viewTwo = {null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int [] userTwo = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	static int [] col1 = {0,7,14,21,28,35};
	static int [] col2 = {1,8,15,22,29,36};
	static int [] col3 = {2,9,16,23,30,37};
	static int [] col4 = {3,10,17,24,31,38};
	static int [] col5 = {4,11,18,25,32,39};
	static int [] col6 = {5,12,19,26,33,40};
	static int [] col7 = {6,13,20,27,34,41};
	// Constructor
	public ImageAdapter(Context c){
		mContext = c;
	}

	@Override
	public int getCount() {
		return mThumbIds.length;
	}

	@Override
	public Object getItem(int position) {
		return mThumbIds[position];
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {	
		boolean flag = false;
		ImageView imageView = new ImageView(mContext);
		int col = getColumn(position);
		if (Constants.totalCount >= 0){
			if (Constants.totalCount > 0 && (Constants.totalCount % 2) == 1){ // second user
				flag = true;

			}
			//Constants.totalCount++;
		}else{
			imageView.setImageResource(mThumbIds[position]);
		}
        
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        int gridSize = 70;
		if (Constants.screenSize == Configuration.SCREENLAYOUT_SIZE_LARGE){
        	gridSize = 70;
        }
        if (Constants.screenSize == Configuration.SCREENLAYOUT_SIZE_SMALL){
        	gridSize = 40;
        }
        if (Constants.screenSize == Configuration.SCREENLAYOUT_SIZE_NORMAL){
        	gridSize = 40;
        }
        imageView.setLayoutParams(new GridView.LayoutParams(gridSize, gridSize));
        if (!flag)
        	Constants.viewAll[position] = imageView;
        return imageView;
	}
	
	/**
	 * getColumn return which columm that current position is on 
	 * @param pos
	 * @return
	 */
	int getColumn(int pos){
		for (int col:Constants.col1){
			if (pos == col){
				return 1;
			}
		}
		for (int col:Constants.col2){
			if (pos == col){
				return 2;
			}
		}
		for (int col:Constants.col3){
			if (pos == col){
				return 3;
			}
		}
		for (int col:Constants.col4){
			if (pos == col){
				return 4;
			}
		}
		for (int col:Constants.col5){
			if (pos == col){
				return 5;
			}
		}
		for (int col:Constants.col6){
			if (pos == col){
				return 6;
			}
		}
		for (int col:Constants.col7){
			if (pos == col){
				return 7;
			}
		}
		
		return -1;
	}

//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.four_plus_one, menu);
//		return true;
//	}

}
