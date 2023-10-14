package basiclabs;
import java.util.Scanner;

public class Sac {
public static void main(String args[])
{
	double r,h,pi=3.142,Sarea;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius and height:");
	r=sc.nextInt();
	h=sc.nextInt();
	Sarea=2 * pi*r*(r+h);
	System.out.println("The surface area of cylinder:"+Sarea);
	
}
}
