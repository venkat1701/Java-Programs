//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
     public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.candies(m,n));
            t--;
        }
    } 
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int candies(int m, int n)
    {
        int x = (m*n)-(m+n);
        return (x/2 + 1);
    }
}