package com.example.vibhor.twiiiteraati;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class User extends AppCompatActivity {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        et =  ((EditText) findViewById(R.id.et_name)};

    public void getFeedback(View view) {
        if (et != null) {
            Intent intent = new Intent(this, Feedback.class);
            intent.putExtra("feedback", et.getText());
            startActivity(intent);
        }
    }
}
