package basiclabs;
import java.util.Scanner;

public class Reverse{
    public static int reverseNumber(int number) {
        int rev = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            rev = (rev * 10) + lastDigit;
            number /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int reversedNumber = reverseNumber(num);
        System.out.println("The reversed number is: " + reversedNumber);

        scanner.close();
    }
}

	
