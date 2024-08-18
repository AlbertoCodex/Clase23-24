package org.example;

public class Maquina {
    private float temp;
    private float amp;
    private boolean encedido;
    private String codigo;
    public enum Piloto {
        rojo,
        verde,
        amarillo,
        apagado
    }

    private Piloto luz;

    public Maquina(float temp, float amp, boolean encedido, String codigo) {
        this.temp = temp;
        this.amp = amp;
        this.encedido = encedido;
        this.codigo = codigo;
    }

    public void encender() {
        setEncedido(true);
    }

    public void apagar() {
        setEncedido(false);
    }

    // Getters y Setters
    public float getTemp() {
        return temp;
    }
    public void setTemp(float temp) {
        this.temp = temp;
    }
    public float getAmp() {
        return amp;
    }
    public void setAmp(float amp) {
        this.amp = amp;
    }
    public boolean isEncedido() {
        return encedido;
    }
    public void setEncedido(boolean encedido) {
        this.encedido = encedido;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Piloto getLuz() {
        return luz;
    }
}

