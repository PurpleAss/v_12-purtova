package com.example.purtova_v_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class personal_area extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);
    }

    public void onNewActivity(View view) {
        startActivity(new Intent(this, login.class));
    }

    public void onNewActivity2(View view) {
        startActivity(new Intent(this, search.class));
    }


}
