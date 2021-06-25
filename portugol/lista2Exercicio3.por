programa
{
	inclua biblioteca Matematica --> Mat
	funcao inicio()
	{
		real num1,num2,num3,num4,p1,p2,p3,p4

		escreva("Digite o primeiro  numero : ")
		leia(num1)
		
		escreva("Digite o segundo numero : ")
		leia(num2)

		escreva("Digite o terceiro numero : ")
		leia(num3)

		escreva("Digite o quarto numero : ")
		leia(num4)

		p1 = Mat.potencia(num1, 2)
		p2 = Mat.potencia(num2, 2)
		p3 = Mat.potencia(num3, 2)
		p4 = Mat.potencia(num4, 2)

		se(p3 >= 1000){
          limpa()
		escreva("Valor é " +p3)
	}
	    senao{
	    	  escreva("Os quadrados dos números são os seguintes : \n" +p1+ "\n" +p2+ "\n" +p3+ "\n" +p4)
	    }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */