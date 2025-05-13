interface MyInterfaceInJava9 
{
   static void method1() 
   {
	printLines(); //calling private method
	System.out.println("This is method1");
   }
   static void method2() 
   {
	printLines(); //calling private method
	System.out.println("This is method2");
   }
   //this must be static else we will get compilation error
   private static void printLines() 
   {
	System.out.println("Starting method");
	System.out.println("Doing someting");
   }
   default void mymethods()
   {
	method1();
	method2();
   }
}
abstract class BankAccount{
	abstract public void deposit();
	abstract public void withdraw();
}
class SavingAccount extends BankAccount{
	@Override
	public void deposit() {
		System.out.println("Maximum Deposit Amonut is 50000/Day");		
	}
	@Override
	public void withdraw() {
		System.out.println("Maximum Withdraw  Amonut is 25000/Day");				
	}	
}

class CurrentAccount extends BankAccount{
	@Override
	public void deposit() {
		System.out.println("Maximum Deposit Amonut is 500000/Day");		
	}
	@Override
	public void withdraw() {
		System.out.println("Maximum Withdraw  Amonut is 250000/Day");				
	}	
}
class FixedDepositAccount extends BankAccount{
	@Override
	public void deposit() {
		System.out.println("Minimum Deposit Amonut is 5000/Month");		
	}
	@Override
	public void withdraw() {
		System.out.println("Maximum Withdraw  Amonut is 25000/Year");				
	}	
}

public class AccountTest {
	public static void main(String[] args) {
		BankAccount account;//Reference of a abstract class
		account=new SavingAccount();
		account.deposit();
		account.withdraw();
		account=new CurrentAccount();
		account.deposit();
		account.withdraw();
		account=new FixedDepositAccount();
		account.deposit();
		account.withdraw();
	}
}
