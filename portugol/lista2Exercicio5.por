programa
{
	
	funcao inicio()
	{
		real indpol

		escreva("Digite valor do índice de poluição : ")
		leia(indpol)

		se(indpol >= 0.5){
			escreva("Todos os grupos devem parar")
		}
		senao se(indpol >= 0.4){
			escreva("Industrias do primeiro e segundo grupo suspendam suas atividades")
		}
		senao se(indpol >= 0.3){
			escreva("Industrias do primeiro grupo favor suspender suas atividades")
		}
		senao{
			escreva("Índice de poluição dentro dos limites aceitáveis")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 479; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */