package br.sofia.com.ifsc.aulinha10_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class imc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        Bundle bundle = getIntent() .getExtras();
        String a = bundle.getString("msg");
    }
}