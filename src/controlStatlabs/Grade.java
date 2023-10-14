package controlStatlabs;
import java.util.Scanner;
public class Grade {
public static void main(String args[]) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the marks:");
	n=sc.nextInt();
	if(n>=91&&n<=100) 
		System.out.println("A+");
	else if(n>=81&&n<=90)
	System.out.println("A");
	else if(n>=71&&n<=80)
	System.out.println("B+");
	else if(n>=61&&n<=70)
	System.out.println("B");
	else if(n>=51&&n<=60)
	System.out.println("C+");
	else if(n>=41&&n<=50)
		System.out.println("C");
	else if(n>=0&&n<=40)
		System.out.println("Fail");
	else 
		System.out.println("Invalid");
        sc.close();	
}
}
