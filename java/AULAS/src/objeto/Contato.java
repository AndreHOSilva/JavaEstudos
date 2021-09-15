package objeto;

public class Contato {
    private String email;
    private String nome;
    private String contato2 ;

    public Contato(String email,String nome) {
        this.email = email;
        this.nome = nome ;
    }

    public Contato(String contato2) {
        this.contato2 = contato2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //esse método é utilizado para trabalhar o objeto na hora dele ser mostrado no console
    @Override
    public String toString() {
        return "Ola " + contato2 + " seu email é " + email + " e ja foi cadastrado com sucesso" ;
    }
}