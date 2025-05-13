class Parent{
void show(){
}
}
class Child extends Parent{
void show(){
}
}
class InheritanceDemoo1{
public static void main(String args[]){
Parent p1=new Parent();
System.out.println(p1.x);
//System.out.println(p1.y);//error

Parent p2=new Child();
//System.out.println(p2.x);it will give error
System.out.println(p2.y);
Child p1=new child();
System.out.println(p1.x);
System.out.println(p1.y);
}
}