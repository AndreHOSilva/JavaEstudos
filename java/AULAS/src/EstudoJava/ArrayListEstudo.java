package EstudoJava;

import objeto.Conta;

import java.util.ArrayList;

public class ArrayListEstudo {

            public static void main(String[] args) {

                ArrayList lista = new ArrayList();

                Conta cc = new Conta(22, 11);
                lista.add(cc);

                Conta cc2 = new Conta(22, 11);
                lista.add(cc2);

                Object teste = cc ;

                System.out.println(teste.equals(cc2));
                /*
                System.out.println("Tamanho: " + lista.size());

                Conta ref = (Conta) lista.get(0);
                System.out.println(ref.getNumero());

                lista.remove(0);
                System.out.println("Tamanho: " + lista.size());

                Conta cc3 = new Conta(33, 311);
                lista.add(cc3);

                Conta cc4 = new Conta(33, 322);
                lista.add(cc4);

                for(int i = 0; i < lista.size(); i++) {
                    Object oRef = lista.get(i);
                    System.out.println(oRef);
                }

                System.out.println("----------");

                for(Object oRef : lista) {
                    System.out.println(oRef);
                }
                */
            }
    }
