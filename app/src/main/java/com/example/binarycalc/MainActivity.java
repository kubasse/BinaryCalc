package com.example.binarycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText n1EditText, n2EditText;
    Button plusButton, minus1Button, minus2Button, multiButton, divi1Button, divi2Button;
    TextView numA1TextView, numA2TextView, numB1TextView, numB2TextView, result1TextView, result2TextView, operationTextView, equalTextView;
    int a, b, result, resultHelp, minusInt;
    String aBin, bBin, resultBin, diviHelper;
    double diviResult, minusResult;
    DecimalFormat f;

    public void AplusB(View v){
        try {
            aBin = n1EditText.getText().toString();
            bBin = n2EditText.getText().toString();
            a = Integer.parseInt(aBin, 2);
            b = Integer.parseInt(bBin, 2);
            result = a + b;
            resultBin = Integer.toBinaryString(result);
            numA1TextView.setText("" + a);
            numB1TextView.setText("" + b);
            result1TextView.setText("" + result);
            numA2TextView.setText(aBin);
            numB2TextView.setText(bBin);
            result2TextView.setText(resultBin);
            equalTextView.setVisibility(View.VISIBLE);
            operationTextView.setText("+");
        }
        catch (Exception e)
        {
           Toast.makeText(getApplicationContext(),"You entered wrong number!",Toast.LENGTH_LONG).show();
        }
    }

    public void AminusB(View v){
        try {
            aBin = n1EditText.getText().toString();
            bBin = n2EditText.getText().toString();
            a = Integer.parseInt(aBin, 2);
            b = Integer.parseInt(bBin, 2);
            minusResult = ((double)a) - ((double)b);
            result = a - b;
            numA1TextView.setText("" + a);
            numB1TextView.setText("" + b);
            result1TextView.setText("" + result);
            numA2TextView.setText(aBin);
            numB2TextView.setText(bBin);
            if(minusResult < 0){
                minusInt = ~result;
                minusInt += 1;
                resultBin = Integer.toBinaryString(minusInt);
                resultBin =resultBin.substring(1);
                result2TextView.setText(resultBin+"u2");
            }
            else {
                resultBin = Integer.toBinaryString(result);
                result2TextView.setText(resultBin);
            }
            equalTextView.setVisibility(View.VISIBLE);
            operationTextView.setText("-");
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"You entered wrong number!",Toast.LENGTH_LONG).show();
        }
    }

    public void BminusA(View v){
        try {
            aBin = n1EditText.getText().toString();
            bBin = n2EditText.getText().toString();
            a = Integer.parseInt(aBin, 2);
            b = Integer.parseInt(bBin, 2);
            minusResult = ((double)b) - ((double)a);
            result = b - a;
            numA1TextView.setText("" + b);
            numB1TextView.setText("" + a);
            result1TextView.setText("" + result);
            numA2TextView.setText(bBin);
            numB2TextView.setText(aBin);
            if(minusResult < 0){
                minusInt = ~result;
                minusInt += 1;
                resultBin = Integer.toBinaryString(minusInt);
                resultBin =resultBin.substring(1);
                result2TextView.setText(resultBin+"u2");
            }
            else {
                resultBin = Integer.toBinaryString(result);
                result2TextView.setText(resultBin);
            }
            equalTextView.setVisibility(View.VISIBLE);
            operationTextView.setText("-");
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"You entered wrong number!",Toast.LENGTH_LONG).show();
        }
    }

    public void AmultiB(View v){
        try {
            aBin = n1EditText.getText().toString();
            bBin = n2EditText.getText().toString();
            a = Integer.parseInt(aBin, 2);
            b = Integer.parseInt(bBin, 2);
            result = a * b;
            resultBin = Integer.toBinaryString(result);
            numA1TextView.setText("" + a);
            numB1TextView.setText("" + b);
            result1TextView.setText("" + result);
            numA2TextView.setText(aBin);
            numB2TextView.setText(bBin);
            result2TextView.setText(resultBin);
            equalTextView.setVisibility(View.VISIBLE);
            operationTextView.setText("x");
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"You entered wrong number!",Toast.LENGTH_LONG).show();
        }
    }

    public void AdiviB(View v){
        try {
            aBin = n1EditText.getText().toString();
            bBin = n2EditText.getText().toString();
            a = Integer.parseInt(aBin, 2);
            b = Integer.parseInt(bBin, 2);
            diviResult = ((double)a) / ((double)b);
            if(diviResult < 0){

            }
            diviHelper = f.format(diviResult);
            result = (int)Math.round(diviResult);
            resultBin = Integer.toBinaryString(result);
            numA1TextView.setText("" + a);
            numB1TextView.setText("" + b);
            result1TextView.setText("" + diviHelper);
            numA2TextView.setText(aBin);
            numB2TextView.setText(bBin);
            result2TextView.setText(resultBin);
            equalTextView.setVisibility(View.VISIBLE);
            operationTextView.setText("/");
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"You entered wrong number!",Toast.LENGTH_LONG).show();
        }
    }

    public void BdiviA(View v){
        try {
            aBin = n1EditText.getText().toString();
            bBin = n2EditText.getText().toString();
            a = Integer.parseInt(aBin, 2);
            b = Integer.parseInt(bBin, 2);
            diviResult = ((double)b) / ((double)a);
            diviHelper = f.format(diviResult);
            result = (int)Math.round(diviResult);
            resultBin = Integer.toBinaryString(result);
            numA1TextView.setText("" + b);
            numB1TextView.setText("" + a);
            result1TextView.setText("" + diviHelper);
            numA2TextView.setText(bBin);
            numB2TextView.setText(aBin);
            result2TextView.setText(resultBin);
            equalTextView.setVisibility(View.VISIBLE);
            operationTextView.setText("/");
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"You entered wrong number!",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        n1EditText = findViewById(R.id.n1EditText);
        n2EditText = findViewById(R.id.n2EditText);
        plusButton = findViewById(R.id.plusButton);
        minus1Button = findViewById(R.id.minus1Button);
        minus2Button = findViewById(R.id.minus2Button);
        multiButton = findViewById(R.id.multiButton);
        divi1Button = findViewById(R.id.divi1Button);
        divi2Button = findViewById(R.id.divi2Button);
        numA1TextView = findViewById(R.id.numA1TextView);
        numA2TextView = findViewById(R.id.numA2TextView);
        numB1TextView = findViewById(R.id.numB1TextView);
        numB2TextView = findViewById(R.id.numB2TextView);
        result1TextView = findViewById(R.id.result1TextView);
        result2TextView = findViewById(R.id.result2TextView);
        operationTextView = findViewById(R.id.operationTextView);
        equalTextView = findViewById(R.id.equalTextView);
        f = new DecimalFormat("0.00");
    }
}