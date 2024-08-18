package com.politecnico.alquilervehiculos.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String dni;
    private List<Tarjeta> tarjetasCredito;

    public Cliente(String nombre, String apellidos, String email, String telefono, String dni, Tarjeta tarjetaCredito) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
        this.tarjetasCredito = new ArrayList<>();
        this.tarjetasCredito.add(tarjetaCredito);
    }
    // Método para agregar una tarjeta de crédito al cliente
    public void agregarTarjeta(Tarjeta tarjetaCredito) {
        tarjetasCredito.add(tarjetaCredito);
    }
    // Metodos getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public List<Tarjeta> getTarjetaCredito() {
        return tarjetasCredito;
    }
    public void setTarjetaCredito(List<Tarjeta> tarjetasCredito) {
        this.tarjetasCredito = tarjetasCredito;
    }
}
