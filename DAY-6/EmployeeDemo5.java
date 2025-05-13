
	class Employee{
		int i;
		String name;
		static int count;
		
		{
			System.out.println("Before creating object");
			//i = 5;
		}
		static{
			System.out.println("Static block called");
			//i = 5;	//Error
			//count++; //OK
		}
		
		
		/*Employee(){
			System.out.println(i+name);
		}*/
		
		Employee(){
			count++;
			/*this.i = 100;
			this.name="unknown";
			System.out.println("Default");
			System.out.println(i+" "+name);*/
		}
		
		Employee(int i,String name){
			count++;
			this.i = i;
			this.name=name;
			System.out.println("Parameterized");
			System.out.println(i+" "+name);
		}
		
		//Copy constructor
		Employee(Employee emp){
			count++;
			this.i = emp.i;
			this.name=emp.name;
			System.out.println("Copy constructor");
			System.out.println(i+" "+name);
		}
		
		void data(String name,int i)
		{
			this.i = i;
			this.name=name;
			System.out.println(i+" "+name);
			
		}
		
		static void data1(String name,int i)
		{
			i = i;
			name=name;
			System.out.println(i+" "+name);
			
		}
		
		void display()
		{
			System.out.println("i = " + i + " name = " + name);
		}
		
		static void printObjCount()
		{
			System.out.println("Total objects created: " + count);
		}
	}
	class EmployeeDemo5{
		public static void main(String args[]){
			
			Employee e = null;
			Employee.printObjCount();
			//e.display();
			
			/*Employee e1 = new Employee();
			Employee.data1("dffd",232);
			e1.display();
			
			//Employee e = new Employee();
			//e.data("dffd1",1232);
		
			Employee emp1 = new Employee(e1);
			e1.printObjCount();*/
			
		}
		
		
	}
