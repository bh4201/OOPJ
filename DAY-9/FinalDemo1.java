
class FinalDemo1{
	final int SPEED_LIMIT =120;//Final variable
	void display()
	{
	final int SPEED_LIMIT =121;
		System.out.println(SPEED_LIMIT);
	}
	
	
	public static void main(String args[]){//method
				
		FinalDemo1 f1 = new FinalDemo1();
		f1.display();
	}
}