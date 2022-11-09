package com.example.timesaving;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity3IniciarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_iniciar_sesion);

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
                Intent intent1 = new Intent(MainActivity3IniciarSesion.this, MainActivity3IniciarSesion.class);
                startActivity(intent1);
                break;
            case R.id.item2:    //Pasajes
                Intent intent2 = new Intent(MainActivity3IniciarSesion.this, MainActivity4Pasajes.class);
                startActivity(intent2);
                break;
            case R.id.item3:    //Formaspago
                Intent intent3 = new Intent(MainActivity3IniciarSesion.this, MainActivity5FormasPago.class);
                startActivity(intent3);
                break;
            case R.id.item4:    //Informacion
                Intent intent4 = new Intent(MainActivity3IniciarSesion.this, MainActivity6Informacion.class);
                startActivity(intent4);
                break;

        }



        return super.onOptionsItemSelected(item);
    }
}