class Parent{
	int i=100;
	void show(){
		System.out.println("Parent method");
	}
}
class Child extends Parent{
	int num=50;
	int i=60;
	void show(){
		
		System.out.println("child method");
		super.show();
	}
	void display(){
		System.out.println(num);
		System.out.println(i);
		System.out.println(super.i);
	}
}
class Overiding6{
public static void main(String args[]){
	//Parent p1=new Parent();
	//p1.show();
	Child c1=new Child();
	c1.show();
	

}
}