//11. Write a program to check if a number is positive and even using logical operators (&&, ||, !).
class LogicalOp{
	public static void main(String args[])
	{	
		int i=-4;
		if(i%2==0 && i >0 )
			System.out.println("Even number " + i);
		else
			System.out.println("Odd number " + i);
	}

}