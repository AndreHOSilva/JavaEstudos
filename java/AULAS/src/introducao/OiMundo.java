package introducao;

import java.util.Scanner;

public class OiMundo {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in) ; 
		
		String nome ;
		double salario ;
		
		System.out.println("Digite seu nome :\n");
		nome = leia.next() ;
		
		System.out.println("Digite seu s�lario : ") ;
		salario = leia.nextDouble() ;
			
		
		
		
		System.out.printf("Ola %s seu sal�rio � de %.2f" ,nome,salario);
	}

}
