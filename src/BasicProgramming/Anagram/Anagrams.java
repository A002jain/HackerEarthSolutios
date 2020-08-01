package BasicProgramming.Anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int[] result = new int[testCases];
        int counter =0 ;
        for(int i = 0 ;  i < testCases ; i++) {
            String inputA = scanner.next();
            String inputB = scanner.next();
            for(int j = 0 ; j < inputA.length() ; j++){
                for(int k = 0 ; k < inputB.length() ; k++){
                    if(inputA.charAt(j) == inputB.charAt(k)){
                        counter+=2;
                        break;
                    }
                }
            }
            result[i] =(inputA.length() + inputB.length() -counter);
        }
        for(int i = 0 ;  i < testCases ; i++) {
            System.out.println(result[i]);
        }
    }
}
