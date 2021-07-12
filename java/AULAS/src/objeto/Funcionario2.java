package objeto;

public class Funcionario2 {
	
	
	//estudo de polimorfismo e overrid
	
	private String matricula ;  //ao inves de usar private posso usar o protect,pois assim as classes filhas podem usar as da classe m�e
	private int horasTrabalhadas ; //override utilizo para trocar algo em um m�todo vindo de outra classe 
	private double valorHora ;  //outra coisa para ser utilizada � o m�todo implements que faz uma classe herdar os m�todos de oura classe, 
								//mas isso n�o faz da classe implements como sendo filha da classe herdada.
	//construtor
	public Funcionario2(String matricula, int horasTrabalhadas, double valorHora) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	
	public Funcionario2(String matricula) {
		super();
		this.matricula = matricula;
	}


	//encapsulamento

	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public double getValorHora() {
		return valorHora;
	}


	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	//metodo
	
	public double salario() {
		return  this.horasTrabalhadas * valorHora ;
	}
	
	
	
}
