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
					real saldo=0, saldo1, valor
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
					escreva("Valor : ")
							leia(valor)

						se(valor > 0){
							se((movimento == "D" ou movimento == "d") e valor <= saldo e saldo > 0){
							saldo1 = saldo - valor
							saldo = saldo1
							
							}
							senao se(movimento == "C" ou movimento == "c"){
							saldo1 = saldo + valor
							saldo = saldo1
							escreva("\nDigite o aniversário da sua conta :\n")
							leia(diaAniversario)
							inteiro dia = Calendario.dia_mes_atual()
							//limpa()
								se(dia == diaAniversario){
									
									escreva("Data de hoje é "+dia+" que coincide com aniversário\n")
									se(dia == diaAniversario){
										escreva("Seu saldo será atualizado em 5%\n")
										saldo = (saldo * 0.05)+saldo
						
									}
								}
								senao{
									escreva("\nNão é do dia de aniversário da sua conta")
								}
							}
							senao{
							escreva("\nVocê não possui saldo suficiente\n")
							}
							}
							senao{
								escreva("Opção inválida")
							}

					//funcao inteiro dia_mes_atual()
					//inteiro dia = Calendario.dia_mes_atual()
					//escreva("Data de hoje é : "+dia)

					/*escreva("\nDigite o aniversário da sua conta :\n")
					leia(diaAniversario)
					//limpa()
					se(movimentos >= 1){
						se(dia == diaAniversario){
						escreva("Seu saldo será atualizado")
						saldo = (saldo * 0.05)+saldo
						
					}
					senao{
						escreva("\nAinda não é a data de aniversário da sua conta")
					}
					}
					senao{
						escreva("\nSeu saldo já foi atualizado esse mês")
					}
					*/
					
					
					
					

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
				real valor
				inteiro contador = 0
				real saldoFinal, saldo1
				cadeia pedirTalao, voltar
		          limpa()		
				faca { 
						contador ++
						escreva (" Ai-taú \n")
     					escreva ("\n Dinheiro na mão é vendaval \n\n\n")	

     					escreva("\nBEM VINDO A CONTA CONTA CORRENTE\n")
     					escreva("Saldo atual: ",saldo)
     					escreva("\nQUANTIDADE DE: ",talao, " talões")

						escreva("\nMOVIMENTO - D-débito ou C-crédito : ")
						leia(movimento)
						escreva("Valor : ")
							leia(valor)

						se(valor > 0){
							se((movimento == "D" ou movimento == "d") e valor <= saldo e saldo > 0){
							saldo1 = saldo - valor
							saldo = saldo1
							
							}
							senao se(movimento == "C" ou movimento == "c"){
							saldo1 = saldo + valor
							saldo = saldo1
							}
							senao{
							escreva("\nVocê não possui saldo suficiente\n")
							}
							}
							senao{
								escreva("Opção inválida")
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
						 	se(numTaloes == 1 e saldo>= 30){
						 		saldo = saldo - 30
									 talao = talao - 1
						 	}
						 	senao se(numTaloes == 2 e saldo >= 60){
						 		saldo = saldo - 60
									 talao = talao - 2
						 	}
						 	senao se(numTaloes == 3 e saldo >=90){
						 		saldo = saldo - 90
								 talao = talao - 3
						 	}
						 	senao se(numTaloes > 3 ){
						 		escreva("\nVocê só pode solicitar 3 talôes\n")
						 		Util.aguarde(1000)
						 	}
						 	senao{
						 		escreva("\nVocê não tem saldo suficiente\n")
						 		Util.aguarde(1000)
						 	}
						 }
						pare	
					}
					//escreva("\nGostaria de voltar ao menu principal ?")
			        //leia(voltar)
						
				   // se(voltar =="S" ou voltar== "s"){
				   // limpa()
			        //inicio()
				  // } 
					
					//escreva("--------------------")
					limpa()
				
					
					}enquanto( contador < 10 ou sair == "s" ou sair == "S")
						limpa()
						escreva (" Ai-taú \n")
     					escreva ("\n Dinheiro na mão é vendaval \n\n\n")	
						escreva ("Seu saldo final é de: ",saldo, "\n")
						escreva("Você ainda tem: ",talao, " talões disponíveis.\n")
						escreva("Obrigado e volte sempre!!\n")
						escreva("Gostaria de voltar ao menu principal ?")
			    			leia(voltar)
						
						se(voltar =="S" ou voltar== "s"){
						limpa()
			     		inicio()
						}
			
			}
                  senao se(numSelecionado ==3){
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
					
		
				se((movimento == "D" ou movimento == "d") e valor > 0 e valor < saldo){
					
					saldo1 = saldo - valor
					saldo = saldo1
				}
				senao se ((movimento == "C" ou movimento == "c") e valor > 0) {
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
							real saldo, saldo1, valor, valorEmprestimo = 0, totEmprestimo = 10000
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
								escreva("Valor : ")
							leia(valor)

						se(valor > 0){
							se((movimento == "D" ou movimento == "d") e valor <= saldo e saldo > 0){
							saldo1 = saldo - valor
							saldo = saldo1
							
							}
							senao se(movimento == "C" ou movimento == "c"){
							saldo1 = saldo + valor
							saldo = saldo1
							}
							senao{
							escreva("\nVocê não possui saldo suficiente\n")
							}
							}
							senao{
								escreva("Opção inválida")
							}
						
								se(movimentos%2 != 0){
									escreva("\nGostariamos de lembrar que você é especial a nós,\n")
									escreva("por isso liberamos um empréstimo exlusivo para você no valor de R$10000")
									escreva("\ne você ainda tem ",totEmprestimo, " para pedir")
									escreva("\nTem interesse ? ")
								}
								senao{
									escreva("\nEmpréstimo de até R$10000,00 agora, !!")
									escreva("\ne você ainda tem ",totEmprestimo, " deseja ? ")
									
									
								}
								leia(interesse)
								//escreva(interesse)
								se(interesse =="S" ou interesse =="s"){
									escreva("Qual o valor do empréstimo ? ")
									leia(valorEmprestimo)
								}
								
						
								se(interesse == "S" ou interesse == "s" e totEmprestimo > 0 e valorEmprestimo <=totEmprestimo){
									
									saldo = saldo + valorEmprestimo
									totEmprestimo = totEmprestimo - valorEmprestimo
								}
								senao se(interesse == "S" ou interesse == "s" e totEmprestimo >= 0 ){
									escreva("\nSeu empréstimo ja foi todo solicitado ou,\n")
									escreva("o valor é acima do autorizado")
								}
								
								escreva("\nDeseja continuar ?\n")
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
          			senao se(numSelecionado == 5){
          				inteiro movimentos = 0
						real saldo, saldo1, valor, valorEmprestimo, totEmprestimo = 5000
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
						escreva("Valor : ")
							leia(valor)

						se(valor > 0){
							se((movimento == "D" ou movimento == "d") e valor <= saldo e saldo > 0){
							saldo1 = saldo - valor
							saldo = saldo1
							
							}
							senao se(movimento == "C" ou movimento == "c"){
							saldo1 = saldo + valor
							saldo = saldo1
							}
							senao{
							escreva("\nVocê não possui saldo suficiente\n")
							}
							}
							senao{
								escreva("Opção inválida")
							}
				
						se(movimentos%2 != 0){
							escreva("\nGostariamos de lembrar que confiamos nos seus estudos,\n")
							escreva("por isso liberamos um empréstimo exlusivo para você investir nele no valor de R$5000")
							escreva("\ne você ainda tem ",totEmprestimo, " para solicitar")
							escreva("\nTem interesse ? ")
						}
						senao{
							escreva("\nEmpréstimo de até R$5000,00 agora, queremos investir no seu conhecimento !!")
							escreva("\ne você ainda tem ",totEmprestimo, " quer solicitar ? ")
							
							
						}
						leia(interesse)
						//escreva(interesse)
						escreva("Qual o valor do empréstimo ? ")
							leia(valorEmprestimo)
				
						se(interesse == "S" ou interesse == "s" e totEmprestimo > 0 e valorEmprestimo <=totEmprestimo){
							saldo = saldo + valorEmprestimo
							totEmprestimo = totEmprestimo - valorEmprestimo
						}
						senao se(interesse == "S" ou interesse == "s" e totEmprestimo >= 0){
							escreva("\nSeu empréstimo ja foi todo solicitado ou,\n")
							escreva("o valor é acima do autorizado")
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
 * @POSICAO-CURSOR = 7123; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */