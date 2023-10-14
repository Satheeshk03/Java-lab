package controlStatlabs;

import java.util.Scanner;

public class SumofN {
public static void main(String args[])
{
	int i,n,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	 n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		sum+=i;
	}
	System.out.println(sum);
}
}
