import java.util.Scanner;

public class J01005 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();
        while(t>0){
            t--;
            double n = reader.nextDouble(), h = reader.nextDouble();
            for(double i = 1; i < n; i++){
                double p = i/n;
                double curh = h*(Math.sqrt(p));
                System.out.printf("%.6f ",curh);
            }
            System.out.println("");
        }
        reader.close();
    }
}
