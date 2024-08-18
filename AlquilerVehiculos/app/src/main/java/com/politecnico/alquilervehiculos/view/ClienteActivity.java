package com.politecnico.alquilervehiculos.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.politecnico.alquilervehiculos.R;
import com.politecnico.alquilervehiculos.control.ClienteAdapter;
import com.politecnico.alquilervehiculos.control.MainController;
import com.politecnico.alquilervehiculos.model.Cliente;
import com.politecnico.alquilervehiculos.model.Tarjeta;

import java.util.HashMap;

public class ClienteActivity extends AppCompatActivity {
    private HashMap<String, Cliente> mapaClientes;
    private ClienteAdapter clienteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
        mapaClientes = MainController.getSingleton().pedirClientes();

        // Botón para agregar un nuevo cliente
        Button bAgregar = findViewById(R.id.bAgregar);
        bAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClienteActivity.this, AddClienteActivity.class);
                startActivity(intent);
            }
        });
        // Configurar el RecyclerView
        RecyclerView rvClientes = findViewById(R.id.rvClientes);
        rvClientes.setLayoutManager(new LinearLayoutManager(this));
        clienteAdapter = new ClienteAdapter(mapaClientes, this);
        rvClientes.setAdapter(clienteAdapter);
    }
    @Override
    protected void onResume() {
        super.onResume();
        // Actualiza el RecyclerView cuando la actividad vuelva a estar en primer plano
        clienteAdapter.notifyDataSetChanged();
    }
}
