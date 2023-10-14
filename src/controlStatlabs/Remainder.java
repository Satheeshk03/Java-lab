package controlStatlabs;
import java.util.Scanner;
public class Remainder {
public  static void main(String args[]) {
int n,m,remainder;
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number:");
n=sc.nextInt();
System.out.print("Enter second number:");
m=sc.nextInt();
remainder=n%m;
if(n>m)
	System.out.println("Remainder:"+remainder);
else
	System.out.println("-1");

	
	
	
}
}
