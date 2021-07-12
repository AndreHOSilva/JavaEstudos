package objeto;

public class Pessoa {
	
	//Objeto (class sem public static void main)
	
	//classe para pessoa e começo a dar o atributo

    public String nome;
    public char genero; 
    public int anoNascimento; 

    public void mostrarIdade() { 
        //método sem retorno para o programa
        System.out.println(2021-anoNascimento);

    }

     public int calculaIdade(int anoAtual) { 
         //método com retorno de INTEIRO no programa
        return  anoAtual-anoNascimento;
    }

}