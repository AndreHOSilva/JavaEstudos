programa
{
	
	funcao inicio()
	{

	   cadeia menu [] = {"CONTA POUPANÇA", "CONTA CORRENTE", "CONTA ESPECIAL", "CONTA EMPRESA", "CONTA ESTUDANTIL","SAIR"}
        inteiro numSelecionado

         escreva (" Ai-taú G7\n")
         escreva ("\n Ai-taú G7 - Dinheiro na mão é vendaval! \n\n\n")

         real saldoInicial = 200.00
       	real saldoTotal =00.0
       	real saldoFinal =00.0
       	real saldoDebito = 00.0
       	real saldoCredito = 00.0
       	cadeia movimento


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

       	inteiro diaAniversarioPoupanca = 1
       	
          escreva (" Ai-taú G7\n")
          escreva ("\n Ai-taú G7 - Dinheiro na mão é vendaval! \n\n\n")
           escreva ("\n CONTA POUPANÇA \n\n\n")
       	escreva ("\nDIGITE APENAS O DIA DO ANIVERSARIO DA POUPANÇA:")
       	leia (diaAniversarioPoupanca)
       	escreva ("\n\n ")


       	se (diaAniversarioPoupanca == 1) 
       	        {
              limpa ()

              
           escreva (" Ai-taú G7\n")
           escreva ("\n Ai-taú G7 - Dinheiro na mão é vendaval! \n\n\n")
           escreva ("\n CONTA POUPANÇA \n\n\n")
           	           
       	     saldoTotal =  saldoInicial * 0.05 
       	     saldoFinal = saldoTotal + saldoInicial
           
       	        }
  
                                           
       	  senao {
       		
       		escreva ("Opção invalida!") 
       		
       		
       	        }
          
          	
            	   }
       	  
       	 
       	 	cadeia sair 
       	 	inteiro valorDebito =0 
       	 	inteiro contador = 0
       	 	real valorCredito = 00.0
       	     
       	     
       	 faca { 

       	     
                           
                             contador ++
       	 	
						escreva (" Ai-taú \n")
     					escreva ("\n Dinheiro na mão é vendaval \n\n\n")	

     					escreva("\nCONTA POLPANÇA\n")
     					escreva("\nSaldo atual: ",saldoFinal)
     					

						escreva("\nMOVIMENTO - D-débito ou C-crédito : ")
						leia(movimento)

					se(movimento == "D" ou movimento == "d"){
								escreva("Valor : ")
								leia(valorDebito)
								saldoDebito = saldoFinal - valorDebito

								escreva ("Seu saldo atual é: "+saldoDebito)
								
								
			
					}
					senao
					{
						escreva("Valor: ")
						leia(valorCredito)
						saldoCredito = saldoFinal + valorCredito
						
						escreva ("Seu saldo atual é: "+saldoCredito)
					
				    }

				
				escreva("\nDeseja continuar ?")
		leia(sair)

					
					
					}enquanto( contador <3 ou sair == "s" ou sair == "S")

					
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2847; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */