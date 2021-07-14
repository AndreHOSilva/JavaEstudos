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
			System.out.println("Por favor digite um valor v�lido");
		}
		else if(valor > saldo) {
			System.out.println("Voc� n�o tem saldo suficiente para essa opera��o");
		}
		else {
			
			this.saldo = saldo - valor;
			
			System.out.printf("Opera��o realizada com sucesso...");
			System.out.printf("Seu novo saldo � R$%.2f",saldo);
			
		}
	}
	@Override
	public void depositar(double valor) {
		if(valor <= 0) {
			System.out.println("Por favor digite um valor v�lido");
		}else {
			this.saldo = this.saldo + valor ;
			
			System.out.printf("Opera��o realizada com sucesso...");
			System.out.printf("Seu novo saldo � R$%.2f",saldo);
		}
	}
	
	public void tirarTalao(int quantidade) {
		if(quantidade == 1 && getTaloes() >=1 ) {
			setTaloes(this.taloes = this.taloes -1) ;
			sacar(30);
		}
		else if(quantidade == 2 && getTaloes() >= 2) {
			setTaloes(this.taloes=this.taloes -2) ;
			sacar(60);
		}
		else if(quantidade == 3 && getTaloes() == 3) {
			setTaloes(this.taloes = this.taloes -3) ;
			sacar(90);
		
		}
		else {
			System.out.println("Voc� n�o tem saldo suficiente");
		}
	}
	
	
	
}
