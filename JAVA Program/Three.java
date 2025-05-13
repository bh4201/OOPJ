import java.io.*;
import java.util.*;

public class Three {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
       if( n1 >= n2 && n1 >= n3)
            System.out.println("Maximum of "+n1+","+n2+", and "+n3+" is : "+n1);

        else if (n2 >= n1 && n2 >= n3)
            System.out.println("Maximum of "+n1+","+n2+", and "+n3+" is : "+n2);

        else
            System.out.println("Maximum of "+n1+","+n2+", and "+n3+" is : "+n3);
        
    }
}