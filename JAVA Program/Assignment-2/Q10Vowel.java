/*Q10: Write a program to determine if a character is a vowel or a consonant using the
ternary operator.
*/


import java.util.Scanner;
public class Q10Vowel{
	public static void main(String[] args){
		/*Scanner sc = new Scanner (System.in);
		char ch = sc.next.charAt();
		System.out.println("Enter a character to check vowel");*/
		char ch='a';
       String s=(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'
        || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
        || ch == 'u' || ch == 'U')?ch +" is vowel": ch+ " consonant";
		System.out.println(s);
	}
}