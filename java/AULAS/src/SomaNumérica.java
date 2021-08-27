import java.util.Scanner;

public class SomaNumérica {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in) ;

        int numero = 0, soma = 0;

        while (numero >= 0){

            numero = leia.nextInt();
            if(numero >=0){
                soma+=numero ;
            }

        }

        System.out.println(soma);
    }
}
