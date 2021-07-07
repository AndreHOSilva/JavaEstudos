package introducao;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in) ;
		
		//String alunos[] = new String[4]
		
		String alunos[] = {"JOAO" , "MARCOS", "MARIA" , "PEDRO"} ;
		String nome ;
		
		//nextLine() le a linha inteira com espaço
		System.out.println("Digite seu nome :");
		nome = leia.nextLine();
		
		System.out.println("Tamanho seu nome é "+nome.length());
		
		alunos[3] = alunos[3].toLowerCase() ;
		System.out.println(alunos[3]);
		
		//.length retorna o tamanho do vetor ou da string
		
		for(int x = 0 ; x<alunos.length;x++) {
			System.out.println(alunos[x]= alunos[x].toLowerCase());
			
		}
		//for each
		for(String x : alunos) {
			System.out.println(x);
		}

	}

}
