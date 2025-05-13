class A{
	void Show(){
		System.out.println("parent class");
		
	}
}
class B extends A{
		void Show(){
		System.out.println("Child class");
		
	}
class C extends B{
		void Show(){
		System.out.println("Child class");
		
	}
}
class DowCastingDemo2{
public static void main(String args[]){
	
	A a1=new A();
	B b1=new B();
	A a2=new B();
	B b2= (B) a2;// downcasting
	b2.show()
}
}