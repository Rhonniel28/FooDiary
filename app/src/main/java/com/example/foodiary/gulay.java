package com.example.foodiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class gulay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gulay);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent Intent = new Intent(gulay.this, shop_menu.class);
        startActivity(Intent);
        finish();
    }
}