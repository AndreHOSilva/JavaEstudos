package objeto;

import java.util.Comparator;
import java.util.Objects;

public class Conta {
	private double  saldo ;
	private double limite ;
	private int numero ;
	private String nome ;
	
	
	//construtor pode fazer apenas um
	public Conta(int numero,String nome) {
		super();
		this.numero = numero;
		this.nome = nome ;
	}


	public Conta(double saldo, double limite) {
		super(); //super aqui eu uso para trazer fixos de outros construtores qdo essa fo a mae
		this.saldo = saldo;
		this.limite = limite;
	}


	public Conta(double saldo, double limite, int numero) {
		super();
		this.saldo = saldo;
		this.limite = limite;
		this.numero = numero;
	}

	public Conta() {

	}


	//encapsulamento get e set, quando quero proteção total retiro os set
	//get traz um número e set pedi um número
	
		
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}
	//metodos
	
	//enquanto super aqui vou utilizar super. para trazer métodos de outras coisas qdo tenho uma conta mãe


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Conta conta = (Conta) o;
		return Double.compare(conta.saldo, saldo) == 0 && Double.compare(conta.limite, limite) == 0 && numero == conta.numero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(saldo, limite, numero);
	}

	public void imprimirExtrato() {
		System.out.println("Conta Nº"+numero);
		System.out.printf("Seu saldo final foi de %f",saldo);
	}
	public void sacar(double valorSacar) {
		if(valorSacar <=0) {
			System.out.println("Número inválido digitado");
		}
		else if(valorSacar > saldo) {
			System.out.printf("Você não tem saldo para essa operação, seu saldo é %f",saldo);
		}
		else {
			this.saldo = saldo - valorSacar ;
			System.out.printf("Operação realizada com sucesso, R$%f esse é seu novo saldo",saldo);
		}
	}
	public void depositar(double valorDepositar) {
		if(valorDepositar <= 0) {
			System.out.println("Número inválido");
		}else {
			saldo = saldo + valorDepositar ;
			System.out.printf("Operação realizada com sucesso, R$%f é o seu novo saldo",saldo);
		}
	}

	@Override
	public String toString() {
		return "Ola " + nome + " seu numero de conta é " + numero ;
	}
	
	
	
	
	
	
	

}
