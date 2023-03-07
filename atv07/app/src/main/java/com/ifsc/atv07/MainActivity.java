package com.ifsc.atv07;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ifsc.atv07.R;

public class MainActivity extends AppCompatActivity {
    private TextView resultado;
    private EditText n01 ;
    private EditText n02;
    private Button sorteio;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        n01 = findViewById(R.id.n01);
        n02 = findViewById(R.id.n02);
        sorteio = findViewById(R.id.botaosorteio);
        resultado = findViewById(R.id.results);

        sorteio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int n1 = Integer.parseInt(String.valueOf(n01.getText()));
                int n2 = Integer.parseInt(String.valueOf(n02.getText()));
                if(n1 <= n2) {
                    int resutado = n2 - n1 + 1;

                    int num1 = (int) (Math.random()  *resutado) + n1;


                    resultado.setText("Resultado dos números" + num1);
                }else {
                    resultado.setText("Resultado dos números errado");
                }
            }
        });

    }
}