package basiclabs;
import java.util.Scanner;
public class Threedigit {
public static void main(String args[])
{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	n=sc.nextInt();
	if(n>=100&&n<=999&&n%10==0)
		
	  System.out.println("Yes");
	else
		System.out.println("No");
	
	
}
}
