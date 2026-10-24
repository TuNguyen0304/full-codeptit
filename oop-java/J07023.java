import java.io.*;
import java.util.*;

public class Main {
    static boolean[] prime = new boolean[10000];

    static void sieve() {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i < 10000; i++) {
            if (prime[i]) {
                for (int j = i * i; j < 10000; j += i)
                    prime[j] = false;
            }
        }
    }

    static boolean palindrome(int n) {
        int t = n, rev = 0;
        while (t > 0) {
            rev = rev * 10 + t % 10;
            t /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) throws Exception {
        sieve();

        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> a = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();

        int[] cnt1 = new int[10000];
        int[] cnt2 = new int[10000];

        for (int x : a)
            if (x < 10000) cnt1[x]++;

        for (int x : b)
            if (x < 10000) cnt2[x]++;

        StringBuilder sb = new StringBuilder();

        for (int i = 2; i < 10000; i++) {
            if (cnt1[i] > 0 && cnt2[i] > 0 && prime[i] && palindrome(i)) {
                sb.append(i).append(' ')
                  .append(cnt1[i]).append(' ')
                  .append(cnt2[i]).append('\n');
            }
        }

        System.out.print(sb);
    }
}