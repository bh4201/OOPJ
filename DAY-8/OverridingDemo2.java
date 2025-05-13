class Parent{
	void display(){
		System.out.println("I am parent");
	}
}
class Child extends Parent{
	@Override
	void display(){//METHOD overriding
		System.out.println("I am child class");
	}	
}

class OverridingDemo2{
public static void main(String args[]){
	Child c1=new Child();
	c1.display();
	Parent c2=new Parent();
	c2.display();
	Parent c3=new Child();
	c3.display();
	

}
}