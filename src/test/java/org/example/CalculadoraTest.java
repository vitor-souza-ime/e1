package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    public void testSoma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.soma(2, 3));
    }

    @Test
    public void testSubtrai() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.subtrai(3, 2));
    }
}