package lista5PooJava;

public class Cachorro extends Animal {
	
	private boolean latir ;
	
   

	public Cachorro(String nome, int idade, boolean pelos, boolean latir) {
		super(nome, idade, pelos);
		this.latir = latir;
	}
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	

	public boolean getLatir(boolean latir) {
		return latir;
	}

	public void setLatir(boolean latir) {
		this.latir = latir;
	}
	
	public boolean EmitirSom(boolean som) {
		return super.getEmitirSom();
		
	}
	
	public void cachorros() {
		if(super.getPelos()&& getLatir(true)) {
			 System.out.println("É CACHORRO"); ;
		}else {
			System.out.println("É OUTRO ANIMAL");
		}
	}
	
	
	

}
