class  StrLi{
	public static void main(String []args)
{
	String str1="Apple";
	String str2="Apple";
	
	String str3=new String("Apple");
	String str4=new String("Apple");
	/*if(str1==str2){
		System.out.println("String is made on String pool ara ");
	}
		continue;
	if(str3==str4){
		System.out.println("String is made on heap area and one replica on String pool ara ");
	}
		continue;
	if(str2==str4){
		System.out.println("String 4 is made on heap area and one replica on String pool ara and string 2 is string control pool");
		
	}*/

		System.out.println("String is made on String pool ara "+(str1==str2));
		System.out.println("String is made on heap area and one replica on String pool ara "+(str3==str4));
		System.out.println("String 4 is made on heap area and one replica on String pool ara and string 2 is string control pool "+(str2==str4));

		System.out.println("String is made on String pool ara "+str1.equals(str2));
		System.out.println("String is made on heap area and one replica on String pool ara "+str3.equals(str4));
		System.out.println("String 4 is made on heap area and one replica on String pool ara and string 2 is string control pool "+str2.equals(str4));	


}
}