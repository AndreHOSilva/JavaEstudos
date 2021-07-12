package entidades;

public class ContaPoupanca extends Conta {
	
	private final double correcao = 0.05 ;
	private int diaAniversario ;
	
	//construtor
	public ContaPoupanca(String nome, int conta) {
		super(nome, conta);
	}
	
	
	//encapsulamento
	
	public double getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	public void corrigir() {
		if(diaAniversario == 10) {
			//super.getsaldo();
			//super.setsaldo((this.getsaldo())+(this.getsaldo()*correcao)) ;
			super.setsaldo((super.getsaldo()*correcao)+(super.getsaldo()));
			super.menu();
			System.out.println("Por ser aniversario da sua conta seu saldo ser� atualizado");
			System.out.println("Com um juros exclusivo de 5%");
			super.extrato();
		}
		else {
			super.menu();
			System.out.println("Ainda n�o � o dia do anivers�rio da sua conta");
		}
		
		
		
		
		
	}
	
	
	
	

}