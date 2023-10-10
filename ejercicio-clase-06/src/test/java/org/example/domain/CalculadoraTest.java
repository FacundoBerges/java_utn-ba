package org.example.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    private double numA;
    private double numB;
    private double numC;

    @Test
    public void given80And3_whenMultiply_shouldReturn240() {
        numA = 80;
        numB = 3;

        Assert.assertEquals(240, Calculadora.multiplicar(numA, numB), 0);
    }

    @Test
    public void given150And180_whenSumDividedBy3_shouldReturn110() {
        numA = 150;
        numB = 180;
        numC = 3;

        double result = Calculadora.sumar(numA, numB);

        Assert.assertEquals(110, Calculadora.dividir(result, numC), 0);
    }

    @Test
    public void given90And50_whenSubstractionMultipliedBy15_shouldNotReturn605() {
        numA = 90;
        numB = 50;
        numC = 15;

        double result = Calculadora.restar(numA, numB);

        Assert.assertNotEquals(605, Calculadora.multiplicar(result, numC), 0);
    }


    @Test
    public void given70And40_whenSumMultipliedBy25_shouldNotReturn2700() {
        numA = 70;
        numB = 40;
        numC = 25;

        double result = Calculadora.sumar(numA, numB);

        Assert.assertNotEquals(2700, Calculadora.multiplicar(result, numC), 0);
    }

}