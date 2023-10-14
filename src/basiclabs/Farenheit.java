package basiclabs;
import java.util.Scanner;
public class Farenheit {
public static void main(String args[]) {
	float m,Celsius;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the temperature:");
	m=scan.nextFloat();
	Celsius=((m-32)*5)/9;
	System.out.println("The Celsius value is:"+Celsius+"celsius");
	}
	}



