programa
{
	inclua biblioteca Calendario
	inclua biblioteca Util
	
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
                  se(numSelecionado ==2 ){
				cadeia sair = "n" 
				real saldo = 0.00
				cadeia  movimento
				inteiro talao = 3, numTaloes//1talao = - 30,00 no saldo
				real valorD
				real valorC
				inteiro contador = 0
				real saldoFinal
				cadeia pedirTalao, voltar
		          limpa()		
				faca { 
						contador ++
						escreva (" Ai-taú \n")
     					escreva ("\n Dinheiro na mão é vendaval \n\n\n")	

     					escreva("\nBEM VINDO A CONTA CONTA CORRENTE\n")
     					escreva("\nSaldo atual: ",saldo)
     					escreva("\nQUANTIDADE DE: ",talao, " talões \n")

						escreva("\nMOVIMENTO - D-débito ou C-crédito : ")
						leia(movimento)

					se(movimento == "D" ou movimento == "d"){
								escreva("Valor : ")
								leia(valorD)
								saldoFinal = saldo - valorD
								saldo = saldoFinal
			
					}
					senao{
						escreva("Valor: ")
						leia(valorC)
						saldoFinal = saldo + valorC
						saldo = saldoFinal
					}
	/*escreva("\nVocê gostaria de retirar talões de cheque? Será debitado 30r$ por talão!\n ")
	leia(pedirTalao)*/
					escreva("\nDeseja continuar ?")
					leia(sair)
					
					se(contador == 10  ou sair == "N" ou sair == "n"){
						escreva("\nVocê gostaria de retirar talões de cheque? Será debitado 30r$ por talão!\n ")
						leia(pedirTalao)
						 
						 se (pedirTalao == "s" ou pedirTalao == "S"){
						 	escreva("Qual o número de talões ?")
						 	leia(numTaloes)
						 	se(numTaloes == 1){
						 		saldo = saldo - 30
									 talao = talao - 1
						 	}
						 	senao se(numTaloes == 2){
						 		saldo = saldo - 60
									 talao = talao - 2
						 	}
						 	senao{
						 		saldo = saldo - 90
								 talao = talao - 3
						 	}
									 
							pare
						 }
							
					} 
					
					//escreva("--------------------")
					limpa()
				
					
					}enquanto( contador < 10 ou sair == "s" ou sair == "S")
						limpa()
						escreva (" Ai-taú \n")
     					escreva ("\n Dinheiro na mão é vendaval \n\n\n")	
						escreva ("\nSeu saldo final é de: ",saldo, "\n")
						escreva("\nVocê ainda tem: ",talao, " talões disponíveis.\n")
						escreva("\nObrigado e volte sempre!!\n ")
						escreva("\nGostaria de voltar ao menu principal ?")
			    			leia(voltar)
						
						se(voltar =="S" ou voltar== "s"){
						limpa()
			     		inicio()
						}
			
			}
                  senao se(numSelecionado ==3){
                  	real saldo=0.00, saldo1, saldo2, valorD, valorC, limite=1000.00 ,limite2 =0 , a
				cadeia continuar, movimento,voltar
				inteiro contador=0
				
				faca{
					contador++
					escreva (" Ai-taú \n")
					escreva ("\n Dinheiro na mão é vendaval \n\n\n")
				
				
					escreva("BEM VINDO A SUA CONTA ESPECIAL\n\n")
				
		          //saldo = 100
					escreva("Seu saldo atual é de : R$",saldo,"\n")
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
						escreva("Limite atualizado: ",limite,"\n")
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
				escreva("\nDeseja continuar ? ")
				leia(continuar)
				limpa()

				

	
		}
		enquanto(contador < 10 e (continuar == "S" ou continuar =="s"))
				escreva (" Ai-taú \n")
				escreva ("\n Dinheiro na mão é vendaval \n\n\n")
						
				escreva("Obrigado por utilizar o nosso banco\n")
				escreva("Seu saldo final foi de R$",saldo, " com ainda R$",limite," para usar")
			     escreva("\nGostaria de voltar ao menu principal ?")
			     leia(voltar)
						
				se(voltar =="S" ou voltar== "s"){
				limpa()
			     inicio()
				}
                  	
                  }
          			senao se(numSelecionado == 4){
          				     inteiro movimentos = 0
							real saldo, saldo1, valorD, valorC, valorEmprestimo, totEmprestimo = 10000
							//real 
							cadeia continuar , interesse, movimento, voltar
							saldo = 0
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
									escreva("\n e você ainda tem ",totEmprestimo, " para pedir")
									escreva("\nTem interesse ? ")
								}
								senao{
									escreva("\nEmpréstimo de até R$10000,00 agora, !!")
									escreva("\n e você ainda tem ",totEmprestimo, " deseja ? ")
									
									
								}
								leia(interesse)
								//escreva(interesse)
						
								se(interesse == "S" ou interesse == "s"){
									escreva("Qual o valor do empréstimo ? ")
									leia(valorEmprestimo)
									saldo = saldo + valorEmprestimo
									totEmprestimo = 10000 - valorEmprestimo
								}
								
								escreva("\nDeseja continuar ?\n")
								leia(continuar)
								limpa()
								
									
								}enquanto(movimentos < 10 e (continuar == "S" ou continuar =="s"))
						
								escreva (" Ai-taú \n")
								escreva ("\n Dinheiro na mão é vendaval \n\n\n")
						
								escreva("Obrigado por utilizar o nosso banco\n")
								escreva("Seu saldo final foi de R$",saldo, " com ainda R$",totEmprestimo," para pedir")
						          escreva("Gostaria de voltar ao menu principal ?")
						          leia(voltar)
						
						          se(voltar =="S" ou voltar== "s"){
						          	limpa()
						          	inicio()
						          }
          				
          			}
          			senao se(numSelecionado == 5){
          				inteiro movimentos = 0
						real saldo, saldo1, valorD, valorC, valorEmprestimo, totEmprestimo = 5000
						cadeia continuar , interesse, movimento, voltar
						saldo = 0
						faca{
							movimentos++
							escreva (" Ai-taú \n")
						escreva ("\n Dinheiro na mão é vendaval \n\n\n")
						
						
						escreva("BEM VINDO A SUA CONTA ESTUDANTIL\n")
						
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
							escreva("\nGostariamos de lembrar que confiamos nos seus estudos,\n")
							escreva("por isso liberamos um empréstimo exlusivo para você investir nele no valor de R$5000")
							escreva("\n e você ainda tem ",totEmprestimo, " para solicitar")
							escreva("\nTem interesse ? ")
						}
						senao{
							escreva("\nEmpréstimo de até R$5000,00 agora, queremo investir no seu conhecimento !!")
							escreva("\n e você ainda tem ",totEmprestimo, " quer solicitar ? ")
							
							
						}
						leia(interesse)
						//escreva(interesse)
				
						se(interesse == "S" ou interesse == "s"){
							escreva("Qual o valor do empréstimo ? ")
							leia(valorEmprestimo)
							saldo = saldo + valorEmprestimo
							totEmprestimo = 5000 - valorEmprestimo
						}
						
						escreva("\nDeseja continuar ?")
						leia(continuar)
						limpa()
						
							
						}enquanto(movimentos < 10 e (continuar == "S" ou continuar =="s"))
				
						escreva (" Ai-taú \n")
						escreva ("\n Dinheiro na mão é vendaval \n\n\n")
				
						escreva("Obrigado por utilizar o nosso banco\n")
						escreva("Seu saldo final foi de R$",saldo, " com ainda R$",totEmprestimo," para pedir")
						escreva("\nGostaria de voltar ao menu principal ?")
						          leia(voltar)
						
						          se(voltar =="S" ou voltar== "s"){
						          	limpa()
						          	inicio()
						          }
          			}
          			senao{
          				
						escreva (" Ai-taú \n")
						escreva ("\n Dinheiro na mão é vendaval \n\n\n")
				
						escreva("Obrigado por utilizar o nosso banco\n")
						escreva("\nVoltando ao menu principal")
						Util.aguarde(3000)
						limpa()
						inicio()
						
          			}
          			
                  }
}                  
                  

       	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2816; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */