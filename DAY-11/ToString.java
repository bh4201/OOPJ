class ToString
{
	String name=name;
	int id;
	ToString(String name,int id){
		this.name=name;
		this.id=id;
	}
	@Override//done overridig with toString pf Ibject class
	public  String toSring(){
		return name+ " -- "+id; // return String values
		
	}
	public static void main(String args[])
{
	ToString t1=new ToString("Abcd");
	
  	System.out.println(t1);//By default to to String method is called 
  



}

}