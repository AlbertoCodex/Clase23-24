package org.example.test;

import org.junit.*;
import org.example.Car;

import static org.junit.Assert.*;

public class CarTest {
    private Car c;

    @Before
    public void init() {
        c = new Car(0,0,0,0,0,0);
    }
    @Test
    public void carTest() {
        c.setEngine(false);
        assertFalse(c.isEngine());
        c.setEngine(true);
        assertTrue(c.isEngine());
        c.setFuel(2f);
        assertEquals(2f, c.getFuel(), 0.0);
        c.setPosX(2f);
        assertEquals(2f, c.getPosX(), 0.0);
        c.setPosY(2f);
        assertEquals(2f, c.getPosY(), 0.0);
        c.setVelX(2f);
        assertEquals(2f, c.getVelX(), 0.0);
        c.setVelY(2f);
        assertEquals(2f, c.getVelY(), 0.0);
        c.setAcelX(2f);
        assertEquals(2f, c.getAcelX(), 0.0);
        c.setAcelY(2f);
        assertEquals(2f, c.getAcelY(), 0.0);
    }
    @Test
    public void addFuelTest() {
        // add fuel from 0
        c.addFuel(66.7f);
        assertEquals(66.7f, c.getFuel(), 0.0);
        // add fuel from value > 0
        c.addFuel(33.2f);
        assertEquals(99.9f, c.getFuel(), 0.1);
    }
    @Test
    public void addFuelNegativeTest() {
        // add nevative fuel from 0
        c.addFuel(-43.1f);
        assertEquals(0f, c.getFuel(), 0.0);
        // Si pones valor negativo, permanece igual, no se resta.
        c.addFuel(30.2f);
        assertEquals(30.2f, c.getFuel(), 0.0);
        c.addFuel(-2.3f);
        assertEquals(30.2f, c.getFuel(), 0.0);
    }
    @Test
    public void startTest() {
        c.setFuel(543.2f);
        c.start();
        assertTrue(c.isEngine());
    }
    @Test
    public void startNegativeTest() {
        c.setFuel(-324.2f);
        c.start();
        assertFalse(c.isEngine());
        c.setFuel(0.0f);
        c.start();
        assertFalse(c.isEngine());
    }
    @Test
    public void stopTest() {
        c.setEngine(true);
        c.stop();
        assertFalse(c.isEngine());
    }
    @Test
    public void nextTimeTest() {
        c.setFuel(543.54f);
        c.setEngine(true);
        c.nextTime(1f);
        // X
        assertEquals(0.05f, c.getAcelX(), 0.01f);
        assertEquals(0.0f, c.getPosX(), 0.01f);
        assertEquals(0.05f, c.getVelX(), 0.01f);
        // Y
        assertEquals(0.05f, c.getAcelY(), 0.01f);
        assertEquals(0.0f, c.getPosY(), 0.01f);
        assertEquals(0.05f, c.getVelY(), 0.01f);
        c.nextTime(1f);
        // X
        assertEquals(0.1f, c.getAcelX(), 0.01f);
        assertEquals(0.05f, c.getPosX(), 0.01f);
        assertEquals(0.15f, c.getVelX(), 0.01f);
        // Y
        assertEquals(0.1f, c.getAcelY(), 0.01f);
        assertEquals(0.05f, c.getPosY(), 0.01f);
        assertEquals(0.15f, c.getVelY(), 0.01f);
        // Fuel
        assertEquals(543.40f, c.getFuel(), 0.1f);
    }
    @Test
    public void nextTimeFuelTest() {
        c.setFuel(0.05f);
        c.setEngine(true);
        c.nextTime(2f);
        assertEquals(0.1f, c.getAcelX(), 0.01f);
        c.nextTime(1f);
        assertFalse(c.isEngine());
        assertEquals(-0.15f, c.getAcelX(), 0.01f);
        assertEquals(0.2f, c.getPosX(), 0.01f);
        assertEquals(0.04f, c.getVelX(), 0.01f);
    }
}
