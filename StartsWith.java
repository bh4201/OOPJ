class StartsWith
{
	public static void main(String args[])
{
	String s1="refresh java";
	boolean b1=s1.startsWith("refresh");// returns true.
	boolean b2=s1.startsWith("Refresh");// returns false3
	
  	System.out.println("str1 & str2 comparison: "+b1);
	System.out.println("str1 & str2 comparison: "+b2);

  	 String str1 = new String("This is a test String");
	 boolean var1 = str1.endsWith("String");
   	 System.out.println("str1 ends with String: "+ var1);


}

}