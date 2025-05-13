import java.io.*;
import java.util.*;
class Cricket
{
    String name;
    int age;
    final String team="India";
    int runScored;
    
    Cricket(String name,int age,int runScored)
    {
       this.name=name;
       this.age=age;
       this.runScored=runScored;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Team: "+team);
        System.out.println("Run Scored: "+runScored);
    }
    
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        String name1=sc.nextLine();
        int age1=sc.nextInt();
        //sc.nextLine();
        int runScored=sc.nextInt();
        Cricket s1=new Cricket(name1,age1,runScored);
        s1.display();
	}
}