programa
{
	inclua biblioteca Util --> U
	
	funcao inicio()
	{
		inteiro valorDado[10]
		inteiro numT = 0 , num , contador = 0 , maiorNumero = 0
		real media

		para(inteiro x = 0; x<10;x++){
			num = U.sorteia(1, 6)
			valorDado[x] = num
			numT += num 
			
			se(num == 6){
				contador++
			}
			
		
			
		}
		 
		escreva("Numeros sorteados \n")
		para(inteiro x = 0; x<10;x++){
		escreva(valorDado[x]+ "\n")
		}
		media = numT/10
		escreva("A média aritmética foi de : "+media)
		escreva("\nA ocorrencia do maior número foi de : "+(contador))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 275; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valorDado, 7, 10, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */