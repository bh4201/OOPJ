class StaticDemo{
	
	static int x =10;//static 
	static int y=205;//static
	int z =30;//instance
	
	void show(){
		x =20;
		System.out.println("Non-Static method is called");
		System.out.println(x);//ok
		System.out.println(z);
	}
	static void show1(){
		x =200;
		
		System.out.println("Static method is called");
		System.out.println(x);//ok
		//System.out.println(z);//Error : Non static is not accessible
	}
		
	public static void main(String args[]){
		
		StaticDemo s1 = new StaticDemo();
		
		s1.show();
		//show();//Error: Instance method require reference object
		
		show1();// no need of reference
		StaticDemo.show1();
		
		
		
	}
		
		
}