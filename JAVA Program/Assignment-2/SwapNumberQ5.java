//Write a Java program to swap two numbers using the += and -= operators only
class SwapNumberQ5{
	public static void main(String args[])
	{	
	   int a=5;
	   int b=7;
	   System.out.println("value of a befor swpaing "+a + "value of b berfore swpaaing "+b);
	    a = a + b;
        b = a - b;
        a = a - b;
		   System.out.println("value of a after swpaing "+a + "value of b after swpaaing "+b);
	}

}