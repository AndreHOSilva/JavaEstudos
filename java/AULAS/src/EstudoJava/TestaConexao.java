package EstudoJava;

/**
 * Adiciona um coment�rio de cor diferente, para algo tipo documenta��o
 * @Author Andr�
 * @Version 0.1
 */
public class TestaConexao {
    public static void main(String[] args) {

        try(Conexao con = new Conexao()){
            con.leDados();

        }catch (IllegalStateException ex){
            System.out.println("Deu erro na conexao");
        }


     /*
        Conexao con = null;
        try {
            con = new Conexao();
            con.leDados();
        } catch(IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        } finally {
            con.fecha();
        }
        nesse c�digo temos o finally que sempre vai executar o que est� dentro dele
      */
    }
}
