package collectionsLab;
import java.util.*;
public class Cloning {
	public static void main(String args[]) {
HashSet rk=new HashSet();

rk.add(5);
rk.add(10);
rk.add(15);
rk.add(20);
rk.add(25);
System.out.println(rk);
HashSet sk=new HashSet(rk);
System.out.println(sk);



	}
}
