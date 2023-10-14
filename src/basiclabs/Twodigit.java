package basiclabs;
import java.util.Scanner;
public class Twodigit {
public static void main(String args[]) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	n=sc.nextInt();
	if (n>=10&&n<=99)
		System.out.println("yes");
	else
		System.out.println("NO");
	
}
}
