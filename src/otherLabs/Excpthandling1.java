package otherLabs;
import java.util.*;
public class Excpthandling1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the value of a:");
			int a=sc.nextInt();
			System.out.println("Enter the value of b:");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("The value of c is:"+c);
		}
		catch (ArithmeticException e) {
            System.out.println("Error: "+e.getMessage());
		}
		catch(Exception e){
			System.out.println("Some error has occured");
		}
		
		
	}

}
