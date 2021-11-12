package JavaIo;

import java.io.*;

public class LendoArquivoEEscrevendo {
    public static void main(String[] args) throws IOException{
        InputStream fis = new FileInputStream("src/texto.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("lorem8.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String txt = br.readLine() ;
        while (txt != null){
            bw.write(txt);
            bw.newLine();
            txt = br.readLine();

        }
        br.close();
        bw.close();
    }
}
