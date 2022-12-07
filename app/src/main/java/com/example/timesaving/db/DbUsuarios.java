package com.example.timesaving.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.example.timesaving.entidades.usuario;

import java.util.ArrayList;
import java.util.Currency;

public class DbUsuarios extends DbHelper{

    Context context;

    public DbUsuarios(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long insertarUsuario(String nombre, String dni, String correo){

        long id =0;
        try {
            DbHelper dbHelper = new DbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("nombre", nombre);
            values.put("dni", dni);
            values.put("correo", correo);

            id = db.insert(TABLE_REGISTROS, null, values);
        } catch (Exception ex){
            ex.toString();
        }

        return id;


    }

    public ArrayList<usuario> mostrarusuario(){
        DbHelper dbHelper = new DbHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ArrayList<usuario> listausuario = new ArrayList<>();
        usuario usuario = null;
        Cursor cursorusuario = null;

        cursorusuario = db.rawQuery("SELECT * FROM " + TABLE_REGISTROS, null);

        if(cursorusuario.moveToFirst()){
            do{
                usuario = new usuario();
                usuario.setId(cursorusuario.getInt(0));
                usuario.setNombre(cursorusuario.getString(1));
                usuario.setDni(cursorusuario.getString(2));
                usuario.setCorreo(cursorusuario.getString(3));
                listausuario.add(usuario);
            }while (cursorusuario.moveToNext());
        }
        cursorusuario.close();
        return listausuario;
    }
}
