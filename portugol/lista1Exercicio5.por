programa
{
	
	funcao inicio()
	{
		real nota1,nota2,nota3,mediaP, media

		escreva("Qual a primeira nota?\n")
		leia(nota1)

		escreva("Qual a segunda nota?\n")
		leia(nota2)

		escreva("Qual a terceira nota?\n")
		leia(nota3)

		mediaP = ((nota1 * 2) +(nota2 * 3) + (nota3 * 5))/ 10
		media = (nota1 + nota2 + nota3) /3
		

		escreva("A média ponderada da sua nota sera de " +mediaP+ " enquanto a media normal sera de " +media+ "\n")

		se(mediaP >= 8) {
			escreva("Voce foi aprovado")
		}
		senao{
			escreva("voce foi reprovado")
		}
		

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 527; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */