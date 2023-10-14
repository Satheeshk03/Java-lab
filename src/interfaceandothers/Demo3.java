package interfaceandothers;
abstract class BankAccountt{
	int accountnumber;
	int balance;
	void deposit() {
	}
	void withdraw() {
	}   }
	class Checkingaccountt extends BankAccountt{
		public void deposit(){
			   System.out.println("deposited amount:90000");	
			
			   
			
		}
		public void withdraw() { System.out.println("The amount withdrawn:9000");	}
		
	}
	

public class Demo3 {
	public static void main(String args[]) {
		Checkingaccountt c=new Checkingaccountt();
		c.deposit();
		c.withdraw();
	}

}
