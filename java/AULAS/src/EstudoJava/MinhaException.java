package EstudoJava;

public class MinhaException {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }
    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao{
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao("deu muito errado");
        //System.out.println("Fim do metodo2");
        //aqui estou fazendo meu pr�prio erro
    }
}
