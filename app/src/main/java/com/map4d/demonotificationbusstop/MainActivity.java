package com.map4d.demonotificationbusstop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {
    private String token;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getToken();
        FirebaseMessaging.getInstance().subscribeToTopic("vnbus");
        token= FirebaseInstanceId.getInstance().getToken();
        String email = "nacac";
//        saveToken(email ,token);
        Log.e("ahcajcacwcaca",""+token);

    }

    public void getToken(){
        FirebaseMessaging.getInstance().subscribeToTopic("vnbus");
        token = FirebaseInstanceId.getInstance().getToken();
        Log.e("ahcajc",""+token);
    }
}
