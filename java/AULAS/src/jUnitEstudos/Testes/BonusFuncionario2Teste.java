package jUnitEstudos.Testes;

import jUnitEstudos.Modelo.Funcionario2;
import jUnitEstudos.Service.BonusFuncionario;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.math.BigDecimal;
import java.time.LocalDate;


public class BonusFuncionario2Teste {



    /*
    @BeforeEach
    protected void Inicializar (){


    }
    @Test
    public void DeveriaDevolverErroDeCompilacao(){
       // Inicializar();

        bonusFuncionario.calcularBonus(funcionario2) ;
        funcionario2= new Funcionario2("Teste", LocalDate.now(),new BigDecimal(25000)) ;


        Assert.assertThrows(IllegalArgumentException.class,() ->bonusFuncionario.calcularBonus(funcionario2));
    }
    */



    @Test
    public void DeveriaDevolverValorDoBonusDoFuncionario(){
        //Inicializar();
        Funcionario2 funcionario2 = new Funcionario2("Andre",LocalDate.now(),new BigDecimal(10000.00)) ;
        BonusFuncionario bonusFuncionario = new BonusFuncionario();

        Assert.assertEquals(new BigDecimal("1000.00"), bonusFuncionario.calcularBonus(funcionario2));


    }
}
