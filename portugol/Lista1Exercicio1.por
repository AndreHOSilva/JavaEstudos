programa
{
	
	funcao inicio()
	{
	      inteiro dias,meses,anos,idadeD
	      inteiro a,b

	      escreva("a baixo sera solicitado sua idade completa em anos, meses e anos, favor seguie essa ordem\n")

	      escreva("quantos anos você tem ?\n")
	      leia(anos)

	      escreva("quantos meses se passou desde que completou essa idade?\n")
	      leia(meses)

	      escreva("quantos dias se passou desde o ultimo mês contado ?\n")
	      leia(dias)

	      a = anos * 365
	      b = meses * 30

	      idadeD = a + b + dias

	      escreva("essa é a sua idade em dias " +idadeD)

	      
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 248; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */