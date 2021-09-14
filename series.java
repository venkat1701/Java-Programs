import java.util.Scanner;

public class series {
static int m,n,a,b ,c;
static Scanner sc = new Scanner(System.in);

   public static void input() {
	   System.out.println("Enter the value of n: ");
		n = sc.nextInt();
		m = 2;
		a = 1;
		b = 1;
		c = a+b;
   }
   
	public static boolean isprime(int k) {
		
			if(k == 1) {
				return false;
			}

	        if (k == 2 || k == 3) {
	           return true;
	        }

	        else if (k % 2 == 0 || k % 3 == 0) {
	            return false;
	        }
	 
	        for (int i = 5; i*i <= k; i += 6)
	        {
	            if (k % i == 0 || k%(i+2) == 0) {
	                return false;
	            }
	        }
	        return true;	
	}
	
	public static void forprime() {
		boolean flag = isprime(m);
		if(flag == true) {
			return;
		}
		while(flag == false) {
			flag = isprime(m);
			if(flag == true) {
				return;
			}
			m++;
		}
	}
	
	public static int fibo(int l) {
		if(n == 1 ) {
			return a;
		}
		else if(n == 3) {
			return b;
		}
		else if(n == 5) {
			return c;
		}
		a = b;
		b = c;
		c = a+b;
		return c;
	}
	public static void main(String args[]) {
		
		//user input
		input();
		
		for(int i = 1;i <= n;i++) {
			
			//for even place value
			if(i % 2 == 0) {
			    forprime();
				if(i == n) {
					System.out.print(m + " ");
				}
				m++;
			}
			
			//for odd place value
			else {
				int h = fibo(i);
				if(i == n) {
					System.out.println(h);
				}
			}
		}
		sc.close();
	}
}
