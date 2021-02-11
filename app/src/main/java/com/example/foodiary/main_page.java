package com.example.foodiary;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class main_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }


    public void addbtn(View view) {
        Intent Intent = new Intent(main_page.this, AddRecipe.class);
        startActivity(Intent);
        finish();
    }

    public void recipebtn(View view) {
        Intent Intent = new Intent(main_page.this, recipes_menu.class);
        startActivity(Intent);
        finish();
    }

    public void shopbtn(View view) {
        Intent Intent = new Intent(main_page.this, shop_menu.class);
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
                        main_page.super.onBackPressed();
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




}