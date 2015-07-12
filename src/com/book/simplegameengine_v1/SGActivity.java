package com.book.simplegameengine_v1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SGActivity extends Activity {
	
	public static final String TAG = "SimpleGameEngine";
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		Log.v(TAG, "onCreate() chamado.");
	}
	
	@Override
	protected void onStart(){
		super.onStart();
		Log.v(TAG, "onStart() chamado.");
	}
	
	@Override
	protected void onResume(){
		super.onResume();
		Log.v(TAG, "onResume() chamado.");
	}
	
	@Override
	protected void onRestart(){
		super.onRestart();
		Log.v(TAG, "onRestart() chamado.");
	}
	
	@Override
	protected void onPause(){
		super.onPause();
		Log.v(TAG, "onPause() chamado.");
	}
	
	@Override
	protected void onStop(){
		super.onStop();
		Log.v(TAG, "onStop() chamado.");
	}
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
		Log.v(TAG, "onDestroy() chamado.");
	}

}
