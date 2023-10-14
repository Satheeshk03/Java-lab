package otherLabs;

public class ThreadSynchronize implements Runnable{
	public void run() {
		String name=Thread.currentThread().getName();
		try {
			System.out.println(name+"is executing first line");
             Thread.sleep(3000);
			System.out.println(name+"is executing second line");
			Thread.sleep(3000);
			System.out.println(name+"is executing third line");
			Thread.sleep(3000);
		
			synchronized(this){

				System.out.println(name+"is executing fourth line");
				Thread.sleep(3000);
				System.out.println(name+"is executing fifth line");
				Thread.sleep(3000);
			}
			System.out.println(name+"is executing sixth line");
			Thread.sleep(3000);
			System.out.println(name+"is executing seventh line");
			Thread.sleep(3000);
				
			
		}
		catch(Exception e) {
			System.out.println("Some error occured");
			
		}
	}		
	public static void main(String args[]) {
	ThreadSynchronize t=new ThreadSynchronize();
	Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		
		
		t1.setName("One");
		t2.setName("Two");
		
		t1.start();
		t2.start();
		
		
	}
		
}
