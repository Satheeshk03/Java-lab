package stringsAndArraysLab;
import java.util.Scanner;

class Showroom{
     String name;
	 long mobno;
   double cost, dis,amount;
     Showroom(){
    	 
     }
   void input() {
	   Scanner s=new Scanner(System.in);
	   name=s.next();
	   mobno=s.nextLong();
	   cost=s.nextDouble();
	  
	   
   }
   void calculate() {
	   if(cost<=10000)
		   dis=cost*0.05;
	   else if(cost>=10000&&cost<=20000)
		  dis=cost*0.10;
	   else if(cost>=20000&&cost<=35000)
		  dis=cost*0.15;
	   else if(cost>35000)
		  dis=cost*0.20;
	   amount=cost-dis;
	   
   }
   void display() {

	   
	   System.out.println("Name:"+name);
   System.out.println("Mobile NO:"+mobno);
   System.out.println("amount:"+amount);
  
   }
	
}

public class String3 {
public static void main(String args[]) {
Showroom sr=new Showroom();
	System.out.println("Enter your name, mobno, cost,dis & amount:");
	sr.input();
	sr.calculate();
	sr.display();
}
}