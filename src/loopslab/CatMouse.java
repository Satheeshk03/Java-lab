package loopslab;
import java.util.Scanner;
class Points{
	int a,b;
	int remo(int x,int z)
	{
		a=z-x;
		return a;
	}
  int omer(int y,int z)
  {
	  b=z-y;
	  return b;
  }

}

public class CatMouse {
	public static void main(String args[]) {
		int a,b,q,x,y,z;
		String P="Cat A";
		String Q="Cat B";
		String R="Mouse C";
		Scanner sc=new Scanner(System.in);
		Points obj=new Points();
		
	System.out.println("Enter the number of Queries:");
	q=sc.nextInt();
	if(q>=1&&q<=100)
		{
	System.out.println("Enter the positions of Cat A,Cat B and Mouse C:");
	x=sc.nextInt();
	y=sc.nextInt();
	z=sc.nextInt();
	a=obj.remo(y, z);
	b=obj.omer(x, z);
	
	if(a>b)
		System.out.println(P);
	else if(a<b)
		System.out.println(Q);
	else
	    System.out.println(R);
	
	
	}
	else System.out.println("Invalid");
	}

	
}
	
	
	
	
	
	
	
	
	
	
	
	

