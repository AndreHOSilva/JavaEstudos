package entidades;

public class ContaEmpresarial extends Conta {
	
	
	private double disponivelEmprestimo = 10000 ;

	public ContaEmpresarial(String nome, int conta, double disponivelEmprestimo) {
		super(nome, conta);
		this.disponivelEmprestimo = disponivelEmprestimo;
	}
	
	public ContaEmpresarial(String nome, int conta) {
		super(nome, conta);
	}

	public double getDisponivelEmprestimo() {
		return disponivelEmprestimo;
	}

	public void setDisponivelEmprestimo(double disponivelEmprestimo) {
		this.disponivelEmprestimo = disponivelEmprestimo;
	}
	
	public void menu() {
		System.out.println("---------------------------------------");
		System.out.println("Bem vindo a conta empresarial Ai-Ta� G7");
		System.out.println("Onde dinheiro na m�o � vendaval!!!!!!!!");
		System.out.println("---------------------------------------");
	}
	public void emprestimo(double valorEmprestimo) {
		if(disponivelEmprestimo >= valorEmprestimo) {
			  
			super.depositar(valorEmprestimo);
			
			setDisponivelEmprestimo( disponivelEmprestimo) ;
			System.out.println("Seu empr�stimo foi aprovado com sucesso");
			
			setDisponivelEmprestimo(getDisponivelEmprestimo()-valorEmprestimo);
			super.extrato();
		}else {
			System.out.println("Voc� n�o tem limite de empr�stimo para isso");
		}
	}
			
	
	
}
