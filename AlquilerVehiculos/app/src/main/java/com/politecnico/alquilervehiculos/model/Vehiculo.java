package com.politecnico.alquilervehiculos.model;

public class Vehiculo {
    private String matricula;
    private String modelo;
    private String marca;
    private double kmsRecorridos;
    private double precioDia;
    private String tipoMotor;

    public Vehiculo(String matricula, String modelo, String marca, double kmsRecorridos, double precioDia, String tipoMotor) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.kmsRecorridos = kmsRecorridos;
        this.precioDia = precioDia;
        this.tipoMotor = tipoMotor;
    }
    // Metodos getters y setters
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getKmsRecorridos() {
        return kmsRecorridos;
    }
    public void setKmsRecorridos(double kmsRecorridos) {
        this.kmsRecorridos = kmsRecorridos;
    }
    public double getPrecioDia() {
        return precioDia;
    }
    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }
    public String getTipoMotor() {
        return tipoMotor;
    }
    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}