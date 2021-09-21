
import java.util.*; 

class MaxDam 
{ 
	static int maxCandy(int height[], int n) 
	{ 
	    if(n <= 2){
	        return 0;
	    }
	    int dam = 0, start = 0, end = n-1,maxdam = 0;
	    while(start <= end){
	        dam = Math.min(height[start],height[end]) * (end-start-1);
	        maxdam = Math.max(maxdam, dam);
	        if(height[start] < height[end]){
	            start++;
	        }
	        else{
	            end--;
	        }
	    } 
	    
	    
	    return maxdam;
	}
}

class DamCandies{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int height[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                height[i] = sc.nextInt();
            }

            System.out.println(MaxDam.maxCandy(height,n));
            t--;
        }
        sc.close();
	} 
} 
