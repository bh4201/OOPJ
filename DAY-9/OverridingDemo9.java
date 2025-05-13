class GrandParent{
	
	GrandParent(){
		System.out.println("GP");
	}
}

class Parent extends GrandParent{
	Parent(){
		//super();//calls GP constructor
		System.out.println("Parent");
	}
	
}

class Child extends Parent{
	
	Child(){
		//super();//call P constructor
		System.out.println("Child");
	}
	
}
class OverridingDemo9{
	public static void main(String args[]){
		
		Child c = new Child();
		
	}
}