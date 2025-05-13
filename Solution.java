import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
class Student{
    int pMarks;
    int cMarks;
    int mMarks;
    double percent;
    
    Student(int pMarks,int cMarks,int mMarks){
        this.pMarks = pMarks;
        this.cMarks = cMarks;
        this.mMarks = mMarks;
        this.percent = (pMarks + cMarks + mMarks) / 3.0;
    }
   
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 20;
        int pMarks =0;
        int cMarks =0;
        int mMarks =0;
      List <Student> sList = new ArrayList<Student>();
        
        for(int i= 0;i < size; i++){
                pMarks = sc.nextInt();
                cMarks = sc.nextInt();
                mMarks = sc.nextInt(); 
                
                System.out.println(pMarks+","+cMarks+","+mMarks);
                sList.add(new Student(pMarks, cMarks, mMarks)); 
                
        }
        
        List<Student> studList1 = sList.stream().filter(s -> s.percent>=75).collect(Collectors.toList());
        //sc.nextLine();
        List<Student> studList2 = sList.stream().filter(s -> s.percent<=40).collect(Collectors.toList());
            
        System.out.println("Number of students securing 75% and above: " + studList1.size());
        System.out.println("Number of students securing 40% and below: " + studList2.size());                                                                               
    }
}