package com.politecnico.alquilervehiculos.control;

import android.view.LayoutInflater;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.politecnico.alquilervehiculos.R;
import com.politecnico.alquilervehiculos.model.Cliente;

import java.util.*;

public class ClienteAdapter extends RecyclerView.Adapter<ClienteViewHolder> {
    private HashMap<String, Cliente> mapaClientes;
    private LayoutInflater mInflater;

    public ClienteAdapter(HashMap<String, Cliente> mapaClientes, Context context) {
        this.mapaClientes = mapaClientes;
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ClienteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Reminder: Pasandole el context
        View itemView = mInflater.inflate(R.layout.cliente_list_item, parent, false);
        return new ClienteViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ClienteViewHolder holder, int position) {
        // Obtén el cliente en la posición 'position' del mapa
        Cliente cliente = (Cliente) mapaClientes.values().toArray()[position];
        holder.bind(cliente);
    }

    @Override
    public int getItemCount() {
        return mapaClientes.size();
    }
}
