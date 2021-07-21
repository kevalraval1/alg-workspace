package Text_Based;

import java.util.Scanner;

public class CountVowels {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your phrase: ");
        String phrase = scanner.nextLine();
        int numberA, numberE, numberI, numberO, numberU;
        numberA = numberE = numberI = numberO = numberU = 0; 

        for (int i = 0; i < phrase.length(); i++) {
            char charAtPos = phrase.charAt(i);
            if (charAtPos == 'A' || charAtPos == 'a') { 
                numberA ++;
            }
            if (charAtPos == 'E' || charAtPos == 'e') { 
                numberE ++;
            }
            if (charAtPos == 'I' || charAtPos == 'i') { 
                numberI ++;
            }
            if (charAtPos == 'O' || charAtPos == 'o') { 
                numberO ++;
            }
            if (charAtPos == 'U' || charAtPos == 'u') { 
                numberU ++;
            }
        }
        
        System.out.printf("\nThere are %d Letter A's\nThere are %d Letter E's\nThere are %d Letter I's\nThere are %d Letter O's\nThere are %d Letter U's\n", numberA, numberE, numberI, numberO, numberU);
        scanner.close();
    }
}
