package introducao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdininhacao {
    static Random gerador = new Random();
    public static void main(String[] args) {
       //double dado[] = new double[10] ;
        Scanner leia = new Scanner(System.in)  ;
        int y ;
        int z;
        z = gerador.nextInt(100) ;
        System.out.println(z);
        for(int x = 10;x >=0;x--){

            System.out.println("Bem vindo ao jogo da adivinha��o");
            System.out.println("Voc� tem "+ x +" tentativas");
            System.out.println("Quanto voc� acha ser seu n�mero ?");
            y = leia.nextInt();

            if (z < y){
                System.out.println("Seu n�mero � menor");
            }
            else if(z > y){
                System.out.println("Seu n�mero � maior");
            }
            else{
                System.out.println("Parabens voc� acertou");
                break ;
            }

        }

    }
}
