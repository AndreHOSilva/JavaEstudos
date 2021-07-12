package lista5PooJava;

public class Cavalo extends Animal {
	
	private boolean relinchar ;
	private boolean galopar ;
	
	
	//contrutor
	
	public Cavalo(String nome, int idade, boolean pelos, boolean relinchar, boolean galopar) {
		super(nome, idade, pelos);
		this.relinchar = relinchar;
		this.galopar = galopar;
	}
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	
	//encapsulamento
	public boolean getRelinchar() {
		return relinchar;
	}


	public void setRelinchar(boolean relinchar) {
		this.relinchar = relinchar;
	}


	public boolean getGalopar() {
		return galopar;
	}


	public void setGalopar(boolean galopar) {
		this.galopar = galopar;
	}
	
	
	public void cavalos() {
		if(super.getPelos() && getGalopar() && getRelinchar() ) {
			 System.out.println("É CAVALO");
		}else {
			System.out.println("É OUTRO ANIMAL");
		}
	}
	public boolean EmitirSom(boolean som) {
		return super.getEmitirSom();
		
	}
	
	
	
	
	
}
