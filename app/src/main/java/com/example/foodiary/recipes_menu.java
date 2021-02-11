package com.example.foodiary;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;

public class recipes_menu extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes_menu);




    }//oncreate

    public void bfast(View view) {
        Intent Intent = new Intent(recipes_menu.this, parent_breakfast.class);
        startActivity(Intent);
        finish();
    }

    public void lunch(View view) {
        Intent Intent = new Intent(recipes_menu.this, parent_lunch.class);
        startActivity(Intent);
        finish();
    }

    public void dinner(View view) {
        Intent Intent = new Intent(recipes_menu.this, parent_dinner.class);
        startActivity(Intent);
        finish();
    }




    //exit pag back
    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Are you sure you want to exit FooDiary?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        recipes_menu.super.onBackPressed();
                        finish();
                    }
                })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }


    public void rebackbtn(View view) {
        Intent Intent = new Intent(recipes_menu.this, main_page.class);
        startActivity(Intent);
        finish();
    }
}