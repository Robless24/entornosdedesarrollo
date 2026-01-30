package ejercicioCalculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraAlejandroRoblesTest {

    @Test
    void testSuma() {
        int valorEsperado = 30;
        CalculadoraAlejandroRobles calc = new CalculadoraAlejandroRobles(20, 10);
        int resultado = calc.suma();
        assertEquals(valorEsperado, resultado, "La suma no coincide con el valor esperado.");
    }

    @Test
    void testResta() {
        int valorEsperado = 10;
        CalculadoraAlejandroRobles calc = new CalculadoraAlejandroRobles(20, 10);
        int resultado = calc.resta();
        assertEquals(valorEsperado, resultado, "La resta no coincide con el valor esperado.");
    }

    @Test
    void testMultiplica() {
        int valorEsperado = 200;
        CalculadoraAlejandroRobles calc = new CalculadoraAlejandroRobles(20, 10);
        int resultado = calc.multiplica();
        assertEquals(valorEsperado, resultado, "La multiplicación no coincide con el valor esperado.");
    }

    @Test
    void testDivide() {
        int valorEsperado = 2;
        CalculadoraAlejandroRobles calc = new CalculadoraAlejandroRobles(20, 10);
        int resultado = calc.divide();
        assertEquals(valorEsperado, resultado, "La división no coincide con el valor esperado.");
    }

    @Test
    public void testDivCero() {
        CalculadoraAlejandroRobles calc = new CalculadoraAlejandroRobles(20, 0);
        assertThrows(ArithmeticException.class, () -> {
            calc.divide();
        }, "Error: No se lanzó la excepción esperada de división por cero.");
    }

    @Test
    void testResta2() {
        CalculadoraAlejandroRobles calc = new CalculadoraAlejandroRobles(10, 20);
        int valorEsperado = 10;
        int resultado = calc.resta2();
        assertEquals(valorEsperado, resultado, "La resta modificada no funciona correctamente.");
    }

    @Test
    void testDivide2() {
        CalculadoraAlejandroRobles calc = new CalculadoraAlejandroRobles(20, 0);
        int valorEsperado = 0;
        int resultado = calc.divide2();
        assertEquals(valorEsperado, resultado, "La división modificada no funciona correctamente.");
    }
}