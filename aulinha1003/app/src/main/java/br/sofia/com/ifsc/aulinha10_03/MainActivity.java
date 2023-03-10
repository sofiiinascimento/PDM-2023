package br.sofia.com.ifsc.aulinha10_03;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText  =  findViewById(R.id.editTextTextPersonName);
        Log.d("metodocallback","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("metodocallback","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("metodocallback","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("metodocallback","onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("metodocallback","onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("metodocallback","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("metodocallback","onDestroy");
    }

    public void iniciaActivity(View view) {
        Intent a = new Intent(getApplicationContext(), imc.class );
        String mensagem = editText.getText().toString();
        a.putExtra("msg",mensagem);
        startActivity(a);
    }


}