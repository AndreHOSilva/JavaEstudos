package lista3Java;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in) ;
		
		int idade, contador= 0 , contador2= 0 ;
		
		System.out.println("Digite sua idade\n");
		idade = x.nextInt() ;
				
	    while(idade != -99) {
	    	System.out.println("Digite sua idade\n");
	    	idade = x.nextInt() ;
	    	
	    	if( idade < 21) {
	    		contador++ ;
	    	}
	    	else if(idade > 50) {
	    		contador2++ ;
	    	}
	    }
	    System.out.printf("O total de pessoas a baixo de 21 anos foi de %d, enquanto acima de 50 foi de %d",contador,contador2);
	}

}
