/*Q16: Write a program that determines whether a given number is positive, negative, or
zero using only the ternary operator .
*/

import java.util.Scanner;
public class TernaryOperatorsQ16{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		 String s=(num>0)? num+ " positive number":(num<0)? num+ " negative number":num +" Zero number";
					System.out.println(s);
	}
}