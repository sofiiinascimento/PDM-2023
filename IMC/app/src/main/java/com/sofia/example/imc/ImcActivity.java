package com.sofia.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ImcActivity extends AppCompatActivity {
    String nome;
    Double peso, altura;
    TextView tvNome, tvPeso, tvAltura, tvImc;

    DecimalFormat decimalFormat=new DecimalFormat("##,###,##0.00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        Bundle bundle = getIntent().getExtras();
        nome = bundle.getString("nome");
        peso = bundle.getDouble("peso");
        altura = bundle.getDouble("altura");

        tvNome=findViewById(R.id.tvNome);
        tvPeso=findViewById(R.id.tvPeso);
        tvAltura=findViewById(R.id.tvAltura);
        tvImc=findViewById(R.id.tvImc);

    }

    @Override
    protected void onStart() {
        super.onStart();
        tvNome.setText(nome);
        tvAltura.setText(altura.toString());
        tvPeso.setText(peso.toString());
        tvImc.setText(decimalFormat.format(calculaIMC(peso,altura).toString()));


    }

    public Double calculaIMC (Double peso, Double altura){
        Double imc = peso/(altura*altura);
        return imc;
    }
}