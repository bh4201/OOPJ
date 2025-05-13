class Employee{
	int id;
	String name;
	Address a;
	Employee (int id,String name,Address a){
		this.id=id;
		this.name=name;
		this.a=a;
	}
	void display(){
		System.out.println(id+"---"+name);
		System.out.println(a.city+"---"+a.state+"--"+a.country);
	}
}

class Address{
	String city,state,country;
	Address(String city,String state,String country){
	 this.city=city;
	 this.state=state;
	 this.country=country;
	}
	
}
class AggregationDemo2{
public static void main(String args[]){
	Address a1=new Address("NDSLS","MH","India");
	Employee e1=new Employee(18,"Virat",a1);
	e1.display();
	
}
}