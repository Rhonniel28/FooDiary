package com.example.foodiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class parent_lunch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_lunch);
    }

    public void lunch1(View view) {
        Intent Intent = new Intent(parent_lunch.this, child1_lunch.class);
        startActivity(Intent);
        finish();
    }

    public void lunch2(View view) {
        Intent Intent = new Intent(parent_lunch.this, child2_lunch.class);
        startActivity(Intent);
        finish();
    }

    public void lunch3(View view) {
        Intent Intent = new Intent(parent_lunch.this, child3_lunch.class);
        startActivity(Intent);
        finish();
    }

    public void lunch4(View view) {
        Intent Intent = new Intent(parent_lunch.this, child4_lunch.class);
        startActivity(Intent);
        finish();
    }

    public void lunch5(View view) {
        Intent Intent = new Intent(parent_lunch.this, child5_lunch.class);
        startActivity(Intent);
        finish();
    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent Intent = new Intent(parent_lunch.this, recipes_menu.class);
        startActivity(Intent);
        finish();

    }


}