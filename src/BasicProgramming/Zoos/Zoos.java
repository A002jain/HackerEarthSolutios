package BasicProgramming.Zoos;

import java.util.Scanner;

public class Zoos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valid ="No";
        String inputString=scanner.next();
        int inputLength =inputString.length();
        if(inputString.matches("z+o+") && inputLength < 21) {
            int temp = inputString.indexOf("o");
            if( temp * 2  == (inputLength - temp)){
                valid = "Yes";
            }
        }
        System.out.println(valid);
    }
}