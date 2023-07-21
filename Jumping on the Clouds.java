//Problem: https://www.hackerrank.com/challenges/jumping-on-the-clouds
//Java 8
import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        int jumps = 0;
        
        int i;
        int len = c.length;
        for ( i = 0; i < len; i ++)
        {
            if ( i + 1 < len && c[i+ 1] == 0 )    // Two Step Forward 
            {
                i++ ;
                
            }
            else
            {
                i = i+2;
            }
            jumps++;
            
        }
        System.out.println(jumps);
    }
}
