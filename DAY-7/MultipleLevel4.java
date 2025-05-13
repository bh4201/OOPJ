interface OuterInterFace{
	void print();
	interface InnerInterFace{
		void scan();	
}
}
class TestInterFace implements OuterInterFace.InnerInterFace{
	public void print(){
		System.out.println("Outer Interface");
	}
		public void scan(){
		System.out.println("Inner Interface");
	}
}

class MultipleLevel4{
	public static void main(String[] args){
	TestInterFace it=new TestInterFace();
	it.scan();
	it.print();
		
	}
}