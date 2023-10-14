package stringsAndArraysLab;
import java.util.Scanner;
public class Array1 {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int[] arr = new int[5];
			System.out.println("Enter the array elements");
			
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.nextInt();
			}
			
			System.out.println("Enter element to find");
			
			int searchKey = s.nextInt();
			searchElement(arr,searchKey);
		}
			public static void searchElement(int[] arr, int search) { 
			int x=0;
			int index=0;
				for(int i=0; i<arr.length;i++)
				{
					if(arr[i]==search)
					{
						 x=1;
					   index=i;	
					}
				}
				if(x==1)
					System.out.println("Element found"+"at index"+index );
				else
					System.out.println("Element not found");
			}
	
}