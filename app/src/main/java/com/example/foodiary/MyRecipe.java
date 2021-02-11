package com.example.foodiary;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashSet;

public class MyRecipe extends AppCompatActivity {

    int noteId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recipe);

        EditText editText = (EditText) findViewById(R.id.editText);

        Intent intent = getIntent();
       noteId = intent.getIntExtra("noteId", -1);

        if (noteId != -1) {

            editText.setText(AddRecipe.notes.get(noteId));

        } else {
            AddRecipe.notes.add("");
            noteId = AddRecipe.notes.size() -1;
            AddRecipe.arrayAdapter.notifyDataSetChanged();
        }

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {

                AddRecipe.notes.set(noteId, String.valueOf(charSequence));
                AddRecipe.arrayAdapter.notifyDataSetChanged();

                SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("com.example.foodiary", Context.MODE_PRIVATE);

                HashSet<String> set =  new HashSet(AddRecipe.notes);
                sharedPreferences.edit().putStringSet("notes", set).apply();

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



    }//onCreate
}//myrecipe

