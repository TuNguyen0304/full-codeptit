import java.io.*;
import java.util.*;

public class J01013 {
    public static void main(String[] args) throws IOException {
        int M = 2000001;
        int[] p = new int[M];
        long[] f = new long[M];
        for (int i = 2; i < M; i++) {
            if (p[i] == 0) {
                for (int j = i; j < M; j += i) if (p[j] == 0) p[j] = i;
            }
            f[i] = p[i] + f[i / p[i]];
        }
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken();
        int n = (int) st.nval;
        long s = 0;
        while (n-- > 0) {
            st.nextToken();
            s += f[(int) st.nval];
        }
        System.out.print(s);
    }
}