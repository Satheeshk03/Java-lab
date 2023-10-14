package collectionsLab;
import java.util.*;
public class Iterating {
public static void main(String args[])
{
	HashSet n=new HashSet();
	n.add(20);
	n.add(3);
	n.add(4);
	n.add(44);
	n.add(5);
	n.add(64);
	n.add(2);
	n.add(3);
	System.out.print(n);
	Iterator k=n.iterator();
	while(k.hasNext()==true)
	{
		System.out.println(k.next());
	}
	
	
	
	
	
}
}
