package objeto;

public class Pessoa {
	
	//Objeto (class sem public static void main)
	
	//classe para pessoa e come�o a dar o atributo

    public String nome;
    public char genero; 
    public int anoNascimento; 

    public void mostrarIdade() { 
        //m�todo sem retorno para o programa
        System.out.println(2021-anoNascimento);

    }

     public int calculaIdade(int anoAtual) { 
         //m�todo com retorno de INTEIRO no programa
        return  anoAtual-anoNascimento;
    }

}