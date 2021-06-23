programa
{
     inclua biblioteca Matematica --> Mat
	funcao inicio()
	{
		inteiro A,B,C
		real D

          escreva("Qual o valor de A?\n")
          leia(A)

          escreva("Qual o valor de B?\n")
          leia(B)

          escreva("Qual o valor de C?\n")
          leia(C)

          D = ((Mat.potencia((A+B) , 2)) + (Mat.potencia((B+C), 2)))/2

          escreva("O valor de D sera :" +D)

          

          
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 264; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */