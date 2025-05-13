class GetChar
{

	public static void main(String []args)
	{
		String s = "Itss Beyond Simple";
		int start = 4;
		int end = 10;
		char storage[] = new char[end-start];
		System.out.println("My String is - "+s);
		s.getChars(start,end,storage,0);
		System.out.println(storage);

		
	}
	
}