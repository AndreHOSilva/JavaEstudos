programa
{
	//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
     //  atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	funcao inicio()
	{
		inteiro notaAtividade[5]
		inteiro maiorNota = 0

		para(inteiro x = 0; x<5; x++){
			escreva("Digite o valor da pontuação : ")
			leia(notaAtividade[x])

			se(notaAtividade[x] > maiorNota){
				maiorNota = notaAtividade[x]
			}
			limpa()
		}
		escreva("Segue a baixo as 5 notas da atividade :\n")
		para(inteiro x = 0; x<5; x++){
			escreva(notaAtividade[x]+ "\n")
		}
		escreva("E essa foi a maior nota : " +
		maiorNota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 230; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notaAtividade, 7, 10, 13};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */