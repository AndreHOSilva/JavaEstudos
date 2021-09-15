package EstudoJava;


import java.util.Locale;
import java.util.Scanner;

public class EstusoString {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in) ;

        String x ;
        //tive que instanciar outra String para conseguir dar o replace, pois depois de declarado
        //jamais consigo modificar uma String .
        String nome = "Alura" ;


        String outra = nome.replace("r","R") ;

        char c = nome.charAt(3); //char i
        System.out.println(c);

        int pos = nome.indexOf("a");
        System.out.println(pos);

        String sub = nome.substring(1);
        System.out.println(sub);


        System.out.println("Digite seu nome");
        x = leia.next().toUpperCase(Locale.ROOT);

        System.out.println(x);
        System.out.println(nome);
        System.out.println(outra);
    }
}
