package com.example.calculatorapparun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    boolean isAdd;
    boolean isSub;
    boolean isMult;
    boolean isDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View v){

        EditText val1ET = findViewById(R.id.inputTextOne);
        String val1 = val1ET.getText().toString();
        double val1Double = Double.parseDouble(val1);

        EditText val2ET = findViewById(R.id.inputTextTwo);
        String val2 = val2ET.getText().toString();

        if(isAdd){

        }
    }
}