package objeto;

public class Funcionario {
	public double salario ;
	public boolean beneficios ;
	public int mesferias ;
	public boolean uniforme ;
	public int numeroCarteiraTrabalho ;
	public double fgts;
	
	public void ajustar() {
		if(salario > 2000) {
			System.out.println(fgts = fgts +(salario - 1800));
		}else {
			System.out.println(fgts = fgts+ ( salario - 800));
		}
	}
	public void leis() {
		if(beneficios = true ) {
			System.out.println("Você esta ok com a lei");
		}else {
			System.out.println("Passar no rh para regularização");
		}
	}
	public void iniciar() {
		if(uniforme = true && numeroCarteiraTrabalho != 0) {
			System.out.println("Você começa na próxima semana");
		}else {
			System.out.println("Sinto muito mas ainda não é a hora");
		}
	}
	public void chegando() {
		if(mesferias > 7) {
			System.out.println("Ferias esta proximo");
		}else {
			System.out.println("Ferias esta longe");
		}
	}
}
