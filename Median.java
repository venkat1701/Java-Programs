//Initial Template for Java

import java.util.*;

public class Median
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            new M();
            double res = M.medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    	sc.close();
	} 
}// } Driver Code Ends


//User function Template for Java

class M
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        int ab[] = new int[n+m];
        double med = 0.0;
        int mid;
        for(int i = 0;i<n;i++){
            ab[i] = a[i];
        }
        for(int i = 0;i<m;i++){
            ab[i+n] = b[i];
        }
        
        Arrays.sort(ab);
        
        
        
        if(ab.length<=2){
            med = (double)(ab[0]+ab[1])/2;
        }
        else{
            if(ab.length%2 == 0){
                mid = ab.length/2;
                med = (double)(ab[mid-1] + ab[mid])/2;
            }
            else{
                mid = (int)Math.ceil(ab.length/2);
                med = ab[mid];
            }
        }
        
        return med;
    }
}
