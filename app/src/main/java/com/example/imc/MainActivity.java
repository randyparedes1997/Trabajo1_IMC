package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcular = (Button)findViewById(R.id.btncalcular);

        calcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView tvpeso = (TextView)findViewById(R.id.txtpeso);
                TextView tvaltura = (TextView)findViewById(R.id.txtaltura);

                double peso = Double.parseDouble(tvpeso.getText().toString());
                double altura = Double.parseDouble(tvaltura.getText().toString());
                double IMC = peso/(altura*altura);

                Toast.makeText(MainActivity.this, "Su IMC es :" + IMC, Toast.LENGTH_SHORT).show();

            }
        });

    }


}