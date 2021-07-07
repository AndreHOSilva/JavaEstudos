package lista4;

import java.util.Random;

public class Exercicio2 {
	static Random gerador = new Random();
	public static void main(String[] args) {
		double dado[] = new double[10] ;
		//System.out.println(numero);
		int contador = 0 ,soma=0,x=0 ;
		
		for( x = 0;x<10;x++) {
			dado[x] = gerador.nextInt(7) ;
			soma+=dado[x] ;
			System.out.println(dado[x]);
			if(dado[x] == 6) {
				contador++ ;
			}
		}
		System.out.println("A média foi "+soma/10+" e o maior número apareceu "+contador+" vezes");
		
	}

}
