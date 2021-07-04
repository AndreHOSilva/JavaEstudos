programa
{
	inclua biblioteca Calendario
	
	funcao inicio()
	{

	   cadeia menu [] = {"CONTA POUPANÇA", "CONTA CORRENTE", "CONTA ESPECIAL", "CONTA EMPRESA", "CONTA ESTUDANTIL","SAIR"}
        inteiro numSelecionado

         escreva (" Ai-taú G7\n")
         escreva ("\n Ai-taú G7 - Dinheiro na mão é vendaval! \n\n\n")


      para (inteiro x=0; x<6; x++)
                 {
      	escreva (x+1," - "+menu[x]+ "\n")
      	escreva ("\n")
                 }
       
          escreva ("DIGITE O CODIGO DA OPÇÃO SELECIONADA: \n")
          leia (numSelecionado)
          limpa ()

       se ( numSelecionado==1) 
                  {
                  		inteiro movimentos = 0 , diaAniversario
					real saldo=0, saldo1, valorD, valorC
					cadeia continuar , interesse, movimento, voltar
                  	
				faca{
					
					//saldo = 0
					movimentos++
					escreva (" Ai-taú \n")
					escreva ("\n Dinheiro na mão é vendaval \n\n\n")
		
		
					escreva("BEM VINDO A SUA CONTA POUPANÇA\n")
		
         		 		//saldo = 100
					escreva("Seu saldo atual é de : R$",saldo)
					escreva("\nLembre-se das atualizações de saldo da sua conta")
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
					//funcao inteiro dia_mes_atual()
					inteiro dia = Calendario.dia_mes_atual()
					escreva("Data de hoje é : "+dia)

					escreva("\nDigite o aniversário da sua conta :\n")
					leia(diaAniversario)
					//limpa()

					se(dia == diaAniversario){
						escreva("Seu saldo será atualizado")
						saldo = (saldo * 0.05)+saldo
						
					}
					senao{
						escreva("Ainda não é a data de aniversário da sua conta")
					}
					
					
					

					escreva("\nDeseja continuar ?\n")
		       		leia(continuar)
					limpa()

                  	
                  		}enquanto(movimentos < 10 e (continuar == "S" ou continuar =="s"))
                  		escreva (" Ai-taú \n")
					escreva ("\n Dinheiro na mão é vendaval \n\n\n")

					escreva("Obrigado por utilizar o nosso banco\n")
					escreva("Seu saldo final foi de R$",saldo)
          			escreva("\nGostaria de voltar ao menu principal ?")
         				leia(voltar)

         				 se(voltar =="S" ou voltar== "s"){
          					limpa()
          					inicio()
          			}
                  	}
                  }
}                  
                  

       	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1600; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */