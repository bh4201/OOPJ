interface Printer{
	 void print();
}


interface Scanner{
	 void scan();
}

class Computer implements Printer,Scanner{
	public void print(){
		System.out.println("Printer Method");
	}
	public void scan(){
		System.out.println("Scanner Method");
	}
	default void msg(){
		System.out.println("Default Method");
	}		
}


class MultipleLevel3{
	public static void main(String[] args){
		Computer c=new Computer();
		c.print();
		c.scan();
		c.msg();
		
	}
}