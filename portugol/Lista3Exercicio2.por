programa
{
	
	funcao inicio()
	{
		inteiro numero = 0
		real somaNumero = 0
		
		para(numero =1;numero<=500;numero++){

			se((numero)%3 == 0 e (numero)%2 != 0){
				somaNumero += numero
			}
		}
		escreva("A soma dos ímpares e díviseis por 3 entre 1 e 500 sera :" +somaNumero)
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 112; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */