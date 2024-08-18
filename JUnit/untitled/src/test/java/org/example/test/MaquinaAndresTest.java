package org.example.test;

import org.example.MaquinaAndres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaquinaAndresTest {
    private MaquinaAndres miMaquina;

    @Before
    public void init() {
        miMaquina = new MaquinaAndres("12345", 5f, 40f);
    }

    @Test
    public void maquinaTestConsGet() {
        assertEquals(40f, miMaquina.getTemperatura(), 0);
        assertEquals(5f, miMaquina.getAmperios(), 0);
        assertFalse(miMaquina.isEncendida());
        assertEquals("12345", miMaquina.getCodMaquina());
    }
    @Test
    public void maquinaTest() {
        assertFalse(miMaquina.isEncendida());
        miMaquina.arrancar();
        assertTrue(miMaquina.isEncendida());
        miMaquina.setTemperatura(66.3f);
        assertEquals(66.3f, miMaquina.getTemperatura(), 0);
        miMaquina.setAmperios(3.8f);
        assertEquals(3.8f, miMaquina.getAmperios(), 0);
        miMaquina.setCodMaquina("54321");
        assertEquals("54321", miMaquina.getCodMaquina());
    }
    @Test
    public void encendidoTest() {
        assertFalse(miMaquina.isEncendida());
        miMaquina.arrancar();
        assertTrue(miMaquina.isEncendida());
    }
    @Test
    public void encendidoDosTest() {
        miMaquina.setAmperios(324f);
        assertFalse(miMaquina.isEncendida());

        if (miMaquina.getAmperios() >= 2f || miMaquina.getAmperios() <= 8f) {
            miMaquina.arrancar();
            assertTrue(miMaquina.isEncendida());
        } else {
            miMaquina.arrancar();
            assertFalse(miMaquina.isEncendida());
        }
    }
    @Test
    public void encendidoTresTest() {
        miMaquina.setAmperios(-4f);
        assertFalse(miMaquina.isEncendida());

        if (miMaquina.getAmperios() >= 2f || miMaquina.getAmperios() <= 8f) {
            miMaquina.arrancar();
            assertTrue(miMaquina.isEncendida());
        } else {
            miMaquina.arrancar();
            assertFalse(miMaquina.isEncendida());
        }
    }
    @Test
    public void apagadoTest() {
        assertFalse(miMaquina.apagar());
        miMaquina.arrancar();
        assertTrue(miMaquina.isEncendida());
        assertTrue(miMaquina.apagar());
        assertFalse(miMaquina.isEncendida());
        assertEquals(MaquinaAndres.Piloto.off, miMaquina.getLuzPiloto());
    }
    @Test
    public void checkPilotoTest() {
        if (miMaquina.isEncendida()) {
            if (miMaquina.getTemperatura() >= 85f) {
                assertEquals(MaquinaAndres.Piloto.rojo, miMaquina.getLuzPiloto());
            } else if (miMaquina.getTemperatura() >= 56) {
                assertEquals(MaquinaAndres.Piloto.amarillo, miMaquina.getLuzPiloto());
            } else {
                assertEquals(MaquinaAndres.Piloto.verde, miMaquina.getLuzPiloto());
            }
        } else {
            assertEquals(MaquinaAndres.Piloto.off, miMaquina.getLuzPiloto());
        }
    }
    @Test
    public void checkPilotoDosTest() {
        miMaquina.setTemperatura(55f);
        if (miMaquina.isEncendida()) {
            assertEquals(MaquinaAndres.Piloto.verde, miMaquina.getLuzPiloto());
        } else {
            assertEquals(MaquinaAndres.Piloto.off, miMaquina.getLuzPiloto());
        }
    }
    @Test
    public void checkPilotoTresTest() {
        miMaquina.setTemperatura(84f);
        if (miMaquina.isEncendida()) {
            assertEquals(MaquinaAndres.Piloto.amarillo, miMaquina.getLuzPiloto());
        } else {
            assertEquals(MaquinaAndres.Piloto.off, miMaquina.getLuzPiloto());
        }
    }
    @Test
    public void checkPilotoCuatroTest() {
        miMaquina.setTemperatura(666f);
        if (miMaquina.isEncendida()) {
            assertEquals(MaquinaAndres.Piloto.rojo, miMaquina.getLuzPiloto());
        } else {
            assertEquals(MaquinaAndres.Piloto.off, miMaquina.getLuzPiloto());
        }
    }

    @Test
    public void checkTemperaturaTest() {
        miMaquina.arrancar();
        if (miMaquina.getTemperatura() >= 85f) {
            assertFalse(miMaquina.comprobarTemperatura());
            assertFalse(miMaquina.isEncendida());
        } else {
            assertTrue(miMaquina.comprobarTemperatura());
        }
    }
    @Test
    public void checkTemperaturaDosTest() {
        miMaquina.setTemperatura(324f);
        if (miMaquina.getTemperatura() >= 85f) {
            assertFalse(miMaquina.comprobarTemperatura());
            assertFalse(miMaquina.isEncendida());
        } else {
            assertTrue(miMaquina.comprobarTemperatura());
        }
    }
    @Test
    public void checkTemperaturaTresTest() {
        miMaquina.setTemperatura(85f);
        if (miMaquina.getTemperatura() >= 85f) {
            assertFalse(miMaquina.comprobarTemperatura());
            assertFalse(miMaquina.isEncendida());
        } else {
            assertTrue(miMaquina.comprobarTemperatura());
        }
    }

    @Test
    public void checkAmperajeTest() {
        if (miMaquina.getAmperios() >= 2f || miMaquina.getAmperios() <= 8f) {
            assertTrue(miMaquina.comprobarAmperaje());
        } else {
            assertFalse(miMaquina.comprobarAmperaje());
            assertFalse(miMaquina.isEncendida());
        }
    }
    @Test
    public void checkAmperajeDosTest() {
        miMaquina.setAmperios(8.1f);
        if (miMaquina.getAmperios() >= 2f || miMaquina.getAmperios() <= 8f) {
            assertTrue(miMaquina.comprobarAmperaje());
        } else {
            assertFalse(miMaquina.comprobarAmperaje());
            assertFalse(miMaquina.isEncendida());
        }
    }
    @Test
    public void checkAmperajeTresTest() {
        miMaquina.setAmperios(1.9f);
        if (miMaquina.getAmperios() >= 2f || miMaquina.getAmperios() <= 8f) {
            assertTrue(miMaquina.comprobarAmperaje());
        } else {
            assertFalse(miMaquina.comprobarAmperaje());
            assertFalse(miMaquina.isEncendida());
        }
    }
    @Test
    public void detectarIncidenciaTest() {
        assertTrue(miMaquina.detecterIncidencia());
    }
    @Test
    public void detectarIncidenciaDosTest() {
        miMaquina.setTemperatura(666f);
        assertFalse(miMaquina.detecterIncidencia());
    }
    @Test
    public void detectarIncidenciaTresTest() {
        miMaquina.setAmperios(33f);
        assertFalse(miMaquina.detecterIncidencia());
    }
    @Test
    public void detectarIncidenciaCuatroTest() {
        miMaquina.setAmperios(-3f);
        assertTrue(miMaquina.detecterIncidencia());
    }
}