package loja;

import java.util.Scanner;

public class LojaEmJava {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in) ;
		
		//String produtos[] = {"a","b","c","d","e","f","g","h","i","j"} ;
		//double precos[] = {10,11,12,13,14,15,16,17,18,19,20} ;
		//int codigo[] = {1,2,3,4,5,6,7,8,9,10} ;
		//int estoque[] = {10,10,10,10,10,10,10,10,10,10} ;
		String nome , continuar ;
		int carrinho[] = new int[10];
		
		String produtos[] = {"a","b","c","d","e","f","g","h","i","j"} ;
		int precos[] = {10,11,12,13,14,15,16,17,18,19,20} ;
		int codigo[] = {1,2,3,4,5,6,7,8,9,10} ;
		int estoque[] = {10,10,10,10,10,10,10,10,10,10} ;
		
		
		//System.out.println("CODIGO  PRODUTOS  PRECOS ESTOQUE");
		for(int x=0;x<10;x++) {
			
			if(x==9) {
				System.out.printf("G3-%d  %s  %d  %d\n",codigo[x],produtos[x].toUpperCase(),precos[x],estoque[x]);
			}
			else {
				System.out.printf("G3-0%d  %s  %d  %d\n",codigo[x],produtos[x],precos[x],estoque[x]);
			}
			System.out.println("Qual o número do código produto desejado ?");
			
			
		System.out.println("Qual o código do produto ?");
		
		
		
		}
		/*for(int x=0;x<10;x++) {
			System.out.println("Qual o código do produto ?");
			carrinho[x]=leia.nextInt() ;
			
		*/}
		
		
		

	}

}
