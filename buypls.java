import java.util.*;
public class buypls {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,x,y;
        a = sc.nextInt();
        b = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        int sum = a*x + b*y;
        System.out.println(sum);
        sc.close();
    }
}
