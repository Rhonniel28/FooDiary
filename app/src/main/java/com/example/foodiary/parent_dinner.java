package com.example.foodiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class parent_dinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_dinner);
    }




    public void din1(View view) {
        Intent Intent = new Intent(parent_dinner.this, child1_dinner.class);
        startActivity(Intent);
        finish();
    }

    public void din2(View view) {
        Intent Intent = new Intent(parent_dinner.this, child2_dinner.class);
        startActivity(Intent);
        finish();
    }

    public void din3(View view) {
        Intent Intent = new Intent(parent_dinner.this, child3_dinner.class);
        startActivity(Intent);
        finish();
    }


    public void din4(View view) {
        Intent Intent = new Intent(parent_dinner.this, child4_dinner.class);
        startActivity(Intent);
        finish();
    }

    public void din5(View view) {
        Intent Intent = new Intent(parent_dinner.this, child5_dinner.class);
        startActivity(Intent);
        finish();
    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent Intent = new Intent(parent_dinner.this, recipes_menu.class);
        startActivity(Intent);
        finish();

    }

}