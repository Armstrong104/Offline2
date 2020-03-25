package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView imageView1,imageView2,imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Toast.makeText(ThirdActivity.this,"Frame Layout",Toast.LENGTH_SHORT).show();

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.imageView1)
        {
            imageView1.setVisibility(View.GONE);
            imageView2.setVisibility(View.VISIBLE);
        }
        else if(v.getId() == R.id.imageView2)
        {
            imageView2.setVisibility(View.GONE);
            imageView3.setVisibility(View.VISIBLE);
        }
        else if(v.getId() == R.id.imageView3)
        {
            imageView3.setVisibility(View.GONE);
            imageView1.setVisibility(View.VISIBLE);
        }

        Intent intent = new Intent(ThirdActivity.this,FourthActivity.class);
        startActivity(intent);
    }
}
