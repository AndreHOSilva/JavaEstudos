package lista1Java;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in) ;
		
		
		int segundos, horas, minutos , seg2 ;
		 
		System.out.println("Digite o tempo do evento em segundos : ");
		segundos = x.nextInt() ;
		
		horas = segundos / 3600 ;
		minutos = (segundos % 3600) / 60 ;
		seg2 = (segundos % 3600) % 60 ;
		
		System.out.printf("Seu evento foi de %d horas, %d minutos e %d segundos",horas,minutos,seg2);
		
		
		
		
		

	}

}
