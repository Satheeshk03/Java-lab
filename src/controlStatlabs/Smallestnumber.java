package controlStatlabs;
import java.util.Scanner;
public class Smallestnumber {
	public static void main(String args[]) {
		int j,k,l,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Four positive numbers:");
		j=sc.nextInt();
        k=sc.nextInt();
        l=sc.nextInt();
        m=sc.nextInt();
        System.out.println("The smallest number is");
        if(j<k&&j<l&&j<m)
        	System.out.println(j);
        else if(k<j&&k<l&&k<m)
        	System.out.println(k);
        else if(l<j&&l<k&&l<m)
        	System.out.println(l);
        else
        	System.out.println(m);
        
	
	}

}
