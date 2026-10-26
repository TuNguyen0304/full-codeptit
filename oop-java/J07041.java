import java.io.*;
import java.util.*;

class Pair implements Serializable, Comparable<Pair> {
    private int first, second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public int compareTo(Pair o) {
        if (first != o.first) return first - o.first;
        return second - o.second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

public class J07041 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));

        ArrayList<Pair> list = (ArrayList<Pair>) in.readObject();

        TreeSet<Pair> ts = new TreeSet<>();

        for (Pair p : list) {
            if (p.getFirst() < p.getSecond()) {
                ts.add(p);
            }
        }

        for (Pair p : ts) {
            System.out.println(p);
        }
    }
}