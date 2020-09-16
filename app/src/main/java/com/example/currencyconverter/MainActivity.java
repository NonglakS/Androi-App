package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
/**
 * Practice project converted currency
 * Author: Emmi Nonglak Sae-ueng
 * Date: 9/16/2020
 * */
public class MainActivity extends AppCompatActivity {
public void convert(View view){

    Log.i("info", "Button Pressed");
    EditText amount = (EditText)findViewById(R.id.numberEditText);
    Log.i("info", amount.getText().toString());

    //convert string to double
   String amountInTHB = amount.getText().toString();
   double amountInTHB_doble = Double.parseDouble(amountInTHB);
   double amountIndollars_double = amountInTHB_doble/31.1;

    //convert double to string
    String amountIndollars_string = String.format("%.2f",amountIndollars_double);
    Toast.makeText(this,"$ "+ amountIndollars_string, Toast.LENGTH_LONG).show();
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}