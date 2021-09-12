package EstudoJava;

public class Debug {

    public static void main(String[] args) {
        System.out.println("ini do main");
        metodo1();

    }

    private static void metodo1(){
        System.out.println("inic metodo 1");
        metodo2();
        System.out.println("Fim metodo 1");

    }
    private static void metodo2(){
        System.out.println("inic metod 2");
        for (int x=0; x <=4 ; x++){
            System.out.println(x);
        }
        System.out.println("Fim método 2");
    }
}
