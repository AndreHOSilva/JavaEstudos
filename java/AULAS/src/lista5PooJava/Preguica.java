package lista5PooJava;

public class Preguica extends Animal {
	
	public boolean subirArvore ;

	public Preguica(String nome, int idade, boolean pelos, boolean subirArvore) {
		super(nome, idade, pelos);
		this.subirArvore = subirArvore;
	}

	public boolean getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(boolean subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	public void preguica() {
		if(super.getPelos() && getSubirArvore() ) {
			 System.out.println("� Preguica"); ;
		}else {
			System.out.println("� OUTRO ANIMAL");
		}
	}
	public boolean EmitirSom(boolean som) {
		return super.getEmitirSom();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
