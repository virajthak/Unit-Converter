package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mTocm (View view){
        EditText textFieldOne = findViewById(R.id.textFieldOne);
        String userInputS = textFieldOne.getText().toString();
        double userInputD = Double.parseDouble(userInputS);
        double output = (userInputD*100);
        String outputString = Double.toString(output);
        Toast.makeText(getApplicationContext(),outputString, Toast.LENGTH_SHORT).show();
    }

    public void mTokm (View view){
        EditText textFieldOne = findViewById(R.id.textFieldOne);
        String userInputS = textFieldOne.getText().toString();
        double userInputD = Double.parseDouble(userInputS);
        double output = (userInputD/1000);
        String outputString = Double.toString(output);
        Toast.makeText(getApplicationContext(),outputString, Toast.LENGTH_SHORT).show();
    }

    public void mTomm (View view){
        EditText textFieldOne = findViewById(R.id.textFieldOne);
        String userInputS = textFieldOne.getText().toString();
        double userInputD = Double.parseDouble(userInputS);
        double output = (userInputD*1000);
        String outputString = Double.toString(output);
        Toast.makeText(getApplicationContext(),outputString, Toast.LENGTH_SHORT).show();
    }

    public void cmTom (View view){
        EditText textFieldOne = findViewById(R.id.textFieldOne);
        String userInputS = textFieldOne.getText().toString();
        double userInputD = Double.parseDouble(userInputS);
        double output = (userInputD/100);
        String outputString = Double.toString(output);
        Toast.makeText(getApplicationContext(),outputString, Toast.LENGTH_SHORT).show();
    }

    public void kmTom (View view){
        EditText textFieldOne = findViewById(R.id.textFieldOne);
        String userInputS = textFieldOne.getText().toString();
        double userInputD = Double.parseDouble(userInputS);
        double output = (userInputD*1000);
        String outputString = Double.toString(output);
        Toast.makeText(getApplicationContext(),outputString, Toast.LENGTH_SHORT).show();
    }

    public void mmTom (View view){
        EditText textFieldOne = findViewById(R.id.textFieldOne);
        String userInputS = textFieldOne.getText().toString();
        double userInputD = Double.parseDouble(userInputS);
        double output = (userInputD/1000);
        String outputString = Double.toString(output);
        Toast.makeText(getApplicationContext(),outputString, Toast.LENGTH_SHORT).show();
    }

}