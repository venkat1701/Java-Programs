import java.util.*;
class gfg {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
	    for(int i=0;i<t;i++)
	    {
	        boolean Cap = false;
	        boolean low = false;
	        boolean digit = false;
	        String s = sc.next();
	        for(int j = 0;j<s.length();j++)
	        {
	            char c = s.charAt(j);
	            if((int)c >=65 && (int)c <=90)
	                Cap = true;
	            else if( (int)c >=97 && (int)c<=122)
	                low = true;
	            else if((int)c>=48 && (int)c<=57)
	                digit = true;
	           
	        }
	        if(Cap && low && digit)
	            System.out.println("YES");
	        else 
	            System.out.println("NO");
	    }
        sc.close();
	}
}