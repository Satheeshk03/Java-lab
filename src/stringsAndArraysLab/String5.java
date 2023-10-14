package stringsAndArraysLab;
import java.util.Scanner;

public class String5 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine().toLowerCase();
	        scanner.close();

	        int vc = 0;
	        int cc = 0;

	        for (int i = 0; i < inputString.length(); i++) {
	            char ch = inputString.charAt(i);
	            // Check if the character is a letter
	            if (Character.isLetter(ch)) {
	                // Check if the character is a vowel (you can add more vowels if needed)
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vc++;
	                } else {
	                    cc++;
	                }
	            }
	        }

	        System.out.println("Number of vowels: " + vc);
	        System.out.println("Number of consonants: " + cc);
	    }
	}

