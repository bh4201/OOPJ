//3. Find the Second Largest Element
// Find the second-largest element in the given array.
import java.util.Scanner;

class Q3LargestEle{
			
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
		}
		int sum=0;
		int average=0;
		for(int i=0;i<5;i++)
		{
			
			sum=sum+arr[i];
		}
		average =sum/arr.length;
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+average);
		
		
	}
		
		
}