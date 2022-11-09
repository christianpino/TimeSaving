package com.example.timesaving;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
                Intent intent = new Intent(MainActivity2Registrarse.this, MainActivity3IniciarSesion.class);
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
                Intent intent1 = new Intent(MainActivity2Registrarse.this, MainActivity3IniciarSesion.class);
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