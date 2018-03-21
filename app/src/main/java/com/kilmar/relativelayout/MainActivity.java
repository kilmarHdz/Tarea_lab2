package com.kilmar.relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView pointA;
    private TextView pointB;
    private Button oneA;
    private Button oneB;
    private Button twoA;
    private Button twoB;
    private Button threeA;
    private Button threeB;
    private Button reset;
    private int puntosA;
    private int puntosB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pointA = findViewById(R.id.pointA);
        pointB = findViewById(R.id.pointB);
        oneA = findViewById(R.id.oneA);
        oneB = findViewById(R.id.oneB);
        twoA = findViewById(R.id.twoA);
        twoB = findViewById(R.id.twoB);
        threeA = findViewById(R.id.threeA);
        threeB = findViewById(R.id.threeB);
        reset = findViewById(R.id.reset);





        oneA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Mensaje", "+1");
                puntosA = puntosA +1;
                pointA.setText(puntosA + "");
            }
        });

        oneB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Mensaje", "+1");
                puntosB = puntosB +1;
                pointB.setText(puntosB + "");
            }
        });

        twoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Mensaje","+2");
                puntosA = puntosA +2;
                pointA.setText(puntosA + "");
            }
        });

        twoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Mensaje","+2");
                puntosB = puntosB +2;
                pointB.setText(puntosB + "");
            }
        });

        threeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Mensaje","+3");
                puntosA = puntosA +3;
                pointA.setText(puntosA + "");
            }
        });

        threeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Mensaje","+3");
                puntosB = puntosB +3;
                pointB.setText(puntosB + "");
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Mensaje","Evento de boton añadido desde Java");
                puntosA= 0;
                pointA.setText(puntosA + "");
                puntosB= 0;
                pointB.setText(puntosB + "");
            }
        });
    }

    public void cancelar (View v){
        Log.d("Mensaje", "Evento de boton añadido desde xml");
    }
}
