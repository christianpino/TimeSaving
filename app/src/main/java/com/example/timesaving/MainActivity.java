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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtlogin, edtpass;
    private Button btnRegistrar, btnIniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setTheme(R.style.SplashTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtlogin=findViewById(R.id.edtLogin);
        edtpass=findViewById(R.id.edtPassword);
        btnRegistrar=findViewById(R.id.btnRegistrarse);
        btnIniciarSesion=findViewById(R.id.btnIniciarSesion);

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = "christian";
                String password = "1234";
                String log = edtlogin.getText().toString();
                String pass= edtpass.getText().toString();

                if(log.equals("")){
                    Toast.makeText(getApplicationContext(),"Campos Vacios"+pass, Toast.LENGTH_LONG).show();

                }else{
                    if(log.equals(login)){
                        Bundle enviadato = new Bundle();
                        enviadato.putString("keydatos",edtlogin.getText().toString());

                        Intent intent = new Intent(MainActivity.this, MainActivity3Maps.class);
                        intent.putExtras(enviadato);
                        startActivity(intent);


                    }else{
                        Toast.makeText(getApplicationContext(),"Datos Incorrectos"+pass, Toast.LENGTH_LONG).show();
                    }
                }




            }
        });

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2Registrarse.class);
                /*  intent.putExtras(enviadato);*/
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
                Intent intent1 = new Intent(MainActivity.this, MainActivity3Maps.class);
                startActivity(intent1);
                break;
            case R.id.item2:    //Pasajes
                Intent intent2 = new Intent(MainActivity.this, MainActivity4Pasajes.class);
                startActivity(intent2);
                break;
            case R.id.item3:    //Formaspago
                Intent intent3 = new Intent(MainActivity.this, MainActivity5FormasPago.class);
                startActivity(intent3);
                break;
            case R.id.item4:    //Informacion
                Intent intent4 = new Intent(MainActivity.this, MainActivity6Informacion.class);
                startActivity(intent4);
                break;

        }



        return super.onOptionsItemSelected(item);
    }
}

























