package introducao;

import objeto.Funcionario;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int a ;
        boolean situacao = false ;
        java.util.Scanner leia = new Scanner(System.in) ;
        Funcionario funcionario = new Funcionario();



        System.out.println("Digite qual a nota :");
        a = leia.nextInt();

        switch (a){
            //o siwtch executa cases que est�o presentes no bloco e sem o brake ele vai executar os abaixos tbm
            case 10 : case 9 : case 8 :
                situacao = true ;
                System.out.println("A");
                break;
            case 7 : case 6 : case 5 :
                situacao = false ;
                System.out.println("B");
                break;
            case 4 : case 3 : case 2 :
                situacao = false ;
                System.out.println("C");
                break;
            default:
                System.out.println("Sua situa��o j� n�o tem solu��o");


        }

        System.out.println(situacao);

        if(situacao = true){
            for(int x = 0; x < a ; x++){
                funcionario.salario = 1000 ;

            }

        }
    }
}
