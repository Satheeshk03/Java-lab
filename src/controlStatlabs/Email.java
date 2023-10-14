package controlStatlabs;
import java.util.Scanner;
public class Email {
public static void main(String args[]) {
	int U,N,Email;
	double r=Math.pow(10, 5);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The total Number of Users and Number of people who don't want remainders");
N=sc.nextInt();
U=sc.nextInt();
Email=N-U;
if((1<=U)&&(U<N)&&(N<=r))
System.out.println("The number of emails MOengage has to send email:"+Email);
else
	System.out.println("Error");
}
}
