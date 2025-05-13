class Parent{
	void display(){
		System.out.println("I am parent");
	}
}
class Child extends Parent{
	void display(){//METHOD overriding
		System.out.println("I am child class");
	}	
}

class OverridingDemo1{
public static void main(String args[]){
	Child c1=new Child();
	c1.display();
	

}
}