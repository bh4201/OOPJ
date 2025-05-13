class GarbageCollecionDemo
{
	protected void finalze(){
	System.out.println("finlize method");
	}
	public static void main(String []args)
	{
		GarbageCollecionDemo g1= new GarbageCollecionDemo();
		g1=null;
		System.gc();
	}
	
}