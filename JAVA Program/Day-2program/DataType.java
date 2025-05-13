//1. Create a program that declares and initializes all primitive data types in Java and prints their default 
//and assigned values
class DataType
{
	static int a2;
	static long b2;
	static float c2;
	static double d2;
	public static void main(String args[])
	{
		int a1=8;
		
		long b1=8L;
		
		float c1=1.11f;
		
		double d1=1.5555d;
		
		
		char ch='c';
		char ch2='\ua11b';
		System.out.println("a1 ="+a1);
		System.out.println("default value of a1="+a2);
		
		System.out.println("b1 ="+b1);
		System.out.println("default value of b1="+b2);
		
		System.out.println("default value of c2="+c2);
		System.out.println(" c1 = "+c1);
		
		System.out.println(" d1 = "+d1);
		System.out.println("default value of d2="+d2);
		
		System.out.println("ch = "+ch);
		System.out.println("default value of ch2="+ch2);
		
	}
}