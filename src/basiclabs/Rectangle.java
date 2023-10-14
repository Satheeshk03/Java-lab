package basiclabs;
import java.util.Scanner;
public class Rectangle {
public static void main(String args[]) {
	float l,w,perimeter;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length and width:");
	l=sc.nextInt();
	w=sc.nextInt();
	perimeter=l*w;
	System.out.println("The perimeter of rectangle is:"+perimeter);
}
}
