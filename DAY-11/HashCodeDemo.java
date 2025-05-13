class HashCodeDemo
{
	String name=name;
	int id;
	ToString(String name,int id){
		this.name=name;
		this.id=id;
	}
	@Override
	public  int hashCode(){
		return id;
		 
		
	}
	public static void main(String args[])
{
	HashCodeDemo t1=new HashCodeDemo("Abcd");
	
  	System.out.println(t1.hascode());
  



}

}