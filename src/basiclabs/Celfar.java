package basiclabs;
import java.util.Scanner;
public class Celfar{
public static void main(String args[]){
float celsius,farenheit;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the temperature in celsius:");
celsius=scan.nextFloat();
farenheit=(celsius*9/5)+32;
System.out.println("The farenheit value is:"+farenheit+"f");
}
}


