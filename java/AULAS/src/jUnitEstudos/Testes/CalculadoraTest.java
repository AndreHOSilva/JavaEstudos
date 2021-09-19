package jUnitEstudos.Testes;

import jUnitEstudos.Modelo.Calculadora;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void DeveriaSomarDoisNumerosPositivos(){
        Calculadora cal = new Calculadora();

        int soma = cal.somar(4,9);

        Assert.assertEquals(7,soma);

    }



}
