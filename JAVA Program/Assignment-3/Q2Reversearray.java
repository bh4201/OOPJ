import java.util.Scanner;

class Q2Reversearray{
			
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		//Input in the array
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter element:");
			arr[i] = sc.nextInt();
		}
	
		System.out.println("original array");
		for(int a : arr){
			System.out.print(a+" ");
		
		int rev[]=new int[5];
		for(int i=0;i<5;i++)
		{
	
				rev[i]=arr[arr.length-i-1];	
			
		
	
		}	
		System.out.println("areverse array:");
		for(int a : rev){
			System.out.print(a+" ");
		}
		
	}
		
		
}