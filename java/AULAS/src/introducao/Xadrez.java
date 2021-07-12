package introducao;

import java.util.Scanner;

public class Xadrez {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int L;
		int C ;
		
		for(int x=0;x<=10;x++) {
			L= leia.nextInt();
			C=leia.nextInt();
			
			if(L%2 == 0) {
				if(C%2 != 0) {
					System.out.println("0");
				}else {
					System.out.println("1");
				}
			}else {
				if(C%2 != 0) {
					System.out.println("1");
				}
				else {
					System.out.println("0");
				}
				
				
			}
			
		}
		

	}

}
