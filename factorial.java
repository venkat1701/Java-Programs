import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++){
		    int m = sc.nextInt();
		    int c=0;
		    for(int j = 5;j<=m;j*=5){
		        c = c+ m/j;
		    }
		    System.out.println(c);
		}
        sc.close();
	}
}
