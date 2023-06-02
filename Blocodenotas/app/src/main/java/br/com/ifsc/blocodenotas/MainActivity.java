package br.com.ifsc.blocodenotas;

import androidx.appcompat.app.AppCompatActivity;
import br.com.ifsc.blocodenotas.controller.NotaController;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
    }

    public void novaNota(View view){
        Intent intent = new Intent(this, ActivityExibirNota.class);
        intent.putExtra("id nota", 0);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        NotaController notaController = new NotaController( this);
        ArrayList<String> dataset = notaController.listaTitulosNotas();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                        android.R.layout.simple_list_item_1,
                        android.R.id.text1,
                        dataset
        );
        listView.setAdapter(adapter);
    }
}