package lista5PooJava;

public class Animal {
	
	private String nome ;
	private int idade ;
	private boolean pelos;
	private boolean emitirSom ;
	
	public boolean getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(boolean emitirSom) {
		this.emitirSom = emitirSom;
	}

	//contrutor
	public Animal(String nome, int idade, boolean pelos) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.pelos = pelos;
		
	}
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.pelos = pelos;
		
	}
	
	//encapsulamento
	
	public String getNome(String nome) {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean getPelos() {
		return pelos;
	}

	public void setPelos(boolean pelos) {
		this.pelos = pelos;
	}
	
	

	
	

}