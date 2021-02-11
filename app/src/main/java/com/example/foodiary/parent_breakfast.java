package com.example.foodiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class parent_breakfast extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_breakfast);


    }

    public void choice1(View view) {
        Intent Intent = new Intent(parent_breakfast.this, child1_breakfast.class);
        startActivity(Intent);
        finish();
    }

    public void choice2(View view) {
        Intent Intent = new Intent(parent_breakfast.this, child2_breakfast.class);
        startActivity(Intent);
        finish();
    }

    public void choice3(View view) {
        Intent Intent = new Intent(parent_breakfast.this, child3_breakfast.class);
        startActivity(Intent);
        finish();
    }

    public void choice4(View view) {
        Intent Intent = new Intent(parent_breakfast.this, child4_breakfast.class);
        startActivity(Intent);
        finish();
    }

    public void choice5(View view) {
        Intent Intent = new Intent(parent_breakfast.this, child5_breakfast.class);
        startActivity(Intent);
        finish();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent Intent = new Intent(parent_breakfast.this, recipes_menu.class);
        startActivity(Intent);
        finish();

    }
}