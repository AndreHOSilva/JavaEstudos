package EstudoJava;

public class TryCatch {

        public static void main(String[] args) {
            System.out.println("Ini do main");
            metodo1();
            System.out.println("Fim do main");
        }
        //quando se fala de try catch devemos nos atentar que o erro dado � um objeto, portanto ele possui varios m�todos pr�prios
        private static void metodo1() {
            System.out.println("Ini do metodo1");
            try {
                metodo2();
                //caso eu quisesse usar dois m�todos catch ali em baixo teria que usar o compilador |(denominado piper)
                //uma barra �nica mesmo, pois n�o � o ou(||)
            }catch (ArithmeticException | NullPointerException ex){
               //System.out.println("Erro na divis�o");
               ex.getMessage();
               ex.printStackTrace();

               //esses dois que est�o ai em cima s�o bons exemplos de m�dos que posso utilizar no objeto de excess�o
            }

            System.out.println("Fim do metodo1");
        }

        private static void metodo2() {
            System.out.println("Ini do metodo2");
            ArithmeticException exception = new ArithmeticException();//aqui onde esta o construtor poderia lan�ar uma mensagem
            throw exception;
            //aqui al�m de criar uma excess�o tamb�m lan�o ela no c�digo
            //throw new ArithmeticException();
            //poderia ter lan�ado direto como esta � cima
        }
}
