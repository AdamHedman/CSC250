package com.example.csc250;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText inputET;
    private TextView answerTV;
    private int factorial;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.inputET = this.findViewById(R.id.inputET);
        this.answerTV = this.findViewById(R.id.answerTV);
    }

    public void onFactorialButtonClicked(View v)
    {
        String currValue = this.inputET.getText().toString();
        this.answerTV.setText(currValue);
    }
    public void calcFactorial() {
        int num = 0;
        if(!inputET.getText().toString().equals(""))
            num = Integer.parseInt(inputET.getText().toString());
        for(int i = 1; i <= num; i++){
            factorial = i * factorial;
        }

}

