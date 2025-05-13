import java.util.Scanner;
class DStar1{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter row size to print * Pattern");
	int row=sc.nextInt();
		System.out.println("Your row Size = "+row);
	
	for(int i=1;i<=row;i++)
	{
			for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
	
		}
		System.out.println();
	}
	
}

}



/*
*
* *
* * *
* * * *
* * * * *
*/