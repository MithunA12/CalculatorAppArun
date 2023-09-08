package com.example.calculatorapparun;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import okhttp3.*;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    boolean isAdd;
    boolean isSub;
    boolean isMult;
    boolean isDiv;
    String question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchScreens(View v){
        Intent intent = new Intent(this, WordProblemActivity.class);
        startActivity(intent);
    }

    public void calculate(View v){
        double output;
        EditText val1ET = findViewById(R.id.inputTextOne);
        String val1 = val1ET.getText().toString();
        double val1Double = Double.parseDouble(val1);

        EditText val2ET = findViewById(R.id.inputTextTwo);
        String val2 = val2ET.getText().toString();
        double val2Double = Double.parseDouble(val2);

        if(isAdd){
            output = val1Double + val2Double;
            TextView infoTVOutput = findViewById(R.id.outputTextView);

            String str = output + "";
            infoTVOutput.setText(str);
        }
        else if(isSub){
            output = val1Double - val2Double;
            TextView infoTVOutput2 = findViewById(R.id.outputTextView);

            String str2 = output + "";
            infoTVOutput2.setText(str2);
        }
        else if(isMult){
            output = val1Double * val2Double;
            TextView infoTVOutput3 = findViewById(R.id.outputTextView);

            String str3 = output + "";
            infoTVOutput3.setText(str3);
        }
        else{
            output = val1Double / val2Double;
            TextView infoTVOutput4 = findViewById(R.id.outputTextView);

            String str4 = output + "";
            infoTVOutput4.setText(str4);
        }
        isAdd = false;
        isSub = false;
        isMult = false;
        isDiv = false;
    }

    public void add(View v){
        isAdd = true;
    }
    public void sub(View v){
        isSub = true;
    }
    public void mult(View v){
        isMult = true;
    }
    public void div(View v){
        isDiv = true;
    }
}