package interfaceandothers;

public class Demo2 {
	public static void main(String args[]) { 
CheckingAccount ck=new CheckingAccount();	
ck.deposit();
ck.withdraw();
}
}
interface Bankaccount{
	void deposit();
	void withdraw();
}

class CheckingAccount implements Bankaccount{
public void deposit() {	
	System.out.println("10000");
}
public 
void withdraw() {
	System.out.println("3000");
}
}














