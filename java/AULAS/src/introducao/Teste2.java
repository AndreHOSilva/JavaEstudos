package introducao;

import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in) ;
		
		
		int anoNascimento = 2000 ; //%d
		String nome = "Andr�" ;  //%s
		char sexo = 'M' ; //%c
		double salario = 2000.48587 ; //%f
		
		System.out.println(nome+ " nasceu em " +anoNascimento+ " do sexo " +sexo);
		System.out.printf("%s seu salario � %.3f",nome,salario);
		/*% ponto com n�mero depois no printf eu controlo as casas decimais e tambem o printf 
		formata o texto de acordo com a configura��o do meu windons e printf voc� pode concatenar
		com a v�rgula
		*/
	} 

}
