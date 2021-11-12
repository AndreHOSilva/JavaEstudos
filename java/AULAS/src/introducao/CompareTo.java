package introducao;

import objeto.Conta;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompareTo {
    public static void main(String[] args) {

         Conta c1 = new Conta(126,"Dandara") ;
         c1.setSaldo(250);

         Conta c2 = new Conta(250,"Zna") ;

         Conta c3 = new Conta(127,"Babu") ;


        List<Conta> Contovisk = new ArrayList<>();

        Contovisk.add(c1) ;
        Contovisk.add(c2) ;
        Contovisk.add(c3) ;


        /*
        //comparador.compare(c1,c2) ;
        Contovisk.sort(new Comparador<Conta>(){
            @Override
            public int compare(Conta o1, Conta o2) {
                String nome1 = o1.getNome() ;
                String nome2 = o2.getNome() ;
                return nome1.compareTo(nome2);
            }


        });
        A baixo temos o mesmo código de cima, mas com a utilização do lambda
        */
        //primeiro sort ordena pelo nome, enquanto o outro ordena pelo número
        Contovisk.sort((Conta o1, Conta o2) -> {
                String nome1 = o1.getNome() ;
                String nome2 = o2.getNome() ;
                return nome1.compareTo(nome2);
            }
        );


        //podeira implementar direto na classe Conta, mas para isso teria de transformar em abstrata e implements Comparable
        Comparator<Conta> comp = ( o1,o2) -> Integer.compare(o1.getNumero(), o2.getNumero());

        Contovisk.sort(comp);
        System.out.println(Contovisk+ "\n");
    }

}


