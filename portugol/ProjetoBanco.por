programa
{
	
	funcao inicio()
	{
		inteiro movimentos = 0
		real saldo, saldo1, valorD, valorC
		cadeia continuar , interesse, movimento
		saldo = 100
		faca{
			movimentos++
			escreva (" Ai-taú \n")
		escreva ("\n Dinheiro na mão é vendaval \n\n\n")
		
		
		escreva("BEM VINDO A SUA CONTA EMPRESARIAL\n")
		
          //saldo = 100
		escreva("Seu saldo atual é de : R$",saldo)
		escreva("\nMOVIMENTO - D-débito ou C-crédito : ")
		leia(movimento)

		se(movimento == "D"){
			escreva("Valor : ")
			leia(valorD)
			saldo1 = saldo - valorD
			saldo = saldo1
			
		}
		senao{
			escreva("Valor : ")
			leia(valorC)
			saldo1 = saldo + valorC
			saldo = saldo1
		}

		se(movimentos%2 != 0){
			escreva("\nGostariamos de lembrar que você é especial a nós,\n")
			escreva("por isso liberamos um empréstimo exlusivo para você no valor de R$10000")
			escreva("\nTem interesse ?")
		}
		senao{
			escreva("\nEmpréstimo de até R$10000,00 agora, deseja ? !!")
			
			
		}
		leia(interesse)
		escreva(interesse)

		
		
		
		
		
		
		escreva("\nDeseja continuar ?")
		leia(continuar)
		limpa()
		
			
		}enquanto(movimentos < 10 e (continuar == "S" ou continuar =="s"))

		escreva("Fim do programa")

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 638; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */