package br.com.ifsc.blocodenotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void novaNota(View view){
        Intent intent = new Intent(this, ActivityExibirNota.class);
        intent.putExtra("id nota", 0);
        startActivity(intent);
    }
}