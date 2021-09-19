package jUnitEstudos.Testes;

import jUnitEstudos.Modelo.Funcionario2;
import jUnitEstudos.Service.BonusFuncionario;
import jUnitEstudos.Service.Desempenho;
import jUnitEstudos.Service.Reajuste;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteTeste {

    private Funcionario2 funcionario2 ;
    private Reajuste reajuste ;

    private void Inicializar(Desempenho desempenho){
        funcionario2 = new Funcionario2("teste", LocalDate.now(),new BigDecimal("10000"));
        reajuste = new Reajuste() ;
        reajuste.ajustarSalario(funcionario2,desempenho);
    }


    @Test
    public void DeveriaDevolverUmReajusteDeTresPorcento(){
        Inicializar(Desempenho.A_desejar);

        Assert.assertEquals(new BigDecimal("10300.00"),funcionario2.getSalario());
    }

    @Test
    public void DeveriaDevolverUmReajusteDeCincoPorcento(){
        Inicializar(Desempenho.Satisfatorio);

        Assert.assertEquals(new BigDecimal("10500.00"),funcionario2.getSalario());
    }

}
