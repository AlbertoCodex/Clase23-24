package com.politecnico.alquilervehiculos.model;

public class Reserva {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private String fechaAlquiler;
    private int diasAlquiler;

    public Reserva(Vehiculo vehiculo, Cliente cliente, String fechaAlquiler, int diasAlquiler) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fechaAlquiler = fechaAlquiler;
        this.diasAlquiler = diasAlquiler;
    }

    public double devolverVehiculo(double kmsRecorridosCliente) {
        // Actualizar Kms recorridos
        vehiculo.setKmsRecorridos(vehiculo.getKmsRecorridos() + kmsRecorridosCliente);
        // Calcular precio
        double precioTotal = vehiculo.getPrecioDia() * this.diasAlquiler;
        if (kmsRecorridosCliente / this.diasAlquiler > 500 ) {
            precioTotal *= 1.2;
        }
        return precioTotal;
    }
    // Metodos getters y setters
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public String getFechaAlquiler() {
        return fechaAlquiler;
    }
    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }
    public int getDiasAlquiler() {
        return diasAlquiler;
    }
    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
