package com.ifsc.n6;
import static com.example.tese.R.id.botaoClicks;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tese.R;

public class MainActivity extends AppCompatActivity {
    private Button contador;
    private TextView totalCLick;
    private int totalNumeros = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = (Button) findViewById(botaoClicks);
        totalCLick = (TextView) findViewById(R.id.soma);

        contador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalNumeros = totalNumeros+1;
                String resultado = String.valueOf(totalNumeros);
                totalCLick.setText("Cliks contados"+resultado);
            }


        });

    }
}