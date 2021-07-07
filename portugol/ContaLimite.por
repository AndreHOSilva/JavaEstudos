programa
{
	
	funcao inicio()
	{
				real saldo=0, saldo1, saldo2, valor = 0, valorC, limite=1000.00 ,limite2 =0 , a
				cadeia continuar, movimento,voltar
				inteiro contador=0
		faca{
					contador++
					escreva (" Ai-taú \n")
					escreva ("\n Dinheiro na mão é vendaval \n\n\n")
				
				
					escreva("BEM VINDO A SUA CONTA ESPECIAL\n\n")
				
		          //saldo = 100
					escreva("Seu saldo atual é de : R$",saldo," com limite de ",limite)
					escreva("\nMOVIMENTO - D-débito ou C-crédito : ")
					leia(movimento)
						escreva("Valor : ")
						leia(valor)
					
		
				se(movimento == "D" ou movimento == "d" e valor > 0 e valor <= saldo){
					
					saldo1 = saldo - valor
					saldo = saldo1
				}
				senao se (movimento == "C" ou movimento == "c" e valor > 0) {
							saldo1 = saldo + valor
							saldo = saldo1
						}
				senao se(valor >=saldo e valor > 0 e limite >=valor - saldo e (movimento == "D" ou movimento == "d" )){
					a = valor - saldo
					limite = limite - a
					saldo = 0
					
				}
				senao se(valor <= 0){
					escreva("\nOpção Inválida\n")
				}
				senao se (limite == 0){
					escreva("\nVocê não possui mais limite\n")
				}
				senao {
					escreva("\nValor alem do limite\n")
				}
				//creva(limite,"\n")
					//creva(saldo)
					
						
				escreva("\nDeseja continuar ? ")
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
 * @POSICAO-CURSOR = 33; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */