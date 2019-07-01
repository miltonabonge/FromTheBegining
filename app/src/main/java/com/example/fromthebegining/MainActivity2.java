package com.example.fromthebegining;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity{
    private static final String TAG ="MainActivity2";

    private ImageView imageView;
    private TextView tvName;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explicitintent);

        // Step 5: Retreive the text pass from the intent
        String name = getIntent().getStringExtra("NAME");

        imageView = findViewById(R.id.iv);


        // Step 6+ init view and load text
        tvName = findViewById(R.id.name);
        tvName.setText(name);


    }

}
