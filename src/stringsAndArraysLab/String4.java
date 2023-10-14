package stringsAndArraysLab;
import java.util.Scanner;
import java.util.StringTokenizer;
public class String4 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine().toLowerCase();
	        scanner.close();

	        StringBuilder vowels = new StringBuilder();
	        StringBuilder consonants = new StringBuilder();

	        for (int i = 0; i < inputString.length(); i++) {
	            char ch = inputString.charAt(i);
	            // Check if the character is a letter
	            if (Character.isLetter(ch)) {
	                // Check if the character is a vowel (you can add more vowels if needed)
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowels.append(ch);
	                } else {
	                    consonants.append(ch);
	                }
	            }
	        }

	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	    }
	}
