package EstudoJava;

public class WrappersEstudo {
 //O int é um tipo primitivo em java assim como outros também são, já no caso do integer ele é um objeto, e quando
    //eu passo uma lista só é aceito objetos o que faz com que a conversão seja feita de maneira direta

    public static void main(String[] args) {

        String numero = "12" ;

        int numeroConversao = Integer.parseInt(numero) ;

        int soma = numeroConversao + 4 ; //convertendo de string para int

        System.out.println(soma);

        //o que estou fazendo ai em baixo é a conversão de primitivos para wrappers e vise versa
        Double dRef = Double.valueOf(5.6) ; //autoboxing, criei um wrapper
        System.out.println(dRef.doubleValue()); //unboxing, passei de wrapper para primitivo, ou seja de Double para double

        //o motivo de ainda existir os primitivos é porque ocupam menos espaços na memória.
    }
}
