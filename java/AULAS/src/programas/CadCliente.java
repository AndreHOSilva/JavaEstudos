package programas;

import java.util.Scanner;

import obejeto.Cliente;

public class CadCliente {
	//1) Crie uma classe cliente e apresente os atributos e métodos referentes
	//esta classe, em seguida crie um objeto cliente, defina as instancias deste
	//objeto e apresente as informações deste objeto no console.

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in) ;
		
		Cliente cliente1 = new Cliente() ;
		
		Cliente cliente2 = new Cliente() ;
		
		
		
		System.out.println("Digite sua nome");
		cliente1.nome = leia.next();
		
		System.out.println("Digite sua idade :");
		cliente1.idade = leia.nextInt() ;
		
		System.out.println("Qual o seu genero ;");
		cliente1.genero=leia.next().toUpperCase().charAt(0) ;
		
		System.out.println("Qual a forma de pagamento ?\n");
		cliente1.formaPagamento = leia.next().toUpperCase();
		
		System.out.println("Tem cartão da loja ?");
		cliente1.cartaoLoja= leia.hasNext() ;
		
		
		cliente1.totalCompra = 500 ;
		//cliente1.acrescimo(0.05) ;
		
		System.out.println(cliente1.acrescimo(0.05));
		
		
		
		
	}

}
