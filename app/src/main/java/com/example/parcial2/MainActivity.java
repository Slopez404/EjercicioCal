package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultado_final;
    private EditText num_uno;
    private EditText num_dos;

    private Button b_suma;
    private Button b_resta;
    private Button b_multi;
    private Button b_division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado_final = findViewById(R.id.resultado);

        num_uno = findViewById(R.id.numero1);
        num_dos = findViewById(R.id.numero2);

        b_suma = findViewById(R.id.btn_suma);
        b_resta = findViewById(R.id.btn_resta);
        b_multi = findViewById(R.id.btn_multi);

        b_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               resultado_final.setText(suma(Integer.parseInt(num_uno.getText().toString()),Integer.parseInt(num_dos.getText().toString()))+"");
            }
        });

        b_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado_final.setText(resta(Integer.parseInt(num_uno.getText().toString()),Integer.parseInt(num_dos.getText().toString()))+"");
            }
        });

        b_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado_final.setText(multi(Integer.parseInt(num_uno.getText().toString()),Integer.parseInt(num_dos.getText().toString()))+"");
            }
        });



    }
    public int suma (int a, int b){
        return a+b;
    }
    public int resta (int a, int b){

        return a-b;
    }
    public int multi (int a, int b){

        return a*b;
    }
    public int division (int a, int b){

        return a/b;
    }



}