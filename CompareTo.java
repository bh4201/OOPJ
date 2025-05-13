class CompareTo
{
	public static void main(String args[])
{
	String str1 = "String method tutorial";
	String str2 = "compareTo method example";
 	int var1 = str1.compareTo( str2 );
	String str3=new String("String method tutorial");
	
  	System.out.println("str1 & str2 comparison: "+var1);
	System.out.println("str1 & str3 comparison: "+(str1.compareTo(str3)));
}
}