class SubString
{
	public static void main(String args[])
{
	/*String s1="Hello".substring(1);
	String s2="Chaitanya".substring(2,5);
	
  	System.out.println("s1 return substrig prefix: "+s1);
	System.out.println("s2 return substrig suffix: "+s2);*/

/*String s = "abscscdab";
string a ="ab";
How time sunstring "B "IS PRESENT it is present */

	String str = "abscscdabcddabcdefghbab";
	String a ="ab";

		int count =0;
        
        // Using contains method
        if (str.contains(a)) {
			count++;
        } else {
            System.out.println("Substring is not present");
        }
		System.out.println("Substring is ab is present" +count+ "times");
}

}