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
            case 10 : case 9 : case 8 :
                situacao = true ;
            case 7 : case 6 : case 5 :
                situacao = false ;
            case 4 : case 3 : case 2 :
                situacao = false ;
            default:
                System.out.println("Sua situação já não tem solução");


        }

        System.out.println(situacao);

        if(situacao = true){
            for(int x = 0; x < a ; x++){
                funcionario.salario = 1000 ;

            }

        }
    }
}
