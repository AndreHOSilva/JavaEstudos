package objeto;

public class Patinete {
		public int rodas ;
		public boolean guidao ;
		public boolean eletrico ;
		public int velocidade ;
		public int freiar ;
		public boolean seguranca ;
		public String cor ;
		
		public void security(){
		     if(seguranca = true) {
		    	 System.out.println("Você pode começar a andar nele");
		     }else {
		    	 System.out.println("Você não pode andar nele agora");
		     }
		}
		public void acelerar() {
			velocidade++;
			System.out.println("Sua velocidade é "+velocidade);
		}
		public void patineteOk() {
			if(rodas ==2 && guidao == true ) {
				System.out.println("Seu patinete esta ok");
			}else {
				System.out.println("Leve para revisão");
			}
		}
		public void freio() {
			velocidade--;
			System.out.println("Sua velocidade é "+velocidade);
		}
		public void freiarTotal() {
			velocidade = 0;
			System.out.println("Sua velocidade agora é zero");
		}
}
