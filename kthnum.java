//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

public class kthnum {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            number obj = new number();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class number {
    public long kthElement( int arr[], int brr[], int m, int n, int k) {
        if(m>n){
            return kthElement(brr,arr,n,m,k);
        }
        int low = Math.max(0,k-n);
        int high = Math.min(m,k);
        while(low<=high){
            int cut1 = low+((high-low)/2);
            int cut2 = k-cut1;
            int l1 = (cut1==0)?Integer.MIN_VALUE : arr[cut1-1];
            int r1 = (cut1==m)?Integer.MAX_VALUE : arr[cut1];
            int l2 = (cut2==0)?Integer.MIN_VALUE : brr[cut2-1];
            int r2 = (cut2==n)?Integer.MAX_VALUE : brr[cut2];
            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2){
                high = cut1-1;
            }
            else{
                low = cut1+1;
            }
            
        }
        return -1;
    }
}