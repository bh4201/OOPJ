//. Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=) on two integers.\

class AssignmentOperator{
	public static void main(String args[])
	{	
	//= operators
		int i=8;
	
			System.out.println(" = operator "+i);
	
	//+=
	    int num1 = 10, num2 = 2;
 
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
 
        // Adding & Assigning values
        num1 += num2;
 
        // Displaying the assigned values
        System.out.println("num1 = " + num1);
	//-=
	    int num3 = 10, num4 = 20;
 
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
 
        // Adding & Assigning values
        num3 -= num4;
 
        // Displaying the assigned values
        System.out.println("num3 = " + num4);

        int num5 = 10, num6 = 20;
 
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
 
        // Multiplying & Assigning values
        num5 *= num5;
 
        // Displaying the assigned values
        System.out.println("num5 = " + num5);
		
		
		
		 System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
 
        // Dividing & Assigning values
        num1 /= num2;
 
        // Displaying the assigned values
        System.out.println("num1 = " + num1);
		
		    int n1 = 5, n2 = 3;
 
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
 
        // Moduling & Assigning values
        n1 %= n2;
 
        // Displaying the assigned values
        System.out.println("n1 = " + n1);
		

		

	}

}