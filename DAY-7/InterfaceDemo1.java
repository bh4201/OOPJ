
interface Animal{
	// By default abbstract
	void sound ();
}
class Dog implements Animal{
	void sound (){
		System.out.println("Sound method of interfae");
	}

}

class InterfaceDemo1{
	public static void main(String[] args){
	Animal a=new Dog();
	a.sound();	
	}
}