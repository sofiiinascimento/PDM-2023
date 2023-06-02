package br.com.ifsc.blocodenotas;

import androidx.appcompat.app.AppCompatActivity;
import br.com.ifsc.blocodenotas.controller.NotaController;
import br.com.ifsc.blocodenotas.modelo.Nota;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityExibirNota extends AppCompatActivity {
    NotaController notaController;
    EditText edTitulo,edNota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_nota);
        notaController = new NotaController(getApplicationContext());

        edTitulo= findViewById(R.id.edTitulo);
        edNota= findViewById(R.id.edNota);
    }

    public void salvarNota(View v){
        Nota n = notaController.cadastrarNovaNota(new Nota(edTitulo.getText().toString(), edNota.getText().toString()));
        Toast.makeText(this, Integer.toString(n.getId()),Toast.LENGTH_SHORT).show();
    }
}