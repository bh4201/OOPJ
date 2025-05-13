import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an integer number");
		String str=br.readLine();
		int i=Integer.parseInt(str);
		System.out.println("In Decimal:"+i);
		str=Integer.toBinaryString(i);
		System.out.println("In binary:"+str);
		str=Integer.toHexString(i);
		System.out.println("In Hexadecimal:"+str);
		str=Integer.toOctalString(i);
		System.out.println("In Octal:"+str);
	}
}
