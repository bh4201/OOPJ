//Q20: Implement a Java program that returns the absolute value of a given number using
//the ternary operator (without using Math.abs() ).

import java.util.Scanner;
public class Q20{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter  number ");
		int num1 = sc.nextInt();
		int result=(num1<0)? (num1*-1) : num1;
		
		System.out.println("---------------------------");
		System.out.println("---------------------------"+result);
		

	}
}