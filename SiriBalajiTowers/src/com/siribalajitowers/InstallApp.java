package com.siribalajitowers;


import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;

public class InstallApp extends Application{
	
	public static Context context;
	final String TAG = InstallApp.class.getSimpleName();
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		context = getApplicationContext();
		Log.e(TAG, "in application on create.");	
		Toast.makeText(context, "got it", Toast.LENGTH_LONG).show();
	}

}
