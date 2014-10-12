package com.siribalajitowers;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

 public class AppInstalledService extends Service{
public void onCreate() {

    super.onCreate();
    Intent intent = new Intent(this, MainActivity.class);
    PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0);
AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()
        + (5 * 1000), pendingIntent);
    Toast.makeText(this, "Alarm set in 5 seconds",
        Toast.LENGTH_LONG).show();
    }


@Override
public IBinder onBind(Intent arg0) {
    // TODO Auto-generated method stub
    return null;
   }

}