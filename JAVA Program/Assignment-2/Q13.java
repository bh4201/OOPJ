//Q13: Implement a Java program to find the absolute value of an integer using bitwise
//operators.
//Hint : mask = num >> 31; abs = (num + mask) ^ mask;
public class Q13{
    public static void main(String[] args)
	{
		
		int num=2;
		//System.out.println(31>>num);
		int mask = num >> 31; 
		int abs = (num + mask) ^ mask;
		System.out.println(abs);
	}
}