package hackerrank.algorithms;

import java.util.Scanner;

public class PalindromeIndex {

    static int palindromeIndex(String s){
        char[] str = s.toCharArray();
        int lengthStr = s.length();
        for (int i = 0; i < lengthStr; i += 2) {
            if (s.charAt(i) != s.charAt(lengthStr-i-1))
                if (s.charAt(i) == s.charAt(i+1)){
                return lengthStr-i-1;
                }
                else {
                return i;
                }
        }
        return -1;
        }//ter
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}
