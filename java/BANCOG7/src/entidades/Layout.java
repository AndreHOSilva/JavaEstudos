package entidades;

public class Layout extends Conta {
	
	public Layout() {
		
	}

	public void menuInicio() {
		System.out.println("1 - CONTA POUPANÇA\n");
		System.out.println("2 - CONTA CORRENTE\n");
		System.out.println("3 - CONTA ESPECIAL\n");
		System.out.println("4 - CONTA EMPRESARIAL\n");
		System.out.println("5 - CONTA ESTUDANTIL\n");
	}
	
	
	
	public void pularLinha() {
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		//System.out.println("\n");
		//System.out.println("\n");
		//System.out.println("\n");
		//System.out.println("\n");
		//System.out.println("\n");
		
	}
	public void menu3() {
		System.out.println("---------------------------------------");
		System.out.println("Bem vindo a conta especial Ai-Taú G7");
		System.out.println("Onde dinheiro na mão é vendaval!!!!!!!!");
		System.out.println("---------------------------------------");
	}
	
	
	public void menu2() {
		System.out.println("---------------------------------------");
		System.out.println("Bem vindo a conta corrente Ai-Taú G7");
		System.out.println("Onde dinheiro na mão é vendaval!!!!!!!!");
		System.out.println("---------------------------------------");
	}

	public void menu1() {
		System.out.println("------------------------------------");
		System.out.println("Bem vindo a conta poupança Ai-Taú G7");
		System.out.println("Onde dinheiro na mão é vendaval !!!!");
		System.out.println("------------------------------------");
	}
	public void menu4() {
		System.out.println("---------------------------------------");
		System.out.println("Bem vindo a conta empresarial Ai-Taú G7");
		System.out.println("Onde dinheiro na mão é vendaval !!!!!!!");
		System.out.println("---------------------------------------");
	}
}
