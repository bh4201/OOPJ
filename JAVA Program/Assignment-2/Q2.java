/*
Write a program to check whether a given number is even or odd using only bitwise
operators.
Hint: Use n & 1 to check.

*/
class Q2{
	public static void main(String args[])
	{	
	   int a=4;
	   int b=7;
	   if((a | a)%2==0 || (b|b)%2==0 )
		   System.out.println("Even number"+a);
		   System.out.println("odd number"+b);
	}

}