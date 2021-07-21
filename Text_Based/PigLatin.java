package Text_Based;

import java.util.Scanner;

public class PigLatin {

//TODO Solve the uppercase problem
//TODO: Consonant clusters (Wh, Gr, etc) should appear at the end
//TODO: ? ! etc punctuation appears before the last "ay" phrase

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a phrase to convert into pig latin: ");
        String[] phrase = scanner.nextLine().split(" ");
        String newPhrase = "";

        for (String element : phrase){
            char charAtStart = element.charAt(0);
            String pigPhrase = "";

            char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

            boolean isVowel = false;

            for (char chars : vowels) {
                if (chars == charAtStart) {
                    isVowel = true;
                }
            }

            if (isVowel == true) {
                pigPhrase = element + "yay";
            }

            if (isVowel == false) {
                for (int k = 1; k < element.length(); k++) {
                    
                    char addChar = element.charAt(k);
                    pigPhrase = pigPhrase + addChar; 
                }
                pigPhrase = pigPhrase + charAtStart + "ay";
            }
            newPhrase = newPhrase + pigPhrase;
        }
        System.out.print("Your Pig Latin phrase is: " + newPhrase);
        scanner.close();
    }
}

