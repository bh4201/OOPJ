class A{
	void Show(){
		System.out.println("parent class");
		
	}
}
class B extends A{
		void Show(){
		System.out.println("Child class");
		
	}
}
class UpcastDemo{
public static void main(String args[]){
	
	A a1=new A();
	B b1=new B();
}
}