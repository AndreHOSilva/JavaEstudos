programa
{
	
	funcao inicio()
	{
		real saldo=0.00, saldo1, saldo2, valorD, valorC, limite=1000.00 ,limite2 =0 , a
		cadeia continuar, movimento
		inteiro contador=0
		
		faca{
			contador++
			escreva (" Ai-taú \n")
			escreva ("\n Dinheiro na mão é vendaval \n\n\n")
		
		
			escreva("BEM VINDO A SUA CONTA ESPECIAL\n")
		
          //saldo = 100
			escreva("Seu saldo atual é de : R$",saldo)
			escreva("\nMOVIMENTO - D-débito ou C-crédito : ")
			leia(movimento)

		se(movimento == "D"){
			escreva("Valor : ")
			leia(valorD)
			saldo1 = saldo - valorD
			saldo = saldo1
			

			se (saldo <= 0){
				//limite = 1000
				//real limite2 = limite
				limite = limite + saldo
				escreva(limite)
				se(contador == 1){
					a = 1000 - limite
					saldo = saldo +(a)		
				}
				senao{
					a = 1000 - limite 
					saldo = saldo+(a-100)
				}
			}
			
		}
		senao{
			escreva("Valor : ")
			leia(valorC)
			saldo1 = saldo + valorC
			saldo = saldo1
		
		}
		escreva("\nDeseja continuar ?")
		leia(continuar)
		limpa()

	
		}
		enquanto(contador < 10 e (continuar == "S" ou continuar =="s"))
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 491; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */