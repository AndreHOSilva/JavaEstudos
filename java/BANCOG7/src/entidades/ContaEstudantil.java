package entidades;

public class ContaEstudantil extends Conta {
	
	private double disponivelEmprestimoEstudantil = 5000 ;

	public ContaEstudantil(double saldo, int conta, double disponivelEmprestimoEstudantil) {
		super(conta,saldo);
		this.disponivelEmprestimoEstudantil = disponivelEmprestimoEstudantil;
	}

	
	
	//encapsulamento
	public double getDisponivelEmprestimoEstudantil() {
		return disponivelEmprestimoEstudantil;
	}

	public void setDisponivelEmprestimoEstudantil(double disponivelEmprestimoEstudantil) {
		this.disponivelEmprestimoEstudantil = disponivelEmprestimoEstudantil;
	}
	
	//metodos
	@Override
	public void sacar(double valor) {
		if(valor <= 0) {
			System.out.println("Por favor digite um valor válido");
		}
		else if(valor > saldo) {
			System.out.println("Você não tem saldo suficiente para essa operação");
		}
		else {
			this.saldo = saldo - valor;
			System.out.printf("Operação realizada com sucesso...");
			System.out.printf("\nSeu novo saldo é R$%.2f",saldo);
		}
	}
	@Override
	public void depositar(double valor) {
		if(valor <= 0) {
			System.out.println("Por favor digite um valor válido");
		}else {
			this.saldo = this.saldo + valor ;
			
			System.out.printf("Operação realizada com sucesso...");
			System.out.printf("\nSeu novo saldo é R$%.2f",saldo);
		}
	}
	
	public void emprestimo(double valorEmprestimo2) {
		if(disponivelEmprestimoEstudantil >= valorEmprestimo2) {
			  
			depositar(valorEmprestimo2);
			
			setDisponivelEmprestimoEstudantil( disponivelEmprestimoEstudantil) ;
			
			setDisponivelEmprestimoEstudantil(getDisponivelEmprestimoEstudantil()-valorEmprestimo2);
		}else {
			System.out.println("Você não tem limite de empréstimo para isso");
		}
	}
	public void extrato() {
		System.out.println("----------------------------------");
		System.out.println("--------------Extrato-------------");
		System.out.printf("---Seu saldo é de R$%.2f",saldo);
		System.out.println("\n----------------------------------");
	}
}
