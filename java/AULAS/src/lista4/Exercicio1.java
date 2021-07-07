package lista4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in) ;
		
		int notas[] = new int[4] ;
		String nomes[] = {"andre" , "fabio","felipe","mateus"} ;
		
		for(int x = 0 ; x<4;x++) {
			System.out.printf("aluno %s digite a nota da atividade : ",nomes[x].toUpperCase(),notas[x]);
			notas[x] = leia.nextInt() ;
		}
		for(int x = 0;x<4;x++) {
			System.out.printf("\n%s obeteve nota %d na atividade",nomes[x].toUpperCase(),notas[x]);
		}
	}

}
