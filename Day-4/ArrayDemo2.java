import java.util.Scanner;

class ArrayDemo2{
			
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//length : Array
		//length() : String
		
		int arr[] = new int[5];
		//Input in the array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter element:");
			arr[i] = sc.nextInt();
		}
		System.out.println("New Element are :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
		
		
}