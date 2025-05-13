
import java.util.Scanner;
public class Q19{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter  char");
		char num1 = sc.next().charAt(0);
		
		System.out.println("---------------------------");
		int a = (int)num1;
		String result = (a>64 && a<91)? "Uppercase" : (a>96 && a<123)? "Lowercase" : "Not a character";
	
		System.out.println(result + "num1");
	}
}