
package entidades;

public class ContaEspecial extends Conta {
	
	private double limite;

	//constructor
	public ContaEspecial(double saldo, int conta, double limite) {
		super(conta,saldo);
		this.limite = limite;
	}


		//ENCAPSULAMENTO 
	public double getLimite() {
		return limite;
	}

	

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	//metodo
	@Override
	public void sacar(double valor) {
		if(valor < 0) {
			System.out.println("Por favor digite um valor válido");
		}
		else if(valor > getLimite() + saldo) {
			System.out.println("Você não tem saldo suficiente para essa operação");
		}
		else {
			this.saldo = saldo - valor;
			System.out.printf("Operação realizada com sucesso...Seu novo saldo é R$%f",saldo);
		}
	}
	@Override
	public void depositar(double valor) {
		if(valor < 0) {
			System.out.println("Por favor digite um valor válido");
		}else {
			this.saldo = this.saldo + valor ;
			
			System.out.printf("Operação realizada com sucesso...Seu novo saldo é R$%f",saldo);
		}
	}
	public void usarLimite() {
		double valor = 0;
		setLimite(this.limite = this.limite +saldo - valor);
		depositar(valor);
		
	}
	

}
