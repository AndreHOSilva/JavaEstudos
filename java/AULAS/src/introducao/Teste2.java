package introducao;

import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in) ;
		
		
		int anoNascimento = 2000 ; //%d
		String nome = "André" ;  //%s
		char sexo = 'M' ; //%c
		double salario = 2000.48587 ; //%f
		
		System.out.println(nome+ " nasceu em " +anoNascimento+ " do sexo " +sexo);
		System.out.printf("%s seu salario é %.3f",nome,salario);
		/*% ponto com número depois no printf eu controlo as casas decimais e tambem o printf 
		formata o texto de acordo com a configuração do meu windons e printf você pode concatenar
		com a vírgula
		*/
	} 

}
