programa
{
	
	funcao inicio()
	{
		inteiro seg,horas,minutos, seg2

		escreva("Qual a duração do evento em segundos ?\n")
		leia(seg)

		horas = seg / 3600
		minutos = (seg % 3600) / 60
		seg2 = (seg % 3600) % 60

		escreva("O tempo do seu evento foi de " +horas+ " horas " +minutos+ " minutos " +seg2+ " segundos")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 209; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */