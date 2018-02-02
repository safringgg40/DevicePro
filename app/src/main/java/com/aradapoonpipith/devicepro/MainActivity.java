package com.aradapoonpipith.devicepro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickSignIn(View view) {
        startActivity(new Intent(MainActivity.this, Main2Activity.class));
    }
    public void clickSignUp(View view) {
        startActivity(new Intent(MainActivity.this, Register.class));
    }
}
