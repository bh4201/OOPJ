
/*Q8: Write a program that takes three boolean inputs and prints true if at least two of
them are true.
Hint: Use logical operators (&&, ||).

*/
class Q8{
	public static void main(String args[])
	{
		boolean flag1 = true; 
        boolean flag2 = true; 
        boolean flag3 = false; 	
		if(flag1 && flag2 || flag3)
		{
			System.out.println(" True value are flag1 and flag2");		
		}
		else
		{
			System.out.println(" False value are flag3");
		}
	}
}