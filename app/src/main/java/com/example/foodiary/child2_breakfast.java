package com.example.foodiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class child2_breakfast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child2_breakfast);
    }




    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent Intent = new Intent(child2_breakfast.this, parent_breakfast.class);
        startActivity(Intent);
        finish();
    }

}