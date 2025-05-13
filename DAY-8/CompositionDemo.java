class Engine{
	String type;
	Engine(String type){
		this.type=type;
	}
}

class Car{
	String model;
	Engine e;// compostion(Strong Has-A Relationship)	Car{
	Car(String model,String type){
		this.model=model;
		//creating the object inside constructor
		this.e=new Engine().type;
	}
	void display(){
		System.out.println(model+"---"+e.type);
		
	}
}
class CompositionDemo{
public static void main(String args[]){
	Car e1=new Car("BMW","10HP");
	e1.display();
	
}
}