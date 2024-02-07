import java.io.*;
import java.util.*;

public class String_Introduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int A_len = A.length();
        int B_len = B.length();
        int sum = A_len + B_len;
        System.out.println(sum);
        
        int retval = A.compareTo(B);
        if (retval>0){
           System.out.println("Yes"); 
        }
        else{
            System.out.println("No");
        }
        
        String s1 = A.substring(0,1).toUpperCase() + A.substring(1,A_len); 
        String s2 = B.substring(0,1).toUpperCase() + B.substring(1,B_len);
        System.out.println(s1 + " " + s2);
        
    }
}



