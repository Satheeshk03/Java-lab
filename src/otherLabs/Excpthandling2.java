package otherLabs;
import java.util.*;
import java.io.*;
public class Excpthandling2 {
public static void main(String args[]) {

	        String file= "D:\sk.txt"; 

	        try {
	            BufferedWriter writer = new BufferedWriter(new FileWriter(""));
	            writer.write("Hello, IOException Example!");
	            writer.close();
	            System.out.println("Data written to the file.");
	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
}
	}

       