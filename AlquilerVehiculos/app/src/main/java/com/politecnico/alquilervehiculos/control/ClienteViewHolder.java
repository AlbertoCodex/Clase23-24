package com.politecnico.alquilervehiculos.control;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.politecnico.alquilervehiculos.R;
import com.politecnico.alquilervehiculos.model.Cliente;

public class ClienteViewHolder extends RecyclerView.ViewHolder {
    private TextView tvNombre;
    private TextView tvApellidos;

    public ClienteViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNombre = itemView.findViewById(R.id.tvNombre);
        tvApellidos = itemView.findViewById(R.id.tvApellidos);
        // Inicializar otros TextViews aqui segun sea necesario
    }

    public void bind(Cliente cliente) {
        tvNombre.setText(cliente.getNombre());
        tvApellidos.setText(cliente.getApellidos());
        // Configurar otros datos del cliente segun sea necesario
    }
}
