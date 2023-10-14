package controlStatlabs;
import java.util.*;
public class Prime
{
	public static void main(String args[]) {
		int n,number;
		Scanner sc=new Scanner(System.in);
		Num c=new Num();
		System.out.println("Enter a positive interger: ");
		n=sc.nextInt();
		System.out.println(c.check(n));
		
	}
		 
	}

class Num {
    boolean check(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }


}
