package entidades;

public class Layout extends Conta {
	
	public Layout() {
		
	}

	public void menuInicio() {
		System.out.println("Bem vindo ao banco G7");
		System.out.println("---------------------");
		System.out.println("1 - CONTA    POUPANÇA");
		System.out.println("---------------------");
		System.out.println("2 - CONTA    CORRENTE");
		System.out.println("---------------------");
		System.out.println("3 - CONTA    ESPECIAL");
		System.out.println("---------------------");
		System.out.println("4 - CONTA EMPRESARIAL");
		System.out.println("---------------------");
		System.out.println("5 - CONTA  ESTUDANTIL");
	}
	
	
	
	public void pularLinha() {
		System.out.println("\n-------------------------------------------------G7----------------------------------------------");
		//System.out.println("\n");
		//System.out.println("\n");
		//System.out.println("\n");
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
	public void menu5() {
		System.out.println("--------------------------------------");
		System.out.println("Bem vindo a conta estudantil Ai-Taú G7");
		System.out.println("Onde dinheiro na mão é vendaval !!!!!!");
		System.out.println("--------------------------------------");
	}
	public void extrato() {
		System.out.println("----------------------------------");
		System.out.printf("-----Seu saldo é de R$%.2f",saldo,"-------");
		System.out.println("----------------------------------");
	}
	
}
