/*Q6: Write a program to find the largest of three numbers using only the ternary operator
( ? : )
*/
class TernaryOperatorQ6{
	public static void main(String args[])
	{	
		int x=7, y=4, z=9;
		//using ternary operator to chaeck largets three number
		int res = ((x>y && x>z)? x : (y>x && y>z)? y : z);
		System.out.println(res + " is the largest number.");

		
	}

}