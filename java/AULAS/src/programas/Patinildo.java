package programas;

import java.util.Scanner;

import obejeto.Patinete;

public class Patinildo {
	//Crie uma classe patinete e apresente os atributos e métodos referentes
	//esta classe, em seguida crie um objeto patinete, defina as instancias deste
	//objeto e apresente as informações deste objeto no console.

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Patinete patinete1 = new Patinete();
		
		
		 //int rodas ,velocidade,freiar ;
		// boolean eletrico,seguranca,guidao ;
		// String cor ;
		 
		 patinete1.cor="roxo";
		 patinete1.eletrico= false;
		 patinete1.guidao = true;
		 patinete1.rodas = 2;
		 patinete1.seguranca=true;
		 patinete1.security();
		 patinete1.patineteOk();
		 patinete1.velocidade=18 ;
		 patinete1.acelerar();
		 patinete1.acelerar();
		 patinete1.freio();
		 patinete1.freiarTotal();
	
	}

}
