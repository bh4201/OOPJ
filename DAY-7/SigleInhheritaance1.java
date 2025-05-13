class Employee{
	int salary=40;
	

}
class Programmer extends Employee{
	int bounus=100;
}

class SigleInhheritaance1{
	public static void main(String[] args){
		Employee e=new Programmer();
		System.out.println("Sal = "+e.salary);
		//System.out.println("Sal = "+e.bounus);
		Programmer e1=new Programmer();
		System.out.println("Sal = "+e1.salary);
		System.out.println("Sal = "+e1.bounus);		
		
	}
}