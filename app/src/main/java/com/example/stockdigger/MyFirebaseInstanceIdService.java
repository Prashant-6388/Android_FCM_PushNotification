package com.example.stockdigger;

import android.app.Service;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseInstanceIdService extends FirebaseMessagingService {
    String TAG = "PushNotifService";
    String name;

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.e("NEW_TOKEN",s);
        System.out.println("New Token = "+s);

    }
}
