//Initial Template for Java

import java.io.*;
import java.util.*; 

class RepeatedString{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t > 0){
            String A = sc.nextLine();
            String B = sc.nextLine();
            System.out.println(repeated.repeatedStringMatch(A,B));
            t--;
        }
        sc.close();
    } 
} 
        

// } Driver Code Ends


//User function Template for Java

class repeated 
{ 
	static int repeatedStringMatch(String A, String B) 
	{ 
        String AA = A;
        int n = B.length()/A.length() + 2;
        for(int i = 1;i<=n;i++){
            if(A.indexOf(B) >=0){
                return i;
            }
            A = A + AA;
        }
        return -1;
	} 
} 

