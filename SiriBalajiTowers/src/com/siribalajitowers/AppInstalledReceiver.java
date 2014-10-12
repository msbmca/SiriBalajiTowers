package com.siribalajitowers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;


public class AppInstalledReceiver extends BroadcastReceiver {
	
	@Override
	public void onReceive(final Context context, Intent intent) {
		
		Toast.makeText(context, "Got it", Toast.LENGTH_SHORT).show();
		Log.e("", "Got it");
		
	}
}	
	