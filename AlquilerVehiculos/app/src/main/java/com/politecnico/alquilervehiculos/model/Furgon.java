package com.politecnico.alquilervehiculos.model;

public class Furgon extends Vehiculo {
    private double cargaMaxima;
    private int plazas;

    public Furgon(String matricula, String modelo, String marca, double kmsRecorridos, double precioDia, String tipoMotor, double cargaMaxima, int plazas) {
        super(matricula, modelo, marca, kmsRecorridos, precioDia, tipoMotor);
        this.cargaMaxima = cargaMaxima;
        this.plazas = plazas;
    }
    // Metodos getters y setters
    public double getCargaMaxima() {
        return cargaMaxima;
    }
    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    public int getPlazas() {
        return plazas;
    }
    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
}
