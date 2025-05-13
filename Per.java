import java.util.*;
public class Per{
	Scanner sc =new Scanner(System.in);
	int above = 0;
	int below = 0;
	int arr[][] = new int[20][3];
	void input()
	{
		for(int i=0; i< 20; i++)
		{
			for(int j=0; j< 3; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
	}

void output(){
		for(int i =0; i<20; i++){
            int total =0;
            for(int j=0; j<3;j++){
                total = total+arr[i][j];
            }
            double parcentage = total/3.0;
            
            if(parcentage>=75){
                above++;
            }
            if(parcentage<=40){
                below++;
            } 
            
        }
         System.out.println("Number of students securing 75% and above: "+above);
         System.out.println("Number of students securing 40% and below: "+below);
}

	public static void main(String[] args)
	{
		Per p =new Per();
		p.input();
		p.output();
		
	}	
}