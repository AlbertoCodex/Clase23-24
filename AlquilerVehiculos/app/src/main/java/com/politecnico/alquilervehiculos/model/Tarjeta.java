package com.politecnico.alquilervehiculos.model;

public class Tarjeta {
    private String numTarjeta;
    private String fechaExpiracion;
    private String cvv;

    public Tarjeta(String numeroTarjeta, String fechaExpiracion, String cvv) {
        this.numTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.cvv = cvv;
    }
    // Metodos getters y setters
    public String getNumTarjeta() {
        return numTarjeta;
    }
    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }
    public String getFechaExpiracion() {
        return fechaExpiracion;
    }
    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
    public String getCvv() {
        return cvv;
    }
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
