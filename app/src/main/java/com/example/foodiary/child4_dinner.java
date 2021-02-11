package com.example.foodiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class child4_dinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child4_dinner);
    }




    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent Intent = new Intent(child4_dinner.this, parent_dinner.class);
        startActivity(Intent);
        finish();
    }
}