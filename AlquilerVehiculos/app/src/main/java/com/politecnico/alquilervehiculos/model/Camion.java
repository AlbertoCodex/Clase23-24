package com.politecnico.alquilervehiculos.model;

public class Camion extends Vehiculo {
    private double cargaMaxima;
    private double longitud;

    public Camion(String matricula, String modelo, String marca, double kmsRecorridos, double precioDia, String tipoMotor, double cargaMaxima, double longitud) {
        super(matricula, modelo, marca, kmsRecorridos, precioDia, tipoMotor);
        this.cargaMaxima = cargaMaxima;
        this.longitud = longitud;
    }
    // Metodos getters y setters
    public double getCargaMaxima() {
        return cargaMaxima;
    }
    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
