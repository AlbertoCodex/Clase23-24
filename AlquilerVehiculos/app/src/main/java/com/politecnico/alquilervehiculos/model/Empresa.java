package com.politecnico.alquilervehiculos.model;

import java.util.*;

public class Empresa {
    private HashMap<String, Cliente> clientes;
    private HashMap<String, Vehiculo> vehiculos;
    private List<Reserva> reservas;

    public Empresa() {
        clientes = new HashMap<>();
        vehiculos = new HashMap<>();
        reservas = new ArrayList<>();
    }
    // CRUD
    public void agregarCliente(String idCliente, Cliente cliente) {
        clientes.put(idCliente, cliente);
    }
    public void agregarVehiculo(String idVehiculo, Vehiculo vehiculo) {
        vehiculos.put(idVehiculo, vehiculo);
    }
    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }
    // Metodos getters y setters
    public HashMap<String, Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(HashMap<String, Cliente> clientes) {
        this.clientes = clientes;
    }
    public HashMap<String, Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(HashMap<String, Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    public List<Reserva> getReservas() {
        return reservas;
    }
    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
