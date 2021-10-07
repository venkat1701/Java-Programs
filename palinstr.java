import java.util.*;

class palin{
    private String s;
    static Scanner sc = new Scanner(System.in);

    public void input(){
        System.out.println("Enter the String: ");
        s = sc.nextLine();
    }

    public static boolean check(String m){
        int n = m.length();
        if(n == 0 || n == 1){
            return true;
        }
        if(m.charAt(0) == m.charAt(n-1)){
            return check(m.substring(1,n-1));
        }
        return false;
    }

    public void display(){
        System.out.println("Is the given string a palindrome?");
        System.out.println(check(s));
    }
}

public class palinstr {
    public static void main(String[] args){
        palin ob = new palin();
        ob.input();
        ob.display();
    }
}
