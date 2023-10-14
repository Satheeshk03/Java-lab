package stringsAndArraysLab;
import java.util.*;

class String1 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	sc.close();
	String longestword=findlongestword(str);
	int lengthofword=longestword.length();
	
	System.out.println("The longest word is"+longestword);
	System.out.println("The length of the longest word is"+lengthofword);
}
public static String findlongestword(String str) {
String[] words = str.split(" ");
String longestword = "";

for (String word : words) {
    if (word.length() > longestword.length()) {
        longestword = word;}
}
	return longestword;
}}
