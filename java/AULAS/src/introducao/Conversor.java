package introducao;

import java.util.Scanner;

public class Conversor {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int H = 0, M=0,S=0;
		String Periodo= " " ;
		
		for(int x=0 ;x<=5;x++) {
			H = leia.nextInt();
			M = leia.nextInt();
			S= leia.nextInt();
			Periodo = leia.next().toUpperCase() ;
			
			if(H != 12 && Periodo.equals("AM")) {
				System.out.println(H+" "+M+" "+S);
			}
			else if(H == 12 && Periodo.equals("AM")) {
				H =00;
				System.out.println(H+" "+M+" "+S);
			}
			else if(H == 12 && Periodo.equals("PM")) {
				
				
			}
			
		}
			
		}

}
