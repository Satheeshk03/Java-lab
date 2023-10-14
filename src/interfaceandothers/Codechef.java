package interfaceandothers;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
       int i,T,N=0,M;
	    
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number of test cases:");
	  T=sc.nextInt();
	 if(T>=0&&T<=100)
	{	 for(i=1;i<=T;i++)
		 {System.out.println("Enter how many kgs of pulp:");
		 N=sc.nextInt();	
		 
	 if(N>=0&&N<=100)
		 
	 {
		 System.out.println("The number of notebooks can be made:"+(M=N*10));
	}
	 else
	 {
	 System.out.println("Invalid");
	}}
	 }
	else
	{System.out.println("Invalid");}
}
}



