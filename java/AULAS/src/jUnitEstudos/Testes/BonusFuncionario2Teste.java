package jUnitEstudos.Testes;

import jUnitEstudos.Modelo.Funcionario2;
import jUnitEstudos.Service.BonusFuncionario;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.math.BigDecimal;
import java.time.LocalDate;


public class BonusFuncionario2Teste {

    private Funcionario2 funcionario2 ;
    private BonusFuncionario bonusFuncionario ;
    private BigDecimal calBonus ;

    @BeforeEach
    protected void Inicializar (){
        funcionario2= new Funcionario2("Teste", LocalDate.now(),new BigDecimal(25000)) ;


    }

    @Test
    public void DeveriaDevolverErroDeCompilacao(){
        Inicializar();

        //bonusFuncionario.calcularBonus(funcionario2) ;

        Assert.assertThrows(IllegalArgumentException.class,() ->bonusFuncionario.calcularBonus(funcionario2));




    }
    @Test
    public void DeveriaDevolverValorDoBonusDoFuncionario(){
        Inicializar();

        //bonusFuncionario.calcularBonus(funcionario2) ;

        Assert.assertEquals(new BigDecimal("1000.00"), bonusFuncionario.calcularBonus(funcionario2));


    }
}
