package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText1, editText2;
    Button addButton, subButton;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        Toast.makeText(FourthActivity.this,"Absolute Layout",Toast.LENGTH_SHORT).show();

        editText1 = findViewById(R.id.editText1Id);
        editText2 = findViewById(R.id.editText2Id);

        addButton = findViewById(R.id.addButtonId);
        subButton = findViewById(R.id.subButtonId);

        resultTextView = findViewById(R.id.ResultTextViewId);

        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        String number1 = editText1.getText().toString();
        String number2 = editText2.getText().toString();

        double num1 = Double.parseDouble(number1);
        double num2 = Double.parseDouble(number2);

        if (v.getId() == R.id.addButtonId) {
            double sum = num1 + num2;
            resultTextView.setText("Result:" + sum);
        }
        else if (v.getId() == R.id.subButtonId) {
            double sub = num1 - num2;
            resultTextView.setText("Result:" + sub);
        }

        Intent nextIntent = new Intent(FourthActivity.this,FifthActivity.class);
        startActivity(nextIntent);
    }
}
