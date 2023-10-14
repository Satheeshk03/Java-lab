package loopslab;
import java.util.Scanner;
public class Bread {
public static void main(String args[]) {
	int T=1,N=1,M=1,K=1,i=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number of test cases:");
	T=sc.nextInt();
	
	if(T>0&&T<=1000)
		for(i=1;i<=T;i++)
	{
		System.out.println("Enter the number of Loaves of bread:");
	    N=sc.nextInt();
		System.out.println("Enter the number of days for its expiry:");
		M=sc.nextInt();
		System.out.println("Enter the number of loaves of bread can be eaten per day:");
	    K=sc.nextInt();
	    
	    if(N<=M*K&&N>=1&&N<=100&&M>=1&&M<=100&&K>=1&&K<=100)
	    		System.out.println("Yes");
			else 
				System.out.println("No");
	
	}
	    
	    else
	    	System.out.println("Invalid");
	
	
		
}}
		
	
	
	

	

