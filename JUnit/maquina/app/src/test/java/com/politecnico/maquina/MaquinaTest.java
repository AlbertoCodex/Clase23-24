package com.politecnico.maquina;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class MaquinaTest {
    private Maquina miMaquina;

    @Before
    public void init() {
        miMaquina = new Maquina(40f, 5f, false, "12345");
    }

    @Test
    public void maquinaTestConsGet() {
        assertEquals(40f, miMaquina.getTemp(), 0);
        assertEquals(5f, miMaquina.getAmp(), 0);
        assertFalse(miMaquina.isEncedido());
        assertTrue(miMaquina.getCodigo().equals("12345"));
    }
    @Test
    public void maquinaTest() {
        assertFalse(miMaquina.isEncedido());
        miMaquina.setEncedido(true);
        assertTrue(miMaquina.isEncedido());
        miMaquina.setTemp(66.3f);
        assertEquals(66.3f, miMaquina.getTemp(), 0);
        miMaquina.setAmp(3.8f);
        assertEquals(3.8f, miMaquina.getAmp(), 0);
        miMaquina.setCodigo("54321");
        assertTrue("54321".equals(miMaquina.getCodigo()));
    }
    @Test
    public void encendidoTest() {
        miMaquina.setEncedido(false);
        assertFalse(miMaquina.isEncedido());
        miMaquina.encender();
        assertTrue(miMaquina.isEncedido());
    }
    @Test
    public void apagadoTest() {
        miMaquina.setEncedido(true);
        assertTrue(miMaquina.isEncedido());
        miMaquina.apagar();
        assertFalse(miMaquina.isEncedido());
    }
    @Test
    public void checkTemperaturaTest() {
        if (miMaquina.isEncedido() == true) {
            if (miMaquina.getTemp() >= 85f) {
                assertEquals("rojo", miMaquina.getLuz());
            } else if (miMaquina.getTemp() >= 56) {
                assertEquals("amarillo", miMaquina.getLuz());
            } else {
                assertEquals("verde", miMaquina.getLuz());
            }
        } else {
            assertEquals("apagado", miMaquina.getLuz());
        }
    }
    @Test
    public void checkAmperajeTest() {
        if (miMaquina.getAmp() < 2f || miMaquina.getAmp() > 8f) {
            assertFalse(miMaquina.isEncedido());
        }
    }
}
