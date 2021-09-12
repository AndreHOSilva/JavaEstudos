package CursoUdemy;

import java.util.Scanner;

public class LeiaString {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in) ;

        String palavra ;

        System.out.println("Digite a palavra desejada");
        palavra = leia.nextLine() ;


        char letras[] = palavra.toCharArray() ;

        for(int x = 0 ; x < letras.length; x++){
            System.out.println(letras[x]);
        }
        System.out.println("Teste");


    }
}
