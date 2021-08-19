import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int M,N;
        M = sc.nextInt();
        N = sc.nextInt();
        int a[][]=new int[M][N];
        String s = "";
        for(int i=0;i<M;i++){
            int max = 0;
            for(int j =0;j<N;j++){
                a[i][j] = sc.nextInt();
                if(a[i][j] > max){
                    max = a[i][j];
                }
            }
            s = s + Integer.toString(max) + " ";
        }
        System.out.println(s);
        sc.close();
    }
}