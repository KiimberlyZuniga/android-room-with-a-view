package com.example.android.roomwordssample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditWord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_word);

        Button but = findViewById(R.id.buttonEdit);
        but.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditWord.this, MainActivity.class);
                //startActivityForResult(intent, EDIT_WORD);
               // mWordViewModel.getAllWords();
            }
        });
    }


}