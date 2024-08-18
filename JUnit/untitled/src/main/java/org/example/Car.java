package org.example;

public class Car {
    private boolean engine;  //true: engine on. false: engine off
    private float fuel;
    private float posX,posY;
    private float velX,velY;
    private float acelX,acelY;

    public Car(float posX, float posY, float velX, float velY, float acelX, float acelY) {
        this.engine = false;
        fuel = 0f;
        this.posX = posX;
        this.posY = posY;
        this.velX = velX;
        this.velY = velY;
        this.acelX = acelX;
        this.acelY = acelY;
    }

    public void addFuel(float fuel) {
        if(fuel < 0f) {
            return;
        }
        this.fuel += fuel;
    }
    public void start() {
        if(fuel <= 0) {
            return;
        }
        engine = true;
    }
    public void stop() {
        engine = false;
    }
    public void nextTime(float time) {
        if (engine == true) {
            acelX += time*0.05f;
            acelY += time*0.05f;
        }
        // Si te quedas sin gasolina
        if (fuel < 0f) {
            fuel = 0f;
            engine = false;
            acelX = -acelX;
            acelY = -acelY;
        }
        // Avance de posicion y velocidad
        posX = posX + velX*time;
        posY = posY + velY*time;
        velX = velX + acelX*time;
        velY = velY + acelY*time;
        // Fuel consumido cada tick
        if (fuel >= 0f) fuel -= time*0.07f;
        // Si estas parado
        if (velX < 0f) {
            acelX = 0f;
            velX = 0f;
        }
        if (velY < 0f) {
            acelY = 0f;
            velY = 0f;
        }
    }
    // Getters y Setters
    public boolean isEngine() {
        return engine;
    }
    public void setEngine(boolean engine) {
        this.engine = engine;
    }
    public float getFuel() {
        return fuel;
    }
    public void setFuel(float fuel) {
        this.fuel = fuel;
    }
    public float getPosX() {
        return posX;
    }
    public void setPosX(float posX) {
        this.posX = posX;
    }
    public float getPosY() {
        return posY;
    }
    public void setPosY(float posY) {
        this.posY = posY;
    }
    public float getVelX() {
        return velX;
    }
    public void setVelX(float velX) {
        this.velX = velX;
    }
    public float getVelY() {
        return velY;
    }
    public void setVelY(float velY) {
        this.velY = velY;
    }
    public float getAcelX() {
        return acelX;
    }
    public void setAcelX(float acelX) {
        this.acelX = acelX;
    }
    public float getAcelY() {
        return acelY;
    }
    public void setAcelY(float acelY) {
        this.acelY = acelY;
    }
}