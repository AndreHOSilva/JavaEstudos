package EstudoJava;

public class TryCatch {

        public static void main(String[] args) {
            System.out.println("Ini do main");
            metodo1();
            System.out.println("Fim do main");
        }
        //quando se fala de try catch devemos nos atentar que o erro dado é um objeto, portanto ele possui varios métodos próprios
        private static void metodo1() {
            System.out.println("Ini do metodo1");
            try {
                metodo2();
                //caso eu quisesse usar dois métodos catch ali em baixo teria que usar o compilador |(denominado piper)
                //uma barra única mesmo, pois não é o ou(||)
            }catch (ArithmeticException | NullPointerException ex){
               //System.out.println("Erro na divisão");
               ex.getMessage();
               ex.printStackTrace();

               //esses dois que estão ai em cima são bons exemplos de módos que posso utilizar no objeto de excessão
            }

            System.out.println("Fim do metodo1");
        }

        private static void metodo2() {
            System.out.println("Ini do metodo2");
            ArithmeticException exception = new ArithmeticException();//aqui onde esta o construtor poderia lançar uma mensagem
            throw exception;
            //aqui além de criar uma excessão também lanço ela no código
            //throw new ArithmeticException();
            //poderia ter lançado direto como esta á cima
        }
}
