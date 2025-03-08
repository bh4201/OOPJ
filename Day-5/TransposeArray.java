
import java.util.Scanner;
/*class trans{
 int[][] transpose(int[][] ar1){
		System.out.println("Transpose  matrix: ");
		int res[][]= new int[3][3];
		for(int i=0; i<ar1.length; i++)
		{
			for(int j=0; j<ar1[i].length; j++)
			{
				res[i][j] = ar1[j][i];
			}
		}
		return res;
}
}*/

class TransposeArray{

			
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
		/*System.out.println("---Printing array- first array-----");
		for(int ar[] : arr1)
		{
			for(int x : ar){
			
			System.out.print(" "+x);
			}
			System.out.println();
			
		}	*/
		
		
		System.out.println("Transpose  matrix: ");
		int res[][]= new int[3][3];
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1[i].length; j++)
			{
				res[i][j] = arr1[j][i];
			}
		}
		
	System.out.println("---Printing Transpose- matrix----");
		for(int ar[] : res)
		{
			for(int x : ar){
			
			System.out.print(" "+x);
			}
			System.out.println();
			
		}
		/*trans t=new trans();
		
		
		
		
		System.out.println("Transpose  matrix result: ");
		int res1[][]= t.transpose(arr1);
		for(int i=0; i<res1.length; i++)
		{
			for(int j=0; j<res1[i].length; j++)
			{
			System.out.print(res1[i][j]+" ");
			}
			System.out.println();
		}*/
		
		
		
	}
}
