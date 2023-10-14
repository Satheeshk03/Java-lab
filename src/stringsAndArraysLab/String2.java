package stringsAndArraysLab;
import java.util.Scanner;
public class String2 {
public static void main(String args[]) {
	String str="Mom raised a soldier";
	String str2="MOM RAISED A SOLDIER";
	String[] words=str.split(" ");
	for(String word:words) {
		System.out.println(word);
	
	}
	System.out.println(str.replace("soldier","Man"));
	System.out.println(str.endsWith("Mom"));
	System.out.println(str.equalsIgnoreCase(str2) );
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	System.out.println(str.isEmpty());
	System.out.println(str.length());
	System.out.println(str.trim());
	System.out.println(str.contains("Mom"));
	System.out.println(str.replaceAll("Mom raised a soldier","soldier never dies") );
	System.out.println(str.indexOf("s"));
	System.out.println(str.substring(4,9));
	System.out.println(str.equals(str2));
	System.out.println(str.lastIndexOf("soldier"));
	System.out.println(str.startsWith("o"));
}}