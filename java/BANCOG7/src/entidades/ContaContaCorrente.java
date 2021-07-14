package entidades;

public class ContaContaCorrente extends Conta {
	
	
	private int taloes ;

	public ContaContaCorrente(double saldo, int conta, int taloes) {
		super(conta,saldo);
		this.taloes = taloes;
	}
	
	//encapsulamento
	public int getTaloes() {
		return taloes;
	}

	public void setTaloes(int taloes) {
		this.taloes = taloes;
	}

	//metodo
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
			System.out.printf("Seu novo saldo é R$%.2f",saldo);
		}
	}
	
	public void tirarTalao(int quantidade) {
		if(quantidade == 1 && getTaloes() >=1 && saldo >= 30 ) {
			setTaloes(this.taloes = this.taloes -1) ;
			sacar(30);
		}
		else if(quantidade == 2 && getTaloes() >= 2 && saldo >= 60) {
			setTaloes(this.taloes=this.taloes -2) ;
			sacar(60);
		}
		else if(quantidade == 3 && getTaloes() == 3 && saldo >= 90) {
			setTaloes(this.taloes = this.taloes -3) ;
			sacar(90);
		
		}
		else {
			System.out.println("Você não tem saldo suficiente ou limite");
			System.out.println("de talões atingido");
		}
	}
	public void extrato() {
		System.out.println("----------------------------------");
		System.out.println("--------------Extrato-------------");
		System.out.printf("---Seu saldo é de R$%.2f",saldo);
		System.out.println("\n----------------------------------");
	}
	
	
	
}
