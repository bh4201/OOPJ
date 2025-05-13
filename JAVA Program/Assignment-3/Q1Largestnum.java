import java.util.Scanner;

class Q1Largestnum{
			
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		//Input in the array
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter element:");
			arr[i] = sc.nextInt();
		}
	
		
		for(int a : arr){
			System.out.print(a+" ");
		}
		int max=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
	
		}	
		
		System.out.println(" max "+max);
		
	}
		
		
}