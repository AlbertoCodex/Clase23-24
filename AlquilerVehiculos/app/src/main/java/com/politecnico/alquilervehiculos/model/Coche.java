package com.politecnico.alquilervehiculos.model;

public class Coche extends Vehiculo {
    private int plazas;
    private int puertas;
    private double maletero;
    private String tipoCoche;

    public Coche(String matricula, String modelo, String marca, double kmsRecorridos, double precioDia, String tipoMotor, int plazas, int puertas, double maletero, String tipoCoche) {
        super(matricula, modelo, marca, kmsRecorridos, precioDia, tipoMotor);
        this.plazas = plazas;
        this.puertas = puertas;
        this.maletero = maletero;
        this.tipoCoche = tipoCoche;
    }
    // Metodos getters y setters
    public int getPlazas() {
        return plazas;
    }
    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    public double getMaletero() {
        return maletero;
    }
    public void setMaletero(double maletero) {
        this.maletero = maletero;
    }
    public String getTipoCoche() {
        return tipoCoche;
    }
    public void setTipoCoche(String tipoCoche) {
        this.tipoCoche = tipoCoche;
    }
}
