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
    String one = "";
    String two = "";
    String operand = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void numSelected(View v){
        if(v.getId() == R.id.AddButton){
            isAdd = true;
            operand += "+";
        }
        else if(v.getId() == R.id.SubtractButton){
            isSub = true;
            operand += "-";
        }
        else if(v.getId() == R.id.multButton){
            isMult = true;
            operand += "X";
        }
        else if(v.getId() == R.id.divideButton){
            isDiv = true;
            operand += "/";
        }

        else if(isAdd == false && isSub == false && isMult == false && isDiv == false){
            if(v.getId() == R.id.b0){
                one += "0";
            }
            else if(v.getId() == R.id.b1){
                one += "1";
            }
            else if(v.getId() == R.id.b2){
                one += "2";
            }
            else if(v.getId() == R.id.b3){
                one += "3";
            }
            else if(v.getId() == R.id.b4){
                one += "4";
            }
            else if(v.getId() == R.id.b5){
                one += "5";
            }
            else if(v.getId() == R.id.b6){
                one += "6";
            }
            else if(v.getId() == R.id.b7){
                one += "7";
            }
            else if(v.getId() == R.id.b8){
                one += "8";
            }
            else if(v.getId() == R.id.b9){
                one += "9";
            }
        }
        else{
            if(v.getId() == R.id.b0){
                two += "0";
            }
            else if(v.getId() == R.id.b1){
                two += "1";
            }
            else if(v.getId() == R.id.b2){
                two += "2";
            }
            else if(v.getId() == R.id.b3){
                two += "3";
            }
            else if(v.getId() == R.id.b4){
                two += "4";
            }
            else if(v.getId() == R.id.b5){
                two += "5";
            }
            else if(v.getId() == R.id.b6){
                two += "6";
            }
            else if(v.getId() == R.id.b7){
                two += "7";
            }
            else if(v.getId() == R.id.b8){
                two += "8";
            }
            else if(v.getId() == R.id.b9){
                two += "9";
            }

            calculate(Double.parseDouble(one), Double.parseDouble(two));
        }
        TextView infoTVOutput = findViewById(R.id.outputTextView);
        infoTVOutput.setText(one + operand + two);
    }
    public void calculate(double val1Double, double val2Double){
        double output;

        if(isAdd){
            output = val1Double + val2Double;
            TextView infoTVOutput = findViewById(R.id.equalsTextView);

            String str = output + "";
            infoTVOutput.setText("=" + str);
        }
        else if(isSub){
            output = val1Double - val2Double;
            TextView infoTVOutput2 = findViewById(R.id.equalsTextView);

            String str2 = output + "";
            infoTVOutput2.setText("=" + str2);
        }
        else if(isMult){
            output = val1Double * val2Double;
            TextView infoTVOutput3 = findViewById(R.id.equalsTextView);

            String str3 = output + "";
            infoTVOutput3.setText("=" + str3);
        }
        else{
            output = val1Double / val2Double;
            TextView infoTVOutput4 = findViewById(R.id.equalsTextView);

            String str4 = output + "";
            infoTVOutput4.setText("=" + str4);
        }
    }

    public void clear(View v){
        isAdd = false;
        isSub = false;
        isDiv = false;
        isMult = true;
        one = "";
        two = "";
        operand = "";

        TextView infoTVOutput = findViewById(R.id.equalsTextView);
        infoTVOutput.setText("=");

        TextView infoTVOutput2 = findViewById(R.id.outputTextView);
        infoTVOutput2.setText("Input Here");
    }

}