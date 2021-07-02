package lista1Java;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in) ;
		
		double x1,x2,y1, y2 , a , d , b;
		System.out.println("Digite o X1 :\n");
		x1 = x.nextDouble() ;
		
		System.out.println("Digite o Y1 :\n");
		y1 = x.nextDouble() ;
				
		System.out.println("Digite o X2 :\n");
		x2 = x.nextDouble() ;
				
		System.out.println("Digite o Y2 :\n");
		y2 = x.nextDouble() ;
		
		a = Math.pow((x2-x1), 2) ;
		b= Math.pow((y2-y1), 2) ;
		//d = a+b ;
		
		d = Math.sqrt((a+b));
		
		System.out.printf("O valor de D é %.2f",d);
		
		
	}
}
