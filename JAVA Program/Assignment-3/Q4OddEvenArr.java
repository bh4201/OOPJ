//5. Find Sum and Average
// Compute the sum and average of all elements in the array.
import java.util.Scanner;

class Q4OddEvenArr{
			
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
		System.out.println();
		int ecount=0;
		int ocount=0;
		int num=0;
		for(int i=0;i<5;i++)
		{
			num=arr[i];
			if(num%2==0){
				ecount++;
			}
			else{
				ocount++;
			}
		}	
		System.out.println("evencount "+ecount + "\n" +"oddcount "+ ocount);
		
		
	}
		
		
}