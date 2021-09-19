package jUnitEstudos.Modelo;

public class Calculadora {

    private int calculadora ;

    public int somar(int x, int y){
        int resultado = x +y ;
        this.calculadora = resultado ;
        return resultado;
    }

}
