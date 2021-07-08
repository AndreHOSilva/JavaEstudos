package programas;

import java.util.Scanner;

import obejeto.Pessoa;

public class CadBanca {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in) ;
		
		Pessoa cliente1 = new Pessoa() ;
		Pessoa cliente2 = new Pessoa() ;
		
		
		System.out.println("Digite seu nome :");
		cliente1.nome = leia.next() ;
		
		System.out.println("Digite sua ano nascimento :");
		cliente1.anoNascimento = leia.nextInt();
		
		System.out.println("Cliente 2");
		System.out.println("Digite seu nome : ");
		cliente2.nome = leia.next();
		
		System.out.println("Digite seu ano de nascimento :");
		cliente2.anoNascimento=leia.nextInt();
		
		
		//estou usando método que me pedi o ano e calcula a idade da pessoa
		if(cliente2.calculaIdade(2021)>=18 && cliente1.calculaIdade(2021)>=18) {
			System.out.println("Parabens vcs dois são maiores de idade");
			System.out.printf("%s e  %s  ",cliente1.nome,cliente2.nome);
			System.out.println("Com idades a baixo");
			cliente1.mostrarIdade();
			cliente2.mostrarIdade();
			
		}
		
		
		
	}

}
