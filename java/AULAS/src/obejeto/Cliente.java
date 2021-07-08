package obejeto;

public class Cliente {
	
	public String nome;
	public int idade ;
	public String formaPagamento ;
	public char genero ;
	public double totalCompra ;
	public boolean cartaoLoja ;
	
	
	//construtor
	
	//
	public double acrescimo(double d) {
		formaPagamento = "C" ;
		
		return totalCompra +d ;
		
	}
	public double desconto(double diminuicao) {
		formaPagamento = "D";
		return totalCompra -diminuicao ;
	}
	public void terCartao() {
		if(cartaoLoja == true) {
			System.out.println("Parabens voce tem nosso cartão");
		}else if(idade >= 18 && cartaoLoja== false) {
			System.out.println("Peça nosso cartão agora");
		}
	}
}
