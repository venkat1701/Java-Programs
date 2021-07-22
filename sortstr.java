/* package codechef; // don't place package name! */

import java.util.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class sortstr
{
    public static String sortt(String m){
        char c[]=m.toCharArray();
        
        Arrays.sort(c);
        
        return String.valueOf(c);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0;i<t;i++){
		    String s1="",s2="";
		    String s = sc.next();
		    int l = s.length();
		    if(l%2==0){
		        s1 = s.substring(0,(l/2));
		        s2 = s.substring((l/2),l);
		        s1 = sortt(s1);
		        s2 = sortt(s2);
		        if(s1.equals(s2)){
		            System.out.println("YES");
		        }
		        else{
		            System.out.println("NO");
		        }
		    }
		    else{
		        s1 = s.substring(0,(l/2));
		        s2 = s.substring((l/2)+1,l);
		        s1 = sortt(s1);
		        s2 = sortt(s2);
		        if(s1.equals(s2)){
		            System.out.println("YES");
		        }
		        else{
		            System.out.println("NO");
		        }
		    }
		}
        sc.close();
	}
}
