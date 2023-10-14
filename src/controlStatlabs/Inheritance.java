package controlStatlabs;

class Over {
	int a=2,b=4,c;
}
class Addition extends Over{
	void sum() {
	    c=a+b;
		System.out.println(c);
	}
}
public class Inheritance {
public static void main(String args[])
{
	Addition obj=new Addition();
	obj.sum();
}
}

