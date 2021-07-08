package introducao;

import java.util.Scanner;

public class CadastroPessoas {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in) ;
		String nome,sexo=" ",sexo2=" ",nome2=" ",nome1=" " ;
		int idade,contador,maiorIdade =0,menorIdade=0;
		
		for(int a =0;a<3;a++) {
			System.out.println("Digite seu nome :");
			nome = x.next();
			
			System.out.println("Digite seu sexo :");
			sexo = x.next() ;
			
			System.out.println("Digite sua idade :");
			idade = x.nextInt();
			
			if(idade>maiorIdade) {
				maiorIdade=idade ;
				nome2 = nome ;
				sexo2 = sexo ;
				
			}
			else if(idade <menorIdade) {
				menorIdade =idade ;
				nome2 = nome;
			}
		}
		
		
		
		System.out.printf("Seu nome é %s com sexo %s e idade %d o que te faz mais velho(a)",nome2.toUpperCase(),sexo2,maiorIdade);
		
		

	}

}
