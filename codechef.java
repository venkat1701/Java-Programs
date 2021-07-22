/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i = 0;i<t;i++)
		{
		    int f=0;
		    int k=sc.nextInt();
		    String s[]=new String[k];
		    for(int j=0;j<k;j++)
		    {
		        s[j]=sc.next();
		    }
		    
		    for(int j=0;j<k;j++)
		    {
		        String str = s[j];
		        char c=str.charAt(0);
		        if(Character.isLowerCase(c))
		        {
    		        for(int l=0;l<str.length();l++)
    		        {
    		            if((int)str.charAt(l)>=97 && (int)str.charAt(l)<110)
    		            f=0;
    		            else
    		            {
    		                f=1;
    		                break;
    		            }
    		        }
		        }
		        else
		        {
		            for(int l=0;l<str.length();l++)
    		        {
    		            if((int)str.charAt(l) >= 78 && (int)str.charAt(l)<=90)
    		            f=0;
    		            else
    		            {
    		                f=1;
    		                break;
    		            }
    		        }
		        }
		    }
		    if(f==0)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
		sc.close();
	}
}
