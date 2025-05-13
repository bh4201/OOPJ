class StringDemo3
{

	public static void main(String []args)
	{
		StringBuffer sb=new StringBuffer("Helo ");
		System.out.println(sb);
		sb.append("Duniya!");
		System.out.println(sb);
		System.out.println("---------------");
		//StringBuffer sb1="ABCD ";
		StringBuilder sb1=new StringBuilder("Helo ");
		System.out.println(sb1);
		sb1.append("EFG");
		System.out.println(sb1);		
	}
	
}