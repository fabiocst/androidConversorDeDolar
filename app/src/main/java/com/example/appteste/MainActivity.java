package com.example.appteste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txtRes = (TextView) findViewById(R.id.txtResultado);
        final EditText vDolar=(EditText) findViewById(R.id.vDolar);

        final Button calcular =(Button) findViewById(R.id.btnCalc);
        calcular.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Double valor=Double.parseDouble(vDolar.getText().toString());

                txtRes.setText(valor+" dolares, são "+valor*4.94+" reais");




            }
        });

    }
}