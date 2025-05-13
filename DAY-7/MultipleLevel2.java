interface Printer{
	 void print();
}
interface Computer extend Printer{
}

interface Scanner{
	 void scan();
}
interface Laptop extends Scanner{
	 void scan();
}

class Computer implements Printer,Scanner{
	public void print(){
		System.out.println("Printer Method");
	}
	public void scan(){
		System.out.println("Scanner Method");
	}
		
}


class MultipleLevel1{
	public static void main(String[] args){
		Computer c=new Computer();
		c.print();
		c.scan();
		
	}
}