package com.example.foodiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class child4_breakfast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child4_breakfast);
    }




    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent Intent = new Intent(child4_breakfast.this, parent_breakfast.class);
        startActivity(Intent);
        finish();
    }

}