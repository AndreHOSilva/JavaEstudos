package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        char[] chars = s.toCharArray();

        Arrays.sort(chars);

        String w = "";

        int length = chars.length;
        //System.out.println(length);
        for(int y=0; y<length;y++){
            String teste = String.valueOf(chars[y]);
            int a = s.indexOf(teste);

            //System.out.println(a);

            if(a+ k <=length){
                w = s.substring(a,a+ k);
            }
            if(y == 0) {
                smallest = w;
            }
        }
        largest = w ;

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        String s = "welcometojava";
        int k = 4;

        System.out.println(getSmallestAndLargest(s,k));
        //extracted(s, k);
    }
}
