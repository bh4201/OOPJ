class  EqualsIgnoreCase{
	public static void main(String []args)
{
	String str1="Apple";
	String str2="apple";
	
	String str3=new String("Apple");
	String str4=new String("ApPLe");

		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str3.equalsIgnoreCase(str4));
		System.out.println(str2.equalsIgnoreCase(str4));

}
}