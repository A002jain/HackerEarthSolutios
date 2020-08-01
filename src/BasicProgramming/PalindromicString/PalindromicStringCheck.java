package BasicProgramming.PalindromicString;

import java.util.Scanner;

public class PalindromicStringCheck {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        String flag = "Yes";
        String inputString = scan.next();
        int stringLength = inputString.length();
        int i = 0 , j = stringLength-1 ;
        while(i != j && i < stringLength/2){
            if(inputString.charAt(i) != inputString.charAt(j)){
                flag = "No";
                break;
            }
            i++;
            j--;
        }
        System.out.println(flag);

    }
}
