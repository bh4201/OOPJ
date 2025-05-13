class ExceptionDemo2{

	public static void main(String args[]){
	
	try{
		double a = 3.0/0;
		double b = 0/4.0;
		double c=0/0.0;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	catch(ArithmeticException e){
		System.out.println("Please donot divide by zero");
	}




}

}