package com.cls.fourplusone;



import com.example.fourplusone.R;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class FourPlusONe extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid_layout);
		try{
			GridView gridView = (GridView) findViewById(R.id.grid_view);
			int screenLayout = getResources().getConfiguration().screenLayout;
			int normal=Configuration.SCREENLAYOUT_SIZE_NORMAL;
			int xlarge=Configuration.SCREENLAYOUT_SIZE_XLARGE;
			if((getResources().getConfiguration().screenLayout &
					Configuration.SCREENLAYOUT_SIZE_LARGE) ==
					Configuration.SCREENLAYOUT_SIZE_LARGE){
					Constants.screenSize = Configuration.SCREENLAYOUT_SIZE_LARGE;
					gridView.setColumnWidth(40);
					//do something for Screen layout large
				}else if ((getResources().getConfiguration().screenLayout &
						Configuration.SCREENLAYOUT_SIZE_SMALL) ==
						Configuration.SCREENLAYOUT_SIZE_SMALL){
					//do something
					Constants.screenSize = Configuration.SCREENLAYOUT_SIZE_SMALL;
					gridView.setColumnWidth(35);
				}else if ((getResources().getConfiguration().screenLayout &
						Configuration.SCREENLAYOUT_SIZE_NORMAL) ==
						Configuration.SCREENLAYOUT_SIZE_NORMAL){
					Constants.screenSize = Configuration.SCREENLAYOUT_SIZE_NORMAL;
					gridView.setColumnWidth(35);
					
				}
			

			// Instance of ImageAdapter Class
			Constants.totalCount = -1;
			final ImageAdapter adptor = new ImageAdapter(this); 
			gridView.setAdapter(adptor);
			View view = adptor.getView(3,null,null);
			
			/**
			 * On Click event for Single Gridview Item
			 * */
			gridView.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, View v,
						int position, long id) {
					
					
					int col = getColumn(position);
					if (Constants.totalCount == -1)
						Constants.totalCount = 0;
					if (Constants.totalCount > 0 && (Constants.totalCount % 2) == 1){ // second user
						switch(col){
						case 1:
							  for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col1[i]] == -1 && Constants.userOne[Constants.col1[i]] == -1){
									 Constants.userTwo[Constants.col1[i]] = 2;
									    //ImageView imageView = (ImageView) v;
									    ImageView imageView = (ImageView) Constants.viewAll[Constants.col1[i]];
										Constants.viewOne[position] = imageView;
										imageView.setImageResource(R.drawable.pic_2);
										Constants.totalCount++;
										userTwoCalculation();
										
										break;
								 }
							  }
							break;
						case 2:
							for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col2[i]] == -1 && Constants.userOne[Constants.col2[i]] == -1){
									 Constants.userTwo[Constants.col2[i]] = 2;
										
									 //ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col2[i]];
										Constants.viewTwo[Constants.col2[i]] = imageView;
										imageView.setImageResource(R.drawable.pic_2);
										Constants.totalCount++;
										userTwoCalculation();
										break;
								 }
							  }
							break;
						case 3:
							for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col3[i]] == -1 && Constants.userOne[Constants.col3[i]] == -1){
									 Constants.userTwo[Constants.col3[i]] = 2;
									 //ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col3[i]];
									 Constants.viewTwo[Constants.col3[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_2);
										Constants.totalCount++;
										userTwoCalculation();
										break;
								 }
							  }
							break;
						case 4:
							for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col4[i]] == -1 && Constants.userOne[Constants.col4[i]] == -1){
									 Constants.userTwo[Constants.col4[i]] = 2;
									 //ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col4[i]];
									 Constants.viewOne[Constants.col4[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_2);
										Constants.totalCount++;
										userTwoCalculation();
										break;
								 }
							  }
							break;
						case 5:
							for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col5[i]] == -1 && Constants.userOne[Constants.col5[i]] == -1){
									 Constants.userTwo[Constants.col5[i]] = 2;
									//ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col5[i]];
									 Constants.viewOne[Constants.col5[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_2);
										Constants.totalCount++;
										userTwoCalculation();
										break;
								 }
							  }
							break;
						case 6:
							for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col6[i]] == -1 && Constants.userOne[Constants.col6[i]] == -1){
									 Constants.userTwo[Constants.col6[i]] = 2;
									 //ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col6[i]];
									 Constants.viewTwo[Constants.col6[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_2);
										Constants.totalCount++;
										userTwoCalculation();
										break;
								 }
							  }
							break;
						case 7:
							for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col7[i]] == -1 && Constants.userOne[Constants.col7[i]] == -1){
									 Constants.userTwo[Constants.col7[i]] = 2;
									 //ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col7[i]];
									 Constants.viewTwo[Constants.col7[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_2);
										Constants.totalCount++;
										userTwoCalculation();
										break;
								 }
							  }
							break;
						
						}

					}else if (Constants.totalCount > 0 && (Constants.totalCount % 2) == 0){ // first user
						switch(col){
						case 1:
							  for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col1[i]] == -1 && Constants.userOne[Constants.col1[i]] == -1){
									 Constants.userOne[Constants.col1[i]] = 2;
									// ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col1[i]];
									 Constants.viewTwo[Constants.col1[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_1);
										Constants.totalCount++;
										userOneCalculation();
										break;
								 }
							  }
							break;
						case 2:
							for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col2[i]] == -1 && Constants.userOne[Constants.col2[i]] == -1){
									 Constants.userOne[Constants.col2[i]] = 2;
									 //ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col2[i]];
									 Constants.viewTwo[Constants.col2[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_1);
										Constants.totalCount++;
										userOneCalculation();
										break;
								 }
							  }
							break;
						case 3:
							for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col3[i]] == -1 && Constants.userOne[Constants.col3[i]] == -1){
									 Constants.userOne[Constants.col3[i]] = 2;
									 //ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col3[i]];
									 Constants.viewOne[Constants.col3[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_1);
										Constants.totalCount++;
										userOneCalculation();
										break;
								 }
							  }
							break;
						case 4:
							for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col4[i]] == -1 && Constants.userOne[Constants.col4[i]] == -1){
									 Constants.userOne[Constants.col4[i]] = 2;
									 //ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col4[i]];
									 Constants.viewOne[Constants.col5[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_1);
										Constants.totalCount++;
										userOneCalculation();
										break;
								 }
							  }
							break;
						case 5:
							for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col5[i]] == -1 && Constants.userOne[Constants.col5[i]] == -1){
									 Constants.userOne[Constants.col5[i]] = 2;
									// ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col5[i]];
									 Constants.viewOne[Constants.col5[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_1);
										Constants.totalCount++;
										userOneCalculation();
										break;
								 }
							  }
							break;
						case 6:
							for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col6[i]] == -1 &&Constants.userOne[Constants.col6[i]] == -1){
									 Constants.userOne[Constants.col6[i]] = 2;
									 //ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col6[i]];
									 Constants.viewOne[Constants.col6[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_1);
										Constants.totalCount++;
										userOneCalculation();
										break;
								 }
							  }
							break;
						case 7:
							for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col7[i]] == -1 && Constants.userOne[Constants.col7[i]] == -1){
									 Constants.userOne[Constants.col7[i]] = 2;
									 //ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col7[i]];
									 Constants.viewOne[Constants.col7[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_1);
										Constants.totalCount++;
										userOneCalculation();
										break;
								 }
							  }
							break;
						
						}
						
					} else if (Constants.totalCount == 0){
						switch(col){
						case 1:
							  for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col1[i]] == -1 && Constants.userOne[Constants.col1[i]] == -1){
									 Constants.userOne[Constants.col1[i]] = 2;
									 //ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col1[i]];
									 Constants.viewOne[Constants.col1[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_1);
										Constants.totalCount++;
										userOneCalculation();
										break;
								 }
							  }
							break;
						case 2:
							for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col2[i]] == -1 && Constants.userOne[Constants.col2[i]] == -1){
									 Constants.userOne[Constants.col2[i]] = 2;
									 //ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col2[i]];
									 Constants.viewOne[Constants.col2[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_1);
										Constants.totalCount++;
										userOneCalculation();
										break;
								 }
							  }
							break;
						case 3:
							for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col3[i]] == -1 && Constants.userOne[Constants.col3[i]] == -1){
									 Constants.userOne[Constants.col3[i]] = 2;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col3[i]];
									 Constants.viewOne[Constants.col3[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_1);
										Constants.totalCount++;
										userOneCalculation();
										break;
								 }
							  }
							break;
						case 4:
							for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col4[i]] == -1 && Constants.userOne[Constants.col4[i]] == -1){
									 Constants.userOne[Constants.col4[i]] = 2;
									// ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col4[i]];
									 Constants.viewOne[Constants.col4[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_1);
										Constants.totalCount++;
										userOneCalculation();
										break;
								 }
							  }
							break;
						case 5:
							for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col5[i]] == -1 && Constants.userOne[Constants.col5[i]] == -1){
									 Constants.userOne[Constants.col5[i]] = 2;
									 //ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col5[i]];
									 Constants.viewOne[Constants.col5[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_1);
										Constants.totalCount++;
										userOneCalculation();
										break;
								 }
							  }
							break;
						case 6:
							for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col6[i]] == -1 && Constants.userOne[Constants.col6[i]] == -1){
									 Constants.userOne[Constants.col6[i]] = 2;
									 //ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col6[i]];
									 Constants.viewOne[Constants.col6[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_1);
										Constants.totalCount++;
										userOneCalculation();
										break;
								 }
							  }
							break;
						case 7:
							for (int i = 5; i > -1; i--){
								 if (Constants.userTwo[Constants.col7[i]] == -1 && Constants.userOne[Constants.col7[i]] == -1){
									 Constants.userOne[Constants.col7[i]] = 2;
									// ImageView imageView = (ImageView) v;
									 ImageView imageView = (ImageView) Constants.viewAll[Constants.col7[i]];
									 Constants.viewOne[Constants.col7[i]] = imageView;
									 imageView.setImageResource(R.drawable.pic_1);
										Constants.totalCount++;
										userOneCalculation();
										break;
								 }
							  }
							break;
						
						}
						
					}
					
				}
			});
			
		} catch(Exception ex){
			ex.printStackTrace();
		}
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

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.four_plus_one, menu);
		return true;
	}
	/**
	 * this method is used to calculate all winning combinations for user one
	 */
	public void userOneCalculation(){
		if((Constants.userOne[0] > -1 && Constants.userOne[1] > -1 && Constants.userOne[2] > -1 && Constants.userOne[3] > -1) 
				|| (Constants.userOne[1] > -1 && Constants.userOne[2] > -1 && Constants.userOne[3] > -1 && Constants.userOne[4] > -1) 
				|| (Constants.userOne[2] > -1 && Constants.userOne[3] > -1 && Constants.userOne[4] > -1 && Constants.userOne[5] > -1)
				|| (Constants.userOne[3] > -1 && Constants.userOne[4] > -1 && Constants.userOne[5] > -1 && Constants.userOne[6] > -1)
				|| (Constants.userOne[7] > -1 && Constants.userOne[8] > -1 && Constants.userOne[9] > -1 && Constants.userOne[10] > -1) 
				|| (Constants.userOne[8] > -1 && Constants.userOne[9] > -1 && Constants.userOne[10] > -1 && Constants.userOne[11] > -1) 
				|| (Constants.userOne[9] > -1 && Constants.userOne[10] > -1 && Constants.userOne[11] > -1 && Constants.userOne[12] > -1)
				|| (Constants.userOne[10] > -1 && Constants.userOne[11] > -1 && Constants.userOne[12] > -1 && Constants.userOne[13] > -1)
				|| (Constants.userOne[14] > -1 && Constants.userOne[15] > -1 && Constants.userOne[16] > -1 && Constants.userOne[17] > -1)
				|| (Constants.userOne[15] > -1 && Constants.userOne[16] > -1 && Constants.userOne[17] > -1 && Constants.userOne[18] > -1)
				|| (Constants.userOne[16] > -1 && Constants.userOne[17] > -1 && Constants.userOne[18] > -1 && Constants.userOne[19] > -1)
				|| (Constants.userOne[17] > -1 && Constants.userOne[18] > -1 && Constants.userOne[19] > -1 && Constants.userOne[20] > -1)
				|| (Constants.userOne[21] > -1 && Constants.userOne[22] > -1 && Constants.userOne[23] > -1 && Constants.userOne[24] > -1)
				|| (Constants.userOne[22] > -1 && Constants.userOne[23] > -1 && Constants.userOne[24] > -1 && Constants.userOne[25] > -1)
				|| (Constants.userOne[23] > -1 && Constants.userOne[24] > -1 && Constants.userOne[25] > -1 && Constants.userOne[26] > -1)
				|| (Constants.userOne[24] > -1 && Constants.userOne[25] > -1 && Constants.userOne[26] > -1 && Constants.userOne[27] > -1)
				|| (Constants.userOne[28] > -1 && Constants.userOne[29] > -1 && Constants.userOne[30] > -1 && Constants.userOne[31] > -1)
				|| (Constants.userOne[29] > -1 && Constants.userOne[30] > -1 && Constants.userOne[31] > -1 && Constants.userOne[32] > -1)
				|| (Constants.userOne[30] > -1 && Constants.userOne[31] > -1 && Constants.userOne[32] > -1 && Constants.userOne[33] > -1)
				|| (Constants.userOne[31] > -1 && Constants.userOne[32] > -1 && Constants.userOne[33] > -1 && Constants.userOne[34] > -1)
				|| (Constants.userOne[35] > -1 && Constants.userOne[36] > -1 && Constants.userOne[37] > -1 && Constants.userOne[38] > -1)
				|| (Constants.userOne[36] > -1 && Constants.userOne[37] > -1 && Constants.userOne[38] > -1 && Constants.userOne[39] > -1)
				|| (Constants.userOne[37] > -1 && Constants.userOne[38] > -1 && Constants.userOne[39] > -1 && Constants.userOne[40] > -1)
				|| (Constants.userOne[38] > -1 && Constants.userOne[39] > -1 && Constants.userOne[40] > -1 && Constants.userOne[41] > -1)
				|| (Constants.userOne[0] > -1 && Constants.userOne[7] > -1 && Constants.userOne[14] > -1 && Constants.userOne[21] > -1)
				|| (Constants.userOne[7] > -1 && Constants.userOne[14] > -1 && Constants.userOne[21] > -1 && Constants.userOne[28] > -1)
				|| (Constants.userOne[14] > -1 && Constants.userOne[21] > -1 && Constants.userOne[28] > -1 && Constants.userOne[35] > -1)
				|| (Constants.userOne[1] > -1 && Constants.userOne[8] > -1 && Constants.userOne[15] > -1 && Constants.userOne[22] > -1)
				|| (Constants.userOne[8] > -1 && Constants.userOne[15] > -1 && Constants.userOne[22] > -1 && Constants.userOne[29] > -1)
				|| (Constants.userOne[15] > -1 && Constants.userOne[22] > -1 && Constants.userOne[29] > -1 && Constants.userOne[36] > -1)
				|| (Constants.userOne[2] > -1 && Constants.userOne[9] > -1 && Constants.userOne[16] > -1 && Constants.userOne[23] > -1)
				|| (Constants.userOne[9] > -1 && Constants.userOne[16] > -1 && Constants.userOne[23] > -1 && Constants.userOne[30] > -1)
				|| (Constants.userOne[16] > -1 && Constants.userOne[23] > -1 && Constants.userOne[30] > -1 && Constants.userOne[37] > -1)
				|| (Constants.userOne[3] > -1 && Constants.userOne[10] > -1 && Constants.userOne[17] > -1 && Constants.userOne[24] > -1)
				|| (Constants.userOne[10] > -1 && Constants.userOne[17] > -1 && Constants.userOne[24] > -1 && Constants.userOne[31] > -1)
				|| (Constants.userOne[17] > -1 && Constants.userOne[24] > -1 && Constants.userOne[31] > -1 && Constants.userOne[38] > -1)
				|| (Constants.userOne[4] > -1 && Constants.userOne[11] > -1 && Constants.userOne[18] > -1 && Constants.userOne[25] > -1)
				|| (Constants.userOne[11] > -1 && Constants.userOne[18] > -1 && Constants.userOne[25] > -1 && Constants.userOne[32] > -1)
				|| (Constants.userOne[18] > -1 && Constants.userOne[25] > -1 && Constants.userOne[32] > -1 && Constants.userOne[39] > -1)
				|| (Constants.userOne[5] > -1 && Constants.userOne[12] > -1 && Constants.userOne[19] > -1 && Constants.userOne[26] > -1)
				|| (Constants.userOne[12] > -1 && Constants.userOne[19] > -1 && Constants.userOne[26] > -1 && Constants.userOne[33] > -1)
				|| (Constants.userOne[19] > -1 && Constants.userOne[26] > -1 && Constants.userOne[33] > -1 && Constants.userOne[40] > -1)
				|| (Constants.userOne[6] > -1 && Constants.userOne[13] > -1 && Constants.userOne[20] > -1 && Constants.userOne[27] > -1)
				|| (Constants.userOne[13] > -1 && Constants.userOne[20] > -1 && Constants.userOne[27] > -1 && Constants.userOne[34] > -1)
				|| (Constants.userOne[20] > -1 && Constants.userOne[27] > -1 && Constants.userOne[34] > -1 && Constants.userOne[41] > -1)
				|| (Constants.userOne[3] > -1 && Constants.userOne[9] > -1 && Constants.userOne[15] > -1 && Constants.userOne[21] > -1)
				|| (Constants.userOne[4] > -1 && Constants.userOne[10] > -1 && Constants.userOne[16] > -1 && Constants.userOne[22] > -1)
				|| (Constants.userOne[5] > -1 && Constants.userOne[11] > -1 && Constants.userOne[17] > -1 && Constants.userOne[23] > -1)
				|| (Constants.userOne[6] > -1 && Constants.userOne[12] > -1 && Constants.userOne[18] > -1 && Constants.userOne[24] > -1)
				|| (Constants.userOne[10] > -1 && Constants.userOne[16] > -1 && Constants.userOne[22] > -1 && Constants.userOne[28] > -1)
				|| (Constants.userOne[11] > -1 && Constants.userOne[17] > -1 && Constants.userOne[23] > -1 && Constants.userOne[29] > -1)
				|| (Constants.userOne[12] > -1 && Constants.userOne[18] > -1 && Constants.userOne[24] > -1 && Constants.userOne[30] > -1)
				|| (Constants.userOne[13] > -1 && Constants.userOne[19] > -1 && Constants.userOne[25] > -1 && Constants.userOne[31] > -1)
				|| (Constants.userOne[17] > -1 && Constants.userOne[23] > -1 && Constants.userOne[29] > -1 && Constants.userOne[35] > -1)
				|| (Constants.userOne[18] > -1 && Constants.userOne[24] > -1 && Constants.userOne[30] > -1 && Constants.userOne[36] > -1)
				|| (Constants.userOne[19] > -1 && Constants.userOne[25] > -1 && Constants.userOne[31] > -1 && Constants.userOne[37] > -1)
				|| (Constants.userOne[20] > -1 && Constants.userOne[26] > -1 && Constants.userOne[32] > -1 && Constants.userOne[38] > -1)
				|| (Constants.userOne[0] > -1 && Constants.userOne[8] > -1 && Constants.userOne[16] > -1 && Constants.userOne[24] > -1)
				|| (Constants.userOne[1] > -1 && Constants.userOne[9] > -1 && Constants.userOne[17] > -1 && Constants.userOne[25] > -1)
				|| (Constants.userOne[2] > -1 && Constants.userOne[10] > -1 && Constants.userOne[18] > -1 && Constants.userOne[26] > -1)
				|| (Constants.userOne[3] > -1 && Constants.userOne[11] > -1 && Constants.userOne[19] > -1 && Constants.userOne[27] > -1)
				|| (Constants.userOne[7] > -1 && Constants.userOne[15] > -1 && Constants.userOne[23] > -1 && Constants.userOne[31] > -1)
				|| (Constants.userOne[8] > -1 && Constants.userOne[16] > -1 && Constants.userOne[24] > -1 && Constants.userOne[32] > -1)
				|| (Constants.userOne[9] > -1 && Constants.userOne[17] > -1 && Constants.userOne[25] > -1 && Constants.userOne[33] > -1)
				|| (Constants.userOne[10] > -1 && Constants.userOne[18] > -1 && Constants.userOne[26] > -1 && Constants.userOne[34] > -1)
				|| (Constants.userOne[14] > -1 && Constants.userOne[22] > -1 && Constants.userOne[30] > -1 && Constants.userOne[38] > -1)
				|| (Constants.userOne[15] > -1 && Constants.userOne[23] > -1 && Constants.userOne[31] > -1 && Constants.userOne[39] > -1)
				|| (Constants.userOne[16] > -1 && Constants.userOne[24] > -1 && Constants.userOne[32] > -1 && Constants.userOne[40] > -1)
				|| (Constants.userOne[17] > -1 && Constants.userOne[25] > -1 && Constants.userOne[33] > -1 && Constants.userOne[41] > -1)){//user one has won.
			// post game over message and congratuate user has won.
			AlertDialog alertDialog = new AlertDialog.Builder(
					FourPlusONe.this).create();
			 
			// Setting Dialog Title
			alertDialog.setTitle("Congratulation to User One");

			// Setting Dialog Message
			alertDialog.setMessage("You have won this game!!!");

			// Setting Icon to Dialog
			alertDialog.setIcon(R.drawable.pic_1);

			// Setting OK Button
			alertDialog.setButton("OK",
					new DialogInterface.OnClickListener() {

						public void onClick(DialogInterface dialog,
								int which) {
							// Write your code here to execute after dialog
							// closed
							// reinit all views to default view and clean up all data structure 
							// this should be done by Kevin.
							Toast.makeText(getApplicationContext(),
									"You clicked on OK", Toast.LENGTH_SHORT)
									.show();
						}
					});

			// Showing Alert Message
			alertDialog.show();
			for (int i = 0; i < 42; i++){// clean up the game
				Constants.userOne[i] = -1;
				Constants.userTwo[i] = -1; 
				   if (Constants.viewTwo[i] != null){
					   ImageView v = Constants.viewTwo[i];
					   Constants.viewTwo[i] = null; // clear array
					   v.setImageResource(R.drawable.pic_10); // reset image to background image
				   }
				   if (Constants.viewOne[i] != null){
					   ImageView v = Constants.viewOne[i];
					   Constants.viewOne[i] = null; // clear array
					   v.setImageResource(R.drawable.pic_10); // reset image to background image
				   }
			   }
		}
	}
	
	/**
	 * This method is used to calclate all winning combinations for user two		
	 */
	public void userTwoCalculation(){
		if ((Constants.userTwo[0] > -1 && Constants.userTwo[1] > -1 && Constants.userTwo[2] > -1 && Constants.userTwo[3] > -1) 
				|| (Constants.userTwo[1] > -1 && Constants.userTwo[2] > -1 && Constants.userTwo[3] > -1 && Constants.userTwo[4] > -1) 
				|| (Constants.userTwo[2] > -1 && Constants.userTwo[3] > -1 && Constants.userTwo[4] > -1 && Constants.userTwo[5] > -1)
				|| (Constants.userTwo[3] > -1 && Constants.userTwo[4] > -1 && Constants.userTwo[5] > -1 && Constants.userTwo[6] > -1)
				|| (Constants.userTwo[7] > -1 && Constants.userTwo[8] > -1 && Constants.userTwo[9] > -1 && Constants.userTwo[10] > -1) 
				|| (Constants.userTwo[8] > -1 && Constants.userTwo[9] > -1 && Constants.userTwo[10] > -1 && Constants.userTwo[11] > -1) 
				|| (Constants.userTwo[9] > -1 && Constants.userTwo[10] > -1 && Constants.userTwo[11] > -1 && Constants.userTwo[12] > -1)
				|| (Constants.userTwo[10] > -1 && Constants.userTwo[11] > -1 && Constants.userTwo[12] > -1 && Constants.userTwo[13] > -1)
				|| (Constants.userTwo[14] > -1 && Constants.userTwo[15] > -1 && Constants.userTwo[16] > -1 && Constants.userTwo[17] > -1)
				|| (Constants.userTwo[15] > -1 && Constants.userTwo[16] > -1 && Constants.userTwo[17] > -1 && Constants.userTwo[18] > -1)
				|| (Constants.userTwo[16] > -1 && Constants.userTwo[17] > -1 && Constants.userTwo[18] > -1 && Constants.userTwo[19] > -1)
				|| (Constants.userTwo[17] > -1 && Constants.userTwo[18] > -1 && Constants.userTwo[19] > -1 && Constants.userTwo[20] > -1)
				|| (Constants.userTwo[21] > -1 && Constants.userTwo[22] > -1 && Constants.userTwo[23] > -1 && Constants.userTwo[24] > -1)
				|| (Constants.userTwo[22] > -1 && Constants.userTwo[23] > -1 && Constants.userTwo[24] > -1 && Constants.userTwo[25] > -1)
				|| (Constants.userTwo[23] > -1 && Constants.userTwo[24] > -1 && Constants.userTwo[25] > -1 && Constants.userTwo[26] > -1)
				|| (Constants.userTwo[24] > -1 && Constants.userTwo[25] > -1 && Constants.userTwo[26] > -1 && Constants.userTwo[27] > -1)
				|| (Constants.userTwo[28] > -1 && Constants.userTwo[29] > -1 && Constants.userTwo[30] > -1 && Constants.userTwo[31] > -1)
				|| (Constants.userTwo[29] > -1 && Constants.userTwo[30] > -1 && Constants.userTwo[31] > -1 && Constants.userTwo[32] > -1)
				|| (Constants.userTwo[30] > -1 && Constants.userTwo[31] > -1 && Constants.userTwo[32] > -1 && Constants.userTwo[33] > -1)
				|| (Constants.userTwo[31] > -1 && Constants.userTwo[32] > -1 && Constants.userTwo[33] > -1 && Constants.userTwo[34] > -1)
				|| (Constants.userTwo[35] > -1 && Constants.userTwo[36] > -1 && Constants.userTwo[37] > -1 && Constants.userTwo[38] > -1)
				|| (Constants.userTwo[36] > -1 && Constants.userTwo[37] > -1 && Constants.userTwo[38] > -1 && Constants.userTwo[39] > -1)
				|| (Constants.userTwo[37] > -1 && Constants.userTwo[38] > -1 && Constants.userTwo[39] > -1 && Constants.userTwo[40] > -1)
				|| (Constants.userTwo[38] > -1 && Constants.userTwo[39] > -1 && Constants.userTwo[40] > -1 && Constants.userTwo[41] > -1)
				|| (Constants.userTwo[0] > -1 && Constants.userTwo[7] > -1 && Constants.userTwo[14] > -1 && Constants.userTwo[21] > -1)
				|| (Constants.userTwo[7] > -1 && Constants.userTwo[14] > -1 && Constants.userTwo[21] > -1 && Constants.userTwo[28] > -1)
				|| (Constants.userTwo[14] > -1 && Constants.userTwo[21] > -1 && Constants.userTwo[28] > -1 && Constants.userTwo[35] > -1)
				|| (Constants.userTwo[1] > -1 && Constants.userTwo[8] > -1 && Constants.userTwo[15] > -1 && Constants.userTwo[22] > -1)
				|| (Constants.userTwo[8] > -1 && Constants.userTwo[15] > -1 && Constants.userTwo[22] > -1 && Constants.userTwo[29] > -1)
				|| (Constants.userTwo[15] > -1 && Constants.userTwo[22] > -1 && Constants.userTwo[29] > -1 && Constants.userTwo[36] > -1)
				|| (Constants.userTwo[2] > -1 && Constants.userTwo[9] > -1 && Constants.userTwo[16] > -1 && Constants.userTwo[23] > -1)
				|| (Constants.userTwo[9] > -1 && Constants.userTwo[16] > -1 && Constants.userTwo[23] > -1 && Constants.userTwo[30] > -1)
				|| (Constants.userTwo[16] > -1 && Constants.userTwo[23] > -1 && Constants.userTwo[30] > -1 && Constants.userTwo[37] > -1)
				|| (Constants.userTwo[3] > -1 && Constants.userTwo[10] > -1 && Constants.userTwo[17] > -1 && Constants.userTwo[24] > -1)
				|| (Constants.userTwo[10] > -1 && Constants.userTwo[17] > -1 && Constants.userTwo[24] > -1 && Constants.userTwo[31] > -1)
				|| (Constants.userTwo[17] > -1 && Constants.userTwo[24] > -1 && Constants.userTwo[31] > -1 && Constants.userTwo[38] > -1)
				|| (Constants.userTwo[4] > -1 && Constants.userTwo[11] > -1 && Constants.userTwo[18] > -1 && Constants.userTwo[25] > -1)
				|| (Constants.userTwo[11] > -1 && Constants.userTwo[18] > -1 && Constants.userTwo[25] > -1 && Constants.userTwo[32] > -1)
				|| (Constants.userTwo[18] > -1 && Constants.userTwo[25] > -1 && Constants.userTwo[32] > -1 && Constants.userTwo[39] > -1)
				|| (Constants.userTwo[5] > -1 && Constants.userTwo[12] > -1 && Constants.userTwo[19] > -1 && Constants.userTwo[26] > -1)
				|| (Constants.userTwo[12] > -1 && Constants.userTwo[19] > -1 && Constants.userTwo[26] > -1 && Constants.userTwo[33] > -1)
				|| (Constants.userTwo[19] > -1 && Constants.userTwo[26] > -1 && Constants.userTwo[33] > -1 && Constants.userTwo[40] > -1)
				|| (Constants.userTwo[6] > -1 && Constants.userTwo[13] > -1 && Constants.userTwo[20] > -1 && Constants.userTwo[27] > -1)
				|| (Constants.userTwo[13] > -1 && Constants.userTwo[20] > -1 && Constants.userTwo[27] > -1 && Constants.userTwo[34] > -1)
				|| (Constants.userTwo[20] > -1 && Constants.userTwo[27] > -1 && Constants.userTwo[34] > -1 && Constants.userTwo[41] > -1)
				|| (Constants.userTwo[3] > -1 && Constants.userTwo[9] > -1 && Constants.userTwo[15] > -1 && Constants.userTwo[21] > -1)
				|| (Constants.userTwo[4] > -1 && Constants.userTwo[10] > -1 && Constants.userTwo[16] > -1 && Constants.userTwo[22] > -1)
				|| (Constants.userTwo[5] > -1 && Constants.userTwo[11] > -1 && Constants.userTwo[17] > -1 && Constants.userTwo[23] > -1)
				|| (Constants.userTwo[6] > -1 && Constants.userTwo[12] > -1 && Constants.userTwo[18] > -1 && Constants.userTwo[24] > -1)
				|| (Constants.userTwo[10] > -1 && Constants.userTwo[16] > -1 && Constants.userTwo[22] > -1 && Constants.userTwo[28] > -1)
				|| (Constants.userTwo[11] > -1 && Constants.userTwo[17] > -1 && Constants.userTwo[23] > -1 && Constants.userTwo[29] > -1)
				|| (Constants.userTwo[12] > -1 && Constants.userTwo[18] > -1 && Constants.userTwo[24] > -1 && Constants.userTwo[30] > -1)
				|| (Constants.userTwo[13] > -1 && Constants.userTwo[19] > -1 && Constants.userTwo[25] > -1 && Constants.userTwo[31] > -1)
				|| (Constants.userTwo[17] > -1 && Constants.userTwo[23] > -1 && Constants.userTwo[29] > -1 && Constants.userTwo[35] > -1)
				|| (Constants.userTwo[18] > -1 && Constants.userTwo[24] > -1 && Constants.userTwo[30] > -1 && Constants.userTwo[36] > -1)
				|| (Constants.userTwo[19] > -1 && Constants.userTwo[25] > -1 && Constants.userTwo[31] > -1 && Constants.userTwo[37] > -1)
				|| (Constants.userTwo[20] > -1 && Constants.userTwo[26] > -1 && Constants.userTwo[32] > -1 && Constants.userTwo[38] > -1)
				|| (Constants.userTwo[0] > -1 && Constants.userTwo[8] > -1 && Constants.userTwo[16] > -1 && Constants.userTwo[24] > -1)
				|| (Constants.userTwo[1] > -1 && Constants.userTwo[9] > -1 && Constants.userTwo[17] > -1 && Constants.userTwo[25] > -1)
				|| (Constants.userTwo[2] > -1 && Constants.userTwo[10] > -1 && Constants.userTwo[18] > -1 && Constants.userTwo[26] > -1)
				|| (Constants.userTwo[3] > -1 && Constants.userTwo[11] > -1 && Constants.userTwo[19] > -1 && Constants.userTwo[27] > -1)
				|| (Constants.userTwo[7] > -1 && Constants.userTwo[15] > -1 && Constants.userTwo[23] > -1 && Constants.userTwo[31] > -1)
				|| (Constants.userTwo[8] > -1 && Constants.userTwo[16] > -1 && Constants.userTwo[24] > -1 && Constants.userTwo[32] > -1)
				|| (Constants.userTwo[9] > -1 && Constants.userTwo[17] > -1 && Constants.userTwo[25] > -1 && Constants.userTwo[33] > -1)
				|| (Constants.userTwo[10] > -1 && Constants.userTwo[18] > -1 && Constants.userTwo[26] > -1 && Constants.userTwo[34] > -1)
				|| (Constants.userTwo[14] > -1 && Constants.userTwo[22] > -1 && Constants.userTwo[30] > -1 && Constants.userTwo[38] > -1)
				|| (Constants.userTwo[15] > -1 && Constants.userTwo[23] > -1 && Constants.userTwo[31] > -1 && Constants.userTwo[39] > -1)
				|| (Constants.userTwo[16] > -1 && Constants.userTwo[24] > -1 && Constants.userTwo[32] > -1 && Constants.userTwo[40] > -1)
				|| (Constants.userTwo[17] > -1 && Constants.userTwo[25] > -1 && Constants.userTwo[33] > -1 && Constants.userTwo[41] > -1)){//user one has won.
			// post game over message and congratuate user has won.
			// post game over message and congratuate user has won.
			   for (int i = 0; i < 42; i++){
				   Constants.userTwo[i] = -1;
				   Constants.userTwo[i] = -1; 
				   if (Constants.viewTwo[i] != null){
					   ImageView v = Constants.viewTwo[i];
					   Constants.viewTwo[i] = null; // clear array
					   v.setImageResource(R.drawable.pic_10); // reset image to background image
				   }
				   if (Constants.viewOne[i] != null){
					   ImageView v = Constants.viewOne[i];
					   Constants.viewOne[i] = null; // clear array
					   v.setImageResource(R.drawable.pic_10); // reset image to background image
				   }
			   }
						AlertDialog alertDialog = new AlertDialog.Builder(
								FourPlusONe.this).create();

						// Setting Dialog Title
						alertDialog.setTitle("Congratulation to User Two");

						// Setting Dialog Message
						alertDialog.setMessage("You have won this game!!!");

						// Setting Icon to Dialog
						alertDialog.setIcon(R.drawable.pic_2);

						// Setting OK Button
						alertDialog.setButton("OK",
								new DialogInterface.OnClickListener() {

									public void onClick(DialogInterface dialog,
											int which) {
										
										// Write your code here to execute after dialog
										// closed
										// reinit all views to default view and clean up all data structure 
										Toast.makeText(getApplicationContext(),
												"You clicked on OK", Toast.LENGTH_SHORT)
												.show();
									}
								});

						// Showing Alert Message
						alertDialog.show();

		}
	}
}
