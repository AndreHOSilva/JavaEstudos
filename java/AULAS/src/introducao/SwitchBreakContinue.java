package introducao;

import java.util.Scanner;

public class SwitchBreakContinue {
    public static void main(String[] args) {
        int a;
        String situacao = "";
        java.util.Scanner leia = new Scanner(System.in);


        System.out.println("Digite qual a nota :");
        a = leia.nextInt();

        switch (a) {
            //o siwtch executa cases que est�o presentes no bloco e sem o brake ele vai executar os abaixos tbm
            case 10:
            case 9:
            case 8:
                situacao = "A";
                break;
            case 7:
            case 6:
            case 5:
                situacao = "B";
                break;
            case 4:
            case 3:
            case 2:
                situacao = "C";
                break;
            default:
                System.out.println("Sua situa��o j� n�o tem solu��o");


        }

        System.out.println("Sua situa��o referente a nota foi de a : " + situacao);

        for (int x = 0; x < 10; x++) {
            System.out.println("Digite qual a nota :");
            a = leia.nextInt();

            switch (a) {
                //o siwtch executa cases que est�o presentes no bloco e sem o brake ele vai executar os abaixos tbm
                case 10:
                case 9:
                case 8:
                    situacao = "A";
                    //enquanto isso continue volta para o in�cio daquele escopo nesse caso retorna para o
                    //for e grava a �ltima mensagem da situa��o.
                    continue;
                case 7:
                case 6:
                case 5:
                    situacao = "B";
                    break;
                case 4:
                case 3:
                case 2:
                    situacao = "C";
                    break;
                default:
                    System.out.println("Sua situa��o j� n�o tem solu��o");


            }

            System.out.println("Sua situa��o referente a nota foi de x : " + situacao);
        }

    }
}
