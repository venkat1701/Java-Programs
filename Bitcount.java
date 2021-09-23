//Initial Template for Java

import java.util.*;
import java.io.*;


 // } Driver Code Ends
//User function Template for Java

class Counting{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
        int ans = 0;
        int x = 1;
        while(x <= n){
            x = x*2;
            int must = (n+1)/x;
            int rem = (n+1)%x;
            int total = must * (x/2);
            if(rem > (x/2)){
                total += (rem- (x/2));
            }
            ans += total;
        }
        return ans;
    }
}

// { Driver Code Starts.

// Driver code
class Bitcount {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int n;
		while(t-->0) {
	        n = sc.nextInt();//input n

		    System.out.println(Counting.countSetBits(n));//calling countSetBits() method
		}
        sc.close();
	}
}
  // } Driver Code Ends