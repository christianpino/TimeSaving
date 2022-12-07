package com.example.timesaving.adaptadores;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.timesaving.R;
import com.example.timesaving.entidades.usuario;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListaUsuarioAdapter extends RecyclerView.Adapter<ListaUsuarioAdapter.UsuarioViewHolder> {

    ArrayList<usuario> listausuario;

    public ListaUsuarioAdapter(ArrayList<usuario> listausuario){
        this.listausuario = listausuario;

    }

    @NonNull
    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_item_usuarios, null, false);
        return new UsuarioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder holder, int position) {

        holder.viewNombre.setText(listausuario.get(position).getNombre());
        holder.viewDni.setText(listausuario.get(position).getDni());
        holder.viewCorreo.setText(listausuario.get(position).getCorreo());

    }

    @Override
    public int getItemCount() {
        return listausuario.size();
    }

    public class UsuarioViewHolder extends RecyclerView.ViewHolder {
        TextView viewNombre, viewDni, viewCorreo;

        public UsuarioViewHolder(@NonNull View itemView) {
            super(itemView);

            viewNombre = itemView.findViewById(R.id.viewNombre);
            viewDni = itemView.findViewById(R.id.viewDni);
            viewCorreo= itemView.findViewById(R.id.viewCorreo);
        }
    }
}
