package otherLabs;

public class ThreadClass extends Thread {
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("Thread:"+i);
		try {
			Thread.sleep(4000);
		}
		catch(Exception e) {
			System.out.println("Some error occured");
		}
	}
public static void main(String args[]) {
ThreadClass thread=new ThreadClass();
thread.start();
for(int i=0;i<5;i++)
	System.out.println("Main function:"+i);
try {
	Thread.sleep(4000);
}
	catch(Exception e) {
		System.out.println("Some error occured");
		
	}
      
	
}
}
