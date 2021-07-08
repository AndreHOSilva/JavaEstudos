package obejeto;

public class Carro {
	
	public int tamanhoRodas ;
	public String modelo ;
	public double potenciaMotor ;
	public String tipoBanco ;
	public boolean ligado ;
	public int velocidade ;
	
	//def de atributo = algo que é tem ou esta
	
	public void ligarCarro() {
		ligado = true ;
		System.out.println("Carro ligando...");
	}
	public void desligarCarro() {
		if(velocidade == 0) {
			ligado = false ;
			System.out.println("Desligando carro...");
		}else {
			System.out.println("Desacelerar carro");
		}
		
	}
	public void acelerar() {
		velocidade++ ;
	}
	
}
