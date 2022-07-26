package com.example.pushnotifications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessaging;

public class Topics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);
    }

    public void BBC(View view) {
        FirebaseMessaging.getInstance().subscribeToTopic("BBC");
        Toast.makeText(this, "Successfully subscribed to BBC!", Toast.LENGTH_SHORT).show();
    }

    public void NG(View view) {
        FirebaseMessaging.getInstance().subscribeToTopic("NatinonalGeography");
        Toast.makeText(this, "Successfully subscribed to National Geography!", Toast.LENGTH_SHORT).show();
    }
}