package com.example.timesaving;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
}