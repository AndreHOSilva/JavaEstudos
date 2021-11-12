package EstudoJava;

public class WrappersEstudo {
 //O int � um tipo primitivo em java assim como outros tamb�m s�o, j� no caso do integer ele � um objeto, e quando
    //eu passo uma lista s� � aceito objetos o que faz com que a convers�o seja feita de maneira direta

    public static void main(String[] args) {

        String numero = "12" ;

        int numeroConversao = Integer.parseInt(numero) ;

        int soma = numeroConversao + 4 ; //convertendo de string para int

        System.out.println(soma);

        //o que estou fazendo ai em baixo � a convers�o de primitivos para wrappers e vise versa
        Double dRef = Double.valueOf(5.6) ; //autoboxing, criei um wrapper
        System.out.println(dRef.doubleValue()); //unboxing, passei de wrapper para primitivo, ou seja de Double para double

        //o motivo de ainda existir os primitivos � porque ocupam menos espa�os na mem�ria.
    }
}
