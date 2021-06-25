programa
{
	inclua biblioteca Matematica --> Mat
	funcao inicio()
	{
		real a,b,c,d,E,f,x,y

		escreva("Digite a : ")
		leia(a)

		escreva("Digite b : ")
		leia(b)
		
		escreva("Digite c : ")
		leia(c)
		
		escreva("Digite d : ")
		leia(d)
		
		escreva("Digite E : ")
		leia(E)
		
		escreva("Digite f : ")
		leia(f)

		x = (c*E - b*f) / (a*E - b*d)
		y = (a*f - c*d) / (a*E - b*d)

		escreva("Os valor de x será de " +Mat.arredondar(x,3)+ " enquanto o de y será " +Mat.arredondar(y,3)) 

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 489; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */