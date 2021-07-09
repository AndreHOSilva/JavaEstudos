package programas;

import java.util.Scanner;

import obejeto.Funcionario;

public class FuncionarioJob {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Funcionario Funcionario1 = new Funcionario() ;
		
		/*public double salario ;
		public boolean beneficios ;
		public int mesferias ;
		public boolean uniforme ;
		public int numeroCarteiraTrabalho ;
		public double fgts;
		*/
		
		System.out.println("Digite seu salario :");
		Funcionario1.salario=leia.nextDouble();
		
		Funcionario1.beneficios = true;
		Funcionario1.uniforme = true;
		
		System.out.println("Digite seu mês de férias :");
		Funcionario1.mesferias = leia.nextInt();
		
		System.out.println("Digite numero da sua carteira de trabalho :");
		Funcionario1.numeroCarteiraTrabalho = leia.nextInt();
		
		System.out.println("Quanto você tem de fgts ?");
		Funcionario1.fgts = leia.nextDouble();
		
		Funcionario1.leis();
		Funcionario1.chegando();
		Funcionario1.iniciar();
		Funcionario1.ajustar();
		
		
	}

}
