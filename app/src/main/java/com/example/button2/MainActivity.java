package com.example.button2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int counter =1;
    public void clicked(View view) {

        Button button = (Button)findViewById(R.id.button);
        button.setText("This is a click number: " + counter);
        counter++;
    }
}