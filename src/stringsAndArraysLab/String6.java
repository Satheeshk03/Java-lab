package stringsAndArraysLab;

public class String6 {
	
	//comparing strings based on references
		public static void main(String[] args) {
			
			String s = new String("Java");
			String s1 = new String("Java");
			
			if(s==s1)
			{
				System.out.println("References are equal");
			}
			else
			{
				System.out.println("References are not equal");
			}
			
	//comparing based on values or literals
			String s2 = "Java";
			String s3 = new String("Java");
				
			if(s2.equals(s3))
			{
				System.out.println("String values are equal");
			}
			else
			{
				System.out.println("String values are not equal");
			}
	// compare strings character by character		
		    //1.
			String s4 = "Newyork";
			String s5 = new String("New");
			int result = s4.compareTo(s5);	
			if(result==0)
			{
				System.out.println("Equal");
			}
			else
			{
				System.out.println("Not equal");
			}
			
			//2.
			String name = "sachi";
			String name1 = new String("sachin");
			int res = name.compareTo(name1);
			System.out.println(res);
			
	//compare strings by ignoring case
			String s6 = "NEW";
			String s7 = new String("new");
			if(s6.equalsIgnoreCase(s7))
			{
				System.out.println("Equal");
			}
			else
			{
				System.out.println("Not equal");
			}
	}

	}
