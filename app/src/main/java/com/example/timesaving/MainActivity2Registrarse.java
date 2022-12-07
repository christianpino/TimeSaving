package com.example.timesaving;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.timesaving.db.DbHelper;

public class MainActivity2Registrarse extends AppCompatActivity {
    Button btnregistrarse;
    EditText edtnombrecompleto, edtdni, edtcorreoelectronico, edtpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_registrarse);

        edtnombrecompleto=findViewById(R.id.edtNombreCompleto);
        edtdni=findViewById(R.id.edtDNI);
        edtcorreoelectronico=findViewById(R.id.edtCorreoElectronico);
        edtpassword=findViewById(R.id.edtPasswordR);
        btnregistrarse=findViewById(R.id.btnRegistrarse2);
        btnregistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DbHelper dbHelper = new DbHelper( MainActivity2Registrarse.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                if(db != null){
                    Toast.makeText(MainActivity2Registrarse.this, "USUARIO CREADO", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity2Registrarse.this, "ERROR AL CREAR USUARIO", Toast.LENGTH_LONG).show();
                }


               Intent intent = new Intent(getApplication(), MainActivity3Maps.class);
                intent.putExtra("Nombre",edtnombrecompleto.getText().toString());
                intent.putExtra("Dni",edtdni.getText().toString());
                intent.putExtra("Correo",edtcorreoelectronico.getText().toString());
                startActivity(intent);
            }
        });


    }

    // main_menu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:  //rutas
                Intent intent1 = new Intent(MainActivity2Registrarse.this, MainActivity3Maps.class);
                startActivity(intent1);
                break;
            case R.id.item2:    //Pasajes
                Intent intent2 = new Intent(MainActivity2Registrarse.this, MainActivity4Pasajes.class);
                startActivity(intent2);
                break;
            case R.id.item3:    //Formaspago
                Intent intent3 = new Intent(MainActivity2Registrarse.this, MainActivity5FormasPago.class);
                startActivity(intent3);
                break;
            case R.id.item4:    //Informacion
                Intent intent4 = new Intent(MainActivity2Registrarse.this, MainActivity6Informacion.class);
                startActivity(intent4);
                break;

        }



        return super.onOptionsItemSelected(item);
    }
}