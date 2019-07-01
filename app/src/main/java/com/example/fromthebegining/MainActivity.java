package com.example.fromthebegining;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private static final String TAG = "MainActivity";

private Button btnlogin;
// Step 1: declare views
private EditText nameEditText;
private EditText Password;
private EditText Info;





    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.implicitintents);

//        btnlogin = findViewById(R.id.login);
        btnlogin = findViewById(R.id.login);
        btnlogin.setOnClickListener(this);
        

        // Step 2: Intialize vies
        nameEditText = findViewById(R.id.Name);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login:
                // Step 3: extract the text from the EditText
                String name = nameEditText.getText().toString();
                
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                // Step 4: Pass the extracted text to the Next activity through the intent.putExtra
                intent.putExtra("NAME", name);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"this is fun",Toast.LENGTH_LONG).show();
                break;

    }
  }
}
