package objeto;

public class Terceiro extends Funcionario2 {
	
	private double adicional ;
	
	
	//construtor
	public Terceiro(String matricula, double adicional) {
		super(matricula);
		this.adicional = adicional;
	}
	
	
	//encapsulamento
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	//polimorfismo
	@Override
	public double salario() {
		return  (this.getHorasTrabalhadas() * getValorHora())+ adicional ;
	}
	
	

}
