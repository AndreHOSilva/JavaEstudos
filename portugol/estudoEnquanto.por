programa
{
	/*para ou for eu uso quando sei o limite de repetições e o enquanto ou while 
	eu uso quando não sei o limite
	*/
	funcao inicio()
	{
		inteiro idade
		inteiro contador = 0
		
		escreva("Digite sua idade ")
		leia(idade)
		
		enquanto(idade < 18){
			escreva("Você não tem autorização para esse site\n")
			

			escreva("Digite sua idade ")
			leia(idade)
			contador++
			
			
		}
		escreva("Parabéns você tem acesso")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 387; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */