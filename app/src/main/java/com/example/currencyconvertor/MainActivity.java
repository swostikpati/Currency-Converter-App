package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.preference.EditTextPreference;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void clickFunction(View view){
        Log.i("info","Button Pressed");
        EditText amountEditText=(EditText)findViewById(R.id.amountEditText);
        float amount = Float.parseFloat(amountEditText.getText().toString());
        amount*=75.96;
        Toast.makeText(this, "The amount in INR is " + amount, Toast.LENGTH_SHORT).show();




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}