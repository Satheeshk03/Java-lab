package otherLabs;

public class ThreadRunnableInterface implements Runnable {
	public void run(){
		for(int i=0;i<5;i++)
			System.out.println("Thread:"+i);
		try {
			Thread.sleep(4000);
		}
		catch(Exception e) {
			System.out.println("Some error has occured");
		}	}
public static void main(String args[]) {
	ThreadRunnableInterface d=new ThreadRunnableInterface();
	Thread thread=new Thread(d);
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
