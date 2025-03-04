//5. Write a program to demonstrate binary, octal, hexadecimal, and floating-point literals in Java.
class LiteralsExample{
	public static void main(String args[])
	{	
		int x1 =010; //interprete octal
			
			//-Hexadecimal Literals : Base 16 : 0-9+(A-F/a-f)
			//-prefix 0x or 0X
		int x2 = 0x10; //interprte hexa decimal
		int x3 = 0X10; //interprte hexa decimal
		System.out.println(" octal  value = "+x1);
		System.out.println(" hexa decimal  value = "+x2);
		System.out.println(" hexa decimal  value = "+x3);
		float f = 123.456f;
		double d1 = 123.456;	//Default double data type
		double d2 =1234.56789D; //Explicit Double 
		System.out.println(" octal  value = "+f);
		System.out.println(" octal  value = "+d1);
		System.out.println(" octal  value = "+d2);
	}

}