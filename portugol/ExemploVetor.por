programa
{
	
	funcao inicio()
	{
		cadeia nomeAlunos[4]
		inteiro notaAlunos[10]
		//inteiro nota

		para(inteiro x=0; x < 4; x++){
			//escreva(x+ "-")
			escreva("Qual o nome do aluno : ")
			leia(nomeAlunos[x])

			escreva("Qual a nota do aluno : ")
			leia(notaAlunos[x])

			//escreva(nomeAlunos[x++])
			
			  
		}
		limpa()
		para(inteiro x=0 ; x < 4 ; x++){
			escreva(nomeAlunos[x]+ " sua nota é " +notaAlunos[x] + " ")
			 se(notaAlunos[x] <= 5){
			 	escreva(" ,ainda não estude mais \n")
			 	
			 }
			 senao{
			 	escreva(" ,aprovado continue estudando \n")
			 }
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 544; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */