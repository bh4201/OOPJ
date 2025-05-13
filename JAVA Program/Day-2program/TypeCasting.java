//Write a program to convert a double value to int using typecasting and explain the data loss.
class TypeCasting{
	public static void main(String args[])
	{	
		double val=154455.555;
		int newval=(int)val;
		System.out.println(" Before TypeCasting = "+val);
		System.out.println(" After TypeCasting = "+newval);
	}

}