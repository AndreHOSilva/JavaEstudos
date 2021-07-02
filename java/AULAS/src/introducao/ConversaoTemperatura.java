package introducao;

import java.util.Scanner;

public class ConversaoTemperatura {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in) ;
		
		
		int TemperaturaF , celsius  ;
		double a , c , F , k ;
		
		System.out.println("Digite a temperatura em F : ");
		TemperaturaF = leia.nextInt() ;
		
		System.out.println("Digite a temperatura em C : ");
		celsius = leia.nextInt() ;
		
		a = 9.0/5.0 ;
		
		F = 32 + (a * celsius) ;
				
		c = a * (TemperaturaF - 32) ;
		k = celsius + 273 ;
		
		
		
		
		System.out.println("A temperatura em celsius sera de : " +c);
		System.out.println("A temperatura em Farenheite sera de : " +F);
		System.out.println("A temperatura em kelvin sera de : " +k);
	}

}
