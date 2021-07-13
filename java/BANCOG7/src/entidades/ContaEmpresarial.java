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
		System.out.println("Bem vindo a conta empresarial Ai-Taú G7");
		System.out.println("Onde dinheiro na mão é vendaval!!!!!!!!");
		System.out.println("---------------------------------------");
	}
	public void emprestimo(double valorEmprestimo) {
		if(disponivelEmprestimo >= valorEmprestimo) {
			  
			super.depositar(valorEmprestimo);
			
			setDisponivelEmprestimo( disponivelEmprestimo) ;
			System.out.println("Seu empréstimo foi aprovado com sucesso");
			
			setDisponivelEmprestimo(getDisponivelEmprestimo()-valorEmprestimo);
			super.extrato();
		}else {
			System.out.println("Você não tem limite de empréstimo para isso");
		}
	}
			
	
	
}
