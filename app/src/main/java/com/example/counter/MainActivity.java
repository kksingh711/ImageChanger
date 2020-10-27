package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity<t> extends AppCompatActivity {
    ImageView t;
    Button b;
    int n=0;
    public int[] img={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(ImageView) findViewById(R.id.imageView);
        b=(Button)findViewById(R.id.button);
        View.OnClickListener op=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n++;
                t.setImageResource(img[n%5]);
            }
        };
        b.setOnClickListener(op);

    }

}