programa
{
	
	funcao inicio()
	{
		real P,E,M

		escreva("Qual o valor de P?\n")
		leia(P)

		E = P - 50
		limpa()

		se(E >= 1 ){
                M = E * 4
                escreva("O excesso foi de " +E+ " kg e a multa será de R$" +M+ "\n") 
			
		}
		senao{
			escreva("O valor de E = 0 e M = 0")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 214; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */