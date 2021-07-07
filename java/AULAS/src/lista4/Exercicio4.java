package lista4;

import java.util.Random;

public class Exercicio4 {
	static Random gerador = new Random();
	public static void main(String[] args) {
		
		
		
		int M[][] = new int[3][3] ;
		int contador=0, soma=0 ;
		
		for(int x=0;x<3;x++) {
			for(int a=0;a<3;a++) {
				M[x][a] =gerador.nextInt(10) ;
				soma+=M[x][a];
				System.out.println(M[x][a]);
			}
			
		}
		System.out.println("A soma será de : "+soma);
		
		

	}

}
