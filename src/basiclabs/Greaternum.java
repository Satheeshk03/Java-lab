package basiclabs;
import java.util.Scanner;
public class Greaternum {
	public static void main(String args[]) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		a=sc.nextInt();
	    b=sc.nextInt();
	    c=sc.nextInt();
	    System.out.println("The greatest number is:");
	    if(a>=b&&a>=c)
	    	System.out.println(a);
	    else if(b>=c&&b>=a)
	    	System.out.println(b);
	    else
	    	System.out.println(c);
	    
	    	
	    	
	}

}
