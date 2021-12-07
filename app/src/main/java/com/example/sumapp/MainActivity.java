package com.example.sumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText n1,n2;
    private Button bnt;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1= (EditText) findViewById(R.id.editTextNumber);
        n2=findViewById(R.id.editTextNumber2);
        tv=findViewById(R.id.textView);
        bnt=findViewById(R.id.button);
        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num=n1.getText().toString();
                String num2=n2.getText().toString();
                int res=Integer.parseInt(num)+Integer.parseInt(num2);
                tv.setText("answer is ="+res);

            }
        });

    }
}