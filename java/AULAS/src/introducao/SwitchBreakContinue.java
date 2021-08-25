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
            //o siwtch executa cases que estão presentes no bloco e sem o brake ele vai executar os abaixos tbm
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
                System.out.println("Sua situação já não tem solução");


        }

        System.out.println("Sua situação referente a nota foi de a : " + situacao);

        for (int x = 0; x < 10; x++) {
            System.out.println("Digite qual a nota :");
            a = leia.nextInt();

            switch (a) {
                //o siwtch executa cases que estão presentes no bloco e sem o brake ele vai executar os abaixos tbm
                case 10:
                case 9:
                case 8:
                    situacao = "A";
                    //enquanto isso continue volta para o início daquele escopo nesse caso retorna para o
                    //for e grava a última mensagem da situação.
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
                    System.out.println("Sua situação já não tem solução");


            }

            System.out.println("Sua situação referente a nota foi de x : " + situacao);
        }

    }
}
