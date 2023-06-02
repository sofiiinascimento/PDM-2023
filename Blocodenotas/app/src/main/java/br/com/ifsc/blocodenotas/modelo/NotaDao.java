package br.com.ifsc.blocodenotas.modelo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class NotaDao {
    SQLiteDatabase database;
    public NotaDao(Context c){
        database =  c.openOrCreateDatabase("dbNotas",c.MODE_PRIVATE, null);
        database.execSQL("CREATE TABLE IF NOT EXISTS  notas (id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "titulo varchar,"+
                "texto varchar )");
    }

    public Nota inserirNota(Nota n){
        ContentValues contentValues = new ContentValues();
        contentValues.put("título",n.getTitulo());
        contentValues.put("texto",n.getTexto());
        int i = (int) database.insert("notas", null, contentValues);
        n.setId(i);
        return n;
    }

    public ArrayList<Nota> getListaNotas() {
        Cursor cursor = database.rawQuery( "SELECT * FROM notas", null);
        cursor.moveToFirst();
        ArrayList<Nota> arrayList = new ArrayList<>();
        while (!cursor.isAfterLast()){
            Nota n = new Nota(cursor.getInt(0), cursor.getString(1), cursor.getString(2));
            arrayList.add(n);
            cursor.moveToNext();
        }

        return arrayList;
    }
}
