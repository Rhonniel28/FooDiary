package com.example.foodiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class prutas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prutas);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent Intent = new Intent(prutas.this, shop_menu.class);
        startActivity(Intent);
        finish();
    }
}
