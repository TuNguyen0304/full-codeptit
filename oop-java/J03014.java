import java.util.*;
import java.math.*;
public class J03014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-->0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            System.out.println(a.add(b));
        }
    }
}
