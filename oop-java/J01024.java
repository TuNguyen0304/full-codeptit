
import java.util.Scanner;
public class J01024 {

    static String check(String s){
        for(int i=0;i<s.length();i++){
            if("012".indexOf(s.charAt(i))==-1) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s=sc.next();
            System.out.println(check(s));
        }
        sc.close();
    }
}
