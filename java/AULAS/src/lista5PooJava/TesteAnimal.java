package lista5PooJava;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		Cavalo horse = new Cavalo("plinio",15) ;
		Cachorro dog = new Cachorro("madonna",8) ;
		
		horse.EmitirSom(true);
		//horse.setPelos(true);
		horse.setGalopar(true);
		horse.setPelos(true);;
		horse.setRelinchar(true);
		
		dog.EmitirSom(true);
		dog.setLatir(true);
		dog.setPelos(true);
		dog.cachorros();
		
		
		
		
		
		
		horse.cavalos();
	}

}
