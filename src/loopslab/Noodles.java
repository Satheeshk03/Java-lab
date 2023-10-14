package loopslab;
import java.util.Scanner;
public class Noodles {
public static void main(String args[]) {
	int X,Y;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of Stoves and number of minutes to cook:");
	X=sc.nextInt();
	Y=sc.nextInt();
	if (X>=1&&X<=1000&&Y>=1&&Y<=1000)
		System.out.println("The number of customers he can serve:"+(X*Y));
	else 
		System.out.println("Not possible");
	
	
}
}
