package com.example.gai.appgai;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by gai on 25/12/2016.
 */

public class MyReceiver extends BroadcastReceiver {

    //each message is received as a Intent object parameter
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();
    }
}
