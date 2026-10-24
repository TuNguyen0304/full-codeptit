import java.io.*;
import java.util.*;

public class Main {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0) return false;
        return true;
    }

    static ArrayList<Integer> readFile(String name) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(name));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        ois.close();
        return a;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> a = readFile("DATA1.in");
        ArrayList<Integer> b = readFile("DATA2.in");

        int[] c1 = new int[10000];
        int[] c2 = new int[10000];

        for (int x : a) c1[x]++;
        for (int x : b) c2[x]++;

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i) && c1[i] > 0 && c2[i] > 0) {
                sb.append(i).append(' ').append(c1[i]).append(' ').append(c2[i]).append('\n');
            }
        }
        System.out.print(sb.toString());
    }
}