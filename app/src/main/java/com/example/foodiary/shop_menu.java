package com.example.foodiary;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class shop_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_menu);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent Intent = new Intent(shop_menu.this, main_page.class);
        startActivity(Intent);
        finish();
    }

    public void vegbtn(View view) {
            Intent Intent = new Intent(shop_menu.this, gulay.class);
            startActivity(Intent);
            finish();
    }

    public void frubtn(View view) {
        Intent Intent = new Intent(shop_menu.this, prutas.class);
        startActivity(Intent);
        finish();
    }
}