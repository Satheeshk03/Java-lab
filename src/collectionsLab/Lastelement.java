package collectionsLab;
import java.util.LinkedList;
public class Lastelement {
public static void main(String args[]) {
	LinkedList d=new LinkedList();
	d.add(1);
	d.add(5);
	d.add(4);
	d.add(3);
	d.add(6);
	d.add(2);
	d.add(9);
	d.add(8);
	System.out.println(d);
	System.out.println(d.peekLast());
	
}
}
