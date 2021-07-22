import java.util.*;
public class Isboth {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%5==0 && n%11==0){
            System.out.println("BOTH");
        }
        else if(n%5==0 || n%11==0){
            System.out.println("ONE");
        }
        else{
            System.out.println("NONE");
        }
        sc.close();
    }
}
