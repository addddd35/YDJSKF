package com.edu.swufe.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counterA;
    int counterB;
    TextView sCHN,sUSA;
    Button chn3,chn2,chn1,usa3,usa2,usa1,reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sCHN=findViewById(R.id.scoreCHN);
        sUSA=findViewById(R.id.scoreUSA);
        chn1=findViewById(R.id.pointCHNOne);
        chn2=findViewById(R.id.pointCHNTwo);
        chn3=findViewById(R.id.pointCHNThree);
        usa1=findViewById(R.id.pointUSAOne);
        usa2=findViewById(R.id.pointUSATwo);
        usa3=findViewById(R.id.pointUSAThree);
        reset=findViewById(R.id.reset);

        counterA=0;
        counterB=0;
        chn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterA=counterA+3;
                sCHN.setText(String.valueOf(counterA));
            }
        });
        chn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterA=counterA+2;
                sCHN.setText(String.valueOf(counterA));
            }
        });
        chn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterA=counterA+1;
                sCHN.setText(String.valueOf(counterA));
            }
        });
        usa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterB=counterB+3;
                sUSA.setText(String.valueOf(counterB));
            }
        });
        usa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterB=counterB+2;
                sUSA.setText(String.valueOf(counterB));
            }
        });
        usa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterB=counterB+1;
                sUSA.setText(String.valueOf(counterB));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterA=0;
                counterB=0;
                sCHN.setText(String.valueOf(counterA));
                sUSA.setText(String.valueOf(counterB));
            }
        });




        // Example of a call to a native method
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}