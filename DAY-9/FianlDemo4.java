
class FianlDemo2{
	//final  variable
	final int SPEED_LIMIT;
	FianlDemo2(int speed){
		SPEED_LIMIT=speed;
	}
	void display(){
		System.out.prinln("SPEED_LIMIT:-"+SPEED_LIMIT);
	}
public static void main(String args[]){
	FianlDemo2 f1=new FianlDemo2(120);
	f1.display();
}
}