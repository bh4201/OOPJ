
/*Q9: Implement a Java program that checks if a number is within a specific range (20 to
50) without using if-else.
Hint: Use logical AND (&&) in a print statement.

*/
class Q9{
	public static void main(String args[])
	{
		int num1=52;
		

   
		String var=((num1>=20 && num1<=50)? num1+ "within in range":num1+ "Not in range");
			System.out.println(var);		
	}
}