programa
{
      /*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
       *coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
	   a) média do salário da população; 
	   b) média do número de filhos; 
	   c) maior salário; 
	   d) percentual de pessoas com salário até R$100,00. 
	*/
	
	funcao inicio()
	{
			inteiro Nfilhos = 0
			real salario
			real somaSalario = 0 ,maiorSalario = 0
			real contador = 0 , percentual = 0
			real somaFilhos = 0
			
		para(inteiro x=1;x<=20;x++){

			escreva("Digite numero de filhos ")
			leia(Nfilhos)

			escreva("Digite o seu sálario ")
			leia(salario)

			contador ++            //uso para um contador de vezes executadando o programa
			somaSalario += salario //uso isso para somar uma variável
			somaFilhos += Nfilhos

			se(salario > maiorSalario){
					maiorSalario = salario //uso para gravar qual número mais alto
			}
			se(salario < 100 ){
				percentual++
				
			}
			
		}
		escreva("Media do salario sera de " +(somaSalario /contador))
		escreva("\nMedia do numero de filhos sera de : " +(somaFilhos /contador))
		escreva("\nO maior sálario é : " +maiorSalario+ "\n")
		escreva("O percentual será de " +((percentual/contador) * 100)+ "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 537; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */