package otherLabs;
import java.util.*;
public class Excpthandling3 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	try {
			
		int[] a=new int[10];
		System.out.println("Enter the student ids");
		for(int i=0;i<a.length;i++)
		{	
		a[i]=sc.nextInt();
		}
		
	 System.out.println("Enter the index number to know the student id:");
	 int i=sc.nextInt();
	System.out.println(a[i]);
		
	}
		catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
    
		}

	}
    }
	