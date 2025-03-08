import java.util.Scanner;
class Array{
}
class AddSubMulArray{

			
	public static void main(String args[]){
	
	
		Scanner sc = new Scanner(System.in); 
		int arr1[][] = new int[3][3];
		
		//Input:
		for(int i=0;i<3;i++){//Row
			for(int j=0;j<3;j++){//Col
				System.out.println("Enter element:");
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("---Printing array- first array-----");
		for(int ar[] : arr1)
		{
			for(int x : ar){
			
			System.out.print(" "+x);
			}
			System.out.println();
			
		}
		
		// Taking 2nd array-
				int arr2[][] = new int[3][3];
		
		//Input:
		for(int i=0;i<3;i++){//Row
			for(int j=0;j<3;j++){//Col
				System.out.println("Enter element 2nnd array element:");
				arr2[i][j] = sc.nextInt();
			}
		}
		System.out.println("---Printing array- 2nd array-----");
		for(int ar[] : arr2)
		{
			for(int x : ar){
			
			System.out.print(" "+x);
			}
			System.out.println();
			
		}
		// sum of array
		int sum[][]=new int[3][3];
		for(int i=0;i<3;i++){//Row
			for(int j=0;j<3;j++){//Col
				sum[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
		
		System.out.println("---Sum of 2 array-----");
		for(int ar[] : sum)
		{
			for(int x : ar){
			
			System.out.print(" "+x);
			}
			System.out.println();
			
		}
		//subtract array
		int sub[][]=new int[3][3];
		for(int i=0;i<3;i++){//Row
			for(int j=0;j<3;j++){//Col
				sub[i][j] = arr1[i][j]-arr2[i][j];
			}
		}
		
		System.out.println("---Sub tract  2 array-----");
		for(int ar[] : sub)
		{
			for(int x : ar){
			
			System.out.print(" "+x);
			}
			System.out.println();
			
		}	
		
		
		
		
		
		
		
		
	}
}