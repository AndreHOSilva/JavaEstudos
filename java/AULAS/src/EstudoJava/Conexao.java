package EstudoJava;

public class Conexao implements AutoCloseable {

    public Conexao() {
        System.out.println("Abrindo conexao");
        throw new IllegalStateException() ;
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }
    /*
    public void fecha() {
        System.out.println("Fechando conexao");
    }
    A partir de agora já não preciso desse método mais, pois o método close já ira fechar,
    isso é utilizado para instanciar um objeto dentro do try
    */
    @Override
    public void close() {
        System.out.println("Fechando conexao");
    }
}
