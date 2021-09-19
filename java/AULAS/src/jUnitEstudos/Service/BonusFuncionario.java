package jUnitEstudos.Service;

import jUnitEstudos.Modelo.Funcionario2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusFuncionario {

        public BigDecimal calcularBonus(Funcionario2 funcionario) {
            BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
            if (valor.compareTo(new BigDecimal("1000")) > 0) {
                throw new IllegalArgumentException("Salário maior que autorizado ao bônus") ;
            }

            return valor.setScale(2, RoundingMode.HALF_UP);
        }

}
