package com.example.mrlor.androidlab05;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

   // public static final String BROADCAST = "PACKAGE_NAME.android.action.broadcast";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving

        //Toast.makeText(context,"Broadcast odebrany, ekran odblokowany ", Toast.LENGTH_LONG).show();
        Log.d("YourTag", "YourOutput");
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
