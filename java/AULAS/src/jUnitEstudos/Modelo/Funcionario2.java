package jUnitEstudos.Modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario2 {
    private String nome;
    private LocalDate dataAdmissao;
    private BigDecimal salario;

    public Funcionario2(String nome, LocalDate dataAdmissao, BigDecimal salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}

