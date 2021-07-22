 /* package codechef; // don't place package name! */

 import java.util.*;
 
 /* Name of the class has to be "Main" only if the class is public. */
public class reversing
{
    	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++){
		    int n = sc.nextInt();
		    int rev = 0,a;
	        while(n!=0){
	            a = n%10;
	            rev = (rev*10) + a;
	            n=n/10;
	        }
	        System.out.println(rev);
		}
        sc.close();
	}
}
