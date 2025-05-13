class Parent{
int x=10;
}
class Child extends Parent{
int y=10;
}
class InheritanceDemoo{
public static void main(String args[]){
Parent p1=new Parent();
System.out.println(p1.x);
System.out.println(p1.y);

Parent p2=new Child();
System.out.println(p2.x);
System.out.println(p2.y);
Child p1=new Parent();
System.out.println(p1.x);
System.out.println(p1.y);
}
}