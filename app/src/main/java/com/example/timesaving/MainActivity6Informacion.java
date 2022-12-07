package com.example.timesaving;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.timesaving.adaptadores.ListaUsuarioAdapter;
import com.example.timesaving.db.DbUsuarios;
import com.example.timesaving.entidades.usuario;

import java.util.ArrayList;

public class MainActivity6Informacion extends AppCompatActivity {

   RecyclerView listausuario;
   ArrayList<usuario> listaArrayUsuario;
   private TextView tvNombre, tvDni, tvCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity6_informacion);


        tvNombre=findViewById(R.id.viewNombre);
        tvDni=findViewById(R.id.viewDni);
        tvCorreo=findViewById(R.id.viewCorreo);

        Bundle datos = this.getIntent().getExtras();
        tvNombre.setText("Nombre:" +datos.getString("Nombre"));
        tvDni.setText("DNI:" +datos.getString("Dni"));
        tvCorreo.setText("CORREO:" +datos.getString("Correo"));


        listausuario=findViewById(R.id.listausuarios);
        listausuario.setLayoutManager(new LinearLayoutManager(this));

        DbUsuarios dbUsuarios = new DbUsuarios(MainActivity6Informacion.this);
        listaArrayUsuario = new ArrayList<>();

        ListaUsuarioAdapter adapter = new ListaUsuarioAdapter(dbUsuarios.mostrarusuario());
        listausuario.setAdapter(adapter);







        /*
        btnGuardar=findViewById(R.id.btnGuardar);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbUsuarios dbUsuarios = new DbUsuarios(MainActivity6Informacion.this);
                long id = dbUsuarios.insertarUsuario(txtNombre.getText().toString(), txtDni.getText().toString(), txtCorreo.getText().toString());

                if (id > 0){
                    Toast.makeText(MainActivity6Informacion.this, "Registro Guardado", Toast.LENGTH_LONG).show();


                }else{
                    Toast.makeText(MainActivity6Informacion.this, "ERRO de Registro", Toast.LENGTH_LONG).show();
                }


            }
        });*/
    }


}