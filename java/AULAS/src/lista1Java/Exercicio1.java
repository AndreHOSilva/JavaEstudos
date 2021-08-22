package lista1Java;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in) ;
		int anos , meses, dias, a , b ;
		System.out.println("Digite sua idade : ");
		anos = x.nextInt() ;
		
		a = anos * 365 ;
		
		System.out.println("Digite quantos meses se passaram depois do ultimo aniversario : ");
		meses = x.nextInt() ;
		
		b = meses * 30 ;
		
		System.out.println("Digite os dias que faltam depois dos meses : ");
		dias = x.nextInt() ;
		
		System.out.printf("Sua idade em dias é de %d",a+b+dias);
		
		
		
	}
	

	
	}
