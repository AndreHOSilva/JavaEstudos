package lista2Java;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in) ;
		
		int idade ;
		
		System.out.println("Escreva sua idade :\n");
		idade = x.nextInt() ;
		
		if(idade >=10 && idade <= 14) {
			System.out.println("Você é da categoria infantil");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Você é juvenil");
		}
		else if(idade >=18 && idade <= 25) {
			System.out.println("Você é adulto");
		}

	}

}
