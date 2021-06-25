programa
{
    inclua biblioteca Matematica --> Mat

    funcao inicio()
    {
        real d,x1,x2,y1,y2

        escreva("Qual o valor de X1?\n") 
        leia(x1)
        escreva("Digite o valor de X2?\n") 
        leia(x2)
        escreva("Qual o valor de Y1\n") 
        leia(y1)
        escreva("Qual o valor de Y2?\n") 
        leia(y2)
       
        d = Mat.raiz((Mat.potencia((x2-x1),2))+(Mat.potencia((y2-y1),2)),2)

        
        escreva("A distancia D é igual a "+Mat.arredondar(d, 2))

    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 438; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */