package JavaIo;

import java.io.*;

public class LendoUmTexto {
    public static void main(String[] args) throws IOException {
        //Fluxo de Entrada com Arquivo
        //Fluxo de Entrada com Arquivo
        InputStream fis = new FileInputStream("src/texto.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        br.readLine() ;

        while (br.readLine() != null){
            System.out.println(br.readLine());
            //br.readLine() ;
        }
        br.close();
    }

}
