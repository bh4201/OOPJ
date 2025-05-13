// Miscellaneous Operator Questions
//Q21: Write a program that increments a number without using + or ++ operators.
//214Hint : Use bitwise - (~x) .

import java.util.Scanner;
public class Q21{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter  number ");
		int num1 = sc.nextInt();
	
		
		System.out.println(-~num1);
		

	}
}

		
