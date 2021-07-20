package com.example.fcm_activity;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FIrebaseInstanceIdService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIdService";

    @Override
    public void onTokenRefresh() {//각 핸드폰에있는 난수의 값들을 받을 수 있다.
       String token = FirebaseInstanceId.getInstance().getToken();
       Log.e(TAG,token);

       sendRegistrationToServer(token);
    }

    //자체제작
    private void sendRegistrationToServer(String token) {

    }

}
