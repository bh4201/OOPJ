import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
       /* Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int total=A.length()+B.length();
        int res=A.comapreTo(B);
         System.out.println(total);
        if(res==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
         System.out.println(A.concat(" ").concat(B));*/
		 
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String s=A.reverse();
        boolean b=A.equals(s);
        if(b)
            System.out.println("Yes");
        else
            System.out.println("False");
        
    }
}

        
        