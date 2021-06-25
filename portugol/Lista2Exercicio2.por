programa
{
	funcao inicio()
	{
		real C,N, salario,excedente
		const real sbase = 500

		escreva("Digite o código: ")
		leia(C)

		escreva("Digite horas trabalhadas: ")
		leia(N)
		limpa()

		se(N > 50){
			excedente = ((N - 50) * 20)
			salario = sbase
			escreva("Seu salário será de : R$500,00 com mais um excedente de R$" +excedente+ " dando um total de R$" +(salario + excedente)) 
		}
		senao{
			excedente = 0
			salario = N * 10
			escreva("Seu salario sera de R$" +salario+ " e excedente de " +excedente+ " horas" )
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 89; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */