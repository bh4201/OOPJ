class GarbageCollecionDemo
{
	protected void finlize(){
	System.out.println("finlize method");
	}
	public static void main(String []args)
	{
		GarbageCollecionDemo g1= new GarbageCollecionDemo();
		g1=null;
		System.gc();
	}
	
}