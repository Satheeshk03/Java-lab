package collectionsLab;

import java.util.Iterator;
import java.util.LinkedList;

public class List3 {
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
	
	Iterator descendingIterator=d.descendingIterator();
	while(descendingIterator.hasNext()==true)
	{
		System.out.println(descendingIterator.next());
	}
	
	
	
}}
