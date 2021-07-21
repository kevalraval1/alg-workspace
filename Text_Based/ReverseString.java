package Text_Based;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a string to reverse: ");
        String reverseThis = scanner.nextLine();
        String reversed = "";

        for (int i = (reverseThis.length()-1); i >= 0; i--) {
            char charAtPos = reverseThis.charAt(i);
            reversed = reversed + charAtPos;
        }

        System.out.print("Reversed string is: " + reversed);
        scanner.close();
    }
}