package com.politecnico.alquilervehiculos.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.politecnico.alquilervehiculos.R;
import com.politecnico.alquilervehiculos.control.MainController;
import com.politecnico.alquilervehiculos.model.Tarjeta;

public class AddClienteActivity extends AppCompatActivity {
    private EditText etNombre;
    private EditText etApellidos;
    private EditText etEmail;
    private EditText etTelefono;
    private EditText etDni;
    private EditText etTarjeta;
    private EditText etTarjetaFecha;
    private EditText etTarjetaCvv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcliente);
        etNombre = findViewById(R.id.etNombre);
        etApellidos = findViewById(R.id.etApellidos);
        etEmail = findViewById(R.id.etEmail);
        etTelefono = findViewById(R.id.etTelefono);
        etDni = findViewById(R.id.etDni);
        etTarjeta = findViewById(R.id.etTarjeta);
        etTarjetaFecha = findViewById(R.id.etTarjetaFecha);
        etTarjetaCvv = findViewById(R.id.etTarjetaCvv);

        Button btnGuardarCliente = findViewById(R.id.bGuardar);
        btnGuardarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarCliente();
                finish();
            }
        });
    }
    private void guardarCliente() {
        // Obtener los valores de los EditText
        String nombre = etNombre.getText().toString();
        String apellidos = etApellidos.getText().toString();
        String email = etEmail.getText().toString();
        String telefono = etTelefono.getText().toString();
        String dni = etDni.getText().toString();
        String tarjeta = etTarjeta.getText().toString();
        String tarjetaFecha = etTarjetaFecha.getText().toString();
        String tarjetaCvv = etTarjetaCvv.getText().toString();

        MainController mc = MainController.getSingleton();
        mc.agregarCliente(nombre, apellidos, email, telefono, dni, tarjeta, tarjetaFecha, tarjetaCvv);
    }
}
