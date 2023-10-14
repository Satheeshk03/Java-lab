package collectionsLab;
import java.util.*;
public class Arraylist {
	public static void main(String args[]) {
	ArrayList al=new ArrayList();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements");
        int	n=sc.nextInt();
	for(int i=0;i<n;i++) {
		
		int num=sc.nextInt();
		al.add(num);
		
	}
		System.out.println(al);
		Collections.sort(al);
		System.out.println("The sorted array list is"+al);
	
	 System.out.print("Enter the element to find its frequency: ");
	 int Find= sc.nextInt();
	 int frequency = Collections.frequency(al, Find);
System.out.println("The frequency of given number is:"+frequency);

}
}
