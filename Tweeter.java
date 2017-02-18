package com.example.vibhor.twiiiteraati;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tweeeter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweeeter);
    }

    public void openUser(View view) {
        startActivity(new Intent(this, User.class));
    }
}
