package jUnitEstudos.Service;

import jUnitEstudos.Modelo.Funcionario2;

import java.math.BigDecimal;

public class Reajuste {



    public void ajustarSalario(Funcionario2 funcionario, Desempenho desempenho){


        if(desempenho.equals(Desempenho.A_desejar)){

            //funcionario.setSalario(funcionario.getSalario().multiply(new BigDecimal("0.03")));
            //funcionario.getSalario().multiply(new BigDecimal("0.03"));

            //funcionario.getSalario().add(funcionario.getSalario().multiply(new BigDecimal("0.03"))) ;




            funcionario.setSalario(funcionario.getSalario().add(funcionario.getSalario().multiply(new BigDecimal("0.03"))));


        }else if(desempenho.equals(Desempenho.Satisfatorio)){
            //funcionario.getSalario().multiply(new BigDecimal("0.05"));


            funcionario.setSalario(funcionario.getSalario().add(funcionario.getSalario().multiply(new BigDecimal("0.05"))));


        }

    }

}
