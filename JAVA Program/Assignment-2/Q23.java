//Q23: Given a number, find whether it is odd or even using the & bitwise operator and print
//the result without using if-else .

import java.util.Scanner;
public class Q23{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter  number ");
		int a = sc.nextInt();
	
		String res= ((a&1) == 0)? a+" even": a+"odd";
	
			System.out.println(res + "");
	
		
		

	}
}

		
