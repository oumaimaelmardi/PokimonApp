package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailPoki extends AppCompatActivity {
  TextView name;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_poki);
     /*  name = findViewById(R.id.griddata);
       image = findViewById(R.id.imageView);

        Intent intent = getIntent();
        String nameExtra = intent.getStringExtra("name");
        name.setText(nameExtra);
        image.setImageResource(intent.getIntExtra("image",0));*/

    }
}