import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder str = new StringBuilder();
        str.append(A);
        str.reverse();
        String b = str.toString();
        if( b.equals(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}
