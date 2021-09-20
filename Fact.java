//Initial Template for Java

import java.util.*;

class Fact
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            ArrayList<Integer> ans = F.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }  
        sc.close(); 
    }
}// } Driver Code Ends


//User function Template for Java

class F {
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> list = new ArrayList<Integer>(200);
        int res[] = new int[7000];
 
        res[0] = 1;
        int res_size = 1;
        
        for (int x = 2; x <= N; x++)
            res_size = multiply(x, res, res_size);
 
        for(int i = res_size-1;i >= 0;i--){
            list.add(res[i]);
        }
        
        return list;
    }
    
     static int multiply(int x, int res[], int res_size)
    {
        int carry = 0; 
 
        for (int i = 0; i < res_size; i++)
        {
            int prod = res[i] * x + carry;
            res[i] = prod % 10; 
                                
            carry = prod/10; 
        }

        while (carry!=0)
        {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }
}