package org.example.test;

import org.example.Aritmetica;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//Activar
//Actuar
//Asegurar
public class AritmeticaTest {
    Aritmetica a;
    float resultado;

    @Before
    public void init() {
        a = new Aritmetica();
    }
    // Test suma()
    @Test
    public void testSuma() {
        resultado = a.suma(3,4);
        assertEquals(7f, resultado,0.0);
    }
    @Test
    public void testSumaPrimeroNegativo() {
        resultado = a.suma(-2,4);
        assertEquals(2f, resultado, 0.0);
    }
    @Test
    public void testSumaSegundoNegativo() {
        resultado = a.suma(6,-2);
        assertEquals(4f, resultado, 0.0);
    }
    @Test
    public void testSumaNegativos() {
        resultado = a.suma(-2,-4);
        assertEquals(-6f, resultado, 0.0);
    }
    // Test resta()
    @Test
    public void testResta() {
        resultado = a.resta(33, 13);
        assertEquals(20f, resultado, 0.0);
    }
    @Test
    public void testRestaPrimeroNegativo() {
        resultado = a.resta(-13, 6);
        assertEquals(-19f, resultado, 0.0);
    }
    @Test
    public void testRestaSegundoNegativo() {
        resultado = a.resta(11, -2);
        assertEquals(13f, resultado, 0.0);
    }
    @Test
    public void testRestaNegativos() {
        resultado = a.resta(-15, -15);
        assertEquals(0f, resultado, 0.0);
    }
    // Test multiplicacion()
    @Test
    public void testMultiplicacion() {
        resultado = a.multiplicacion(12, 3);
        assertEquals(36f, resultado, 0.0);
    }
    @Test
    public void testMultiplicacionPrimeroNegativo() {
        resultado = a.multiplicacion(-6, 4);
        assertEquals(-24f, resultado, 0.0);
    }
    @Test
    public void testMultiplicacionSegundoNegativo() {
        resultado = a.multiplicacion(132, -7);
        assertEquals(-924f, resultado, 0.0);
    }
    @Test
    public void testMultiplicacionNegativos() {
        resultado = a.multiplicacion(-12, -3);
        assertEquals(36f, resultado, 0.0);
    }
    // Test division()
    @Test
    public void testDivision() {
        resultado = a.division(12, 3);
        assertEquals(4f, resultado, 0.0);
    }
    @Test
    public void testDivisionPrimerNegativo() {
        resultado = a.division(-16, 2);
        assertEquals(-8f, resultado, 0.0);
    }
    @Test
    public void testDivisionSegundoNegativo() {
        resultado = a.division(20, -5);
        assertEquals(-4f, resultado, 0.0);
    }
    @Test
    public void testDivisionNegativos() {
        resultado = a.division(-32.7f, -3);
        assertEquals(10.9f, resultado, 0.1);
    }
    @Test
    public void testDivisionCero() {
        resultado = a.division(-24f, 0);
        assertTrue(Float.isInfinite(resultado));
    }
    // Test getter
    @Test
    public void getUltimaResultadoTest() {
        a.suma(2,3);
        assertEquals(a.getUltimaResultado(), 5, 0.0);
    }
}
