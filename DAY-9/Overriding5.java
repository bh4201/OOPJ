class Parent{
	void show(){
		System.out.println("Parent method");
	}
}
class Child extends Parent{
	void show(){
		
		System.out.println("child method");
		super.show();
	}
}
class Overriding5{
public static void main(String args[]){
	//Parent p1=new Parent();
	//p1.show();
	Child c1=new Child();
	c1.show();
	

}
}