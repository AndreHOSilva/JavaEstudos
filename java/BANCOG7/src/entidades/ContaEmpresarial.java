package entidades;

public class ContaEmpresarial extends Conta {
	
	
	private double disponivelEmprestimo =10000 ;

	public ContaEmpresarial(double saldo, int conta,double disponivelEmprestimo) {
		super( conta,saldo);
	}
	

	public double getDisponivelEmprestimo() {
		return disponivelEmprestimo;
	}

	public void setDisponivelEmprestimo(double disponivelEmprestimo) {
		this.disponivelEmprestimo = disponivelEmprestimo;
	}
	

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
			System.out.printf("Opera��o realizada com sucesso...Seu novo saldo � R$%f",saldo);
		}
	}
	@Override
	public void depositar(double valor) {
		if(valor <= 0) {
			System.out.println("Por favor digite um valor v�lido");
		}else {
			this.saldo = this.saldo + valor ;
			
			System.out.printf("Opera��o realizada com sucesso...Seu novo saldo � R$%f",saldo);
		}
	}
	public void emprestimo(double valorEmprestimo) {
		if(disponivelEmprestimo >= valorEmprestimo) {
			  
			depositar(valorEmprestimo);
			
			setDisponivelEmprestimo( disponivelEmprestimo) ;
			System.out.println("Seu empr�stimo foi aprovado com sucesso");
			
			setDisponivelEmprestimo(getDisponivelEmprestimo()-valorEmprestimo);
			
		}else {
			System.out.println("Voc� n�o tem limite de empr�stimo para isso");
		}
	}
			
	
	
}
