package br.com.ifsc.sqlight;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase db;

    ListView listViewPessoas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewPessoas = findViewById(R.id.listView);

        db = openOrCreateDatabase("banquinho", MODE_PRIVATE, null);
        String sql = "CREATE TABLE IF NOT EXISTS pessoas (nome VARCHAR, idade INT(3))";
        db.execSQL(sql);

        sql = "INSERT INTO pessoas(nome, idade) VALUES ('Sofi', '18')";
        db.execSQL(sql);

        sql = "INSERT INTO pessoas(nome, idade) VALUES ('Vitória', '18')";
        db.execSQL(sql);
        listaPessoas();
    }

    public void listaPessoas(){
        String sql = "SELECT * FROM pessoas";
        Cursor cursor = db.rawQuery(sql, null);
        cursor.moveToFirst();
        ArrayList<String> arrayList = new ArrayList<String>();
        while (!cursor.isAfterLast()){
            arrayList.add(cursor.getString(0));
            cursor.moveToNext();

        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, arrayList
        );
        listViewPessoas.setAdapter(adapter);

    }
}