package introducao;

import objeto.Contato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in) ;
        Adicionar() ;

        //System.out.println();




    }
    public static void Adicionar() {
        Scanner leia = new Scanner(System.in) ;

        List<Contato> agenda = new ArrayList<>();
        String y , x ;

        System.out.println("Qual o email e nome ?Digite nessa ordem");
        y = leia.nextLine() ;

        Contato contato = new Contato(y) ;
        //Contato contato2 = new Contato("mama","Jão") ;
        agenda.add(contato);
        //agenda.add(contato2) ;

        //System.out.println(contato);
        for (Object item : agenda) {
            System.out.println("Item :"+item);
        }
    }
}
