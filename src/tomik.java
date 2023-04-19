import java.util.Scanner;

public class tomik {
    public static void main(String[] args) {
        int [] p = new int[6];
        for(int i = 0;i<p.length;i++) {
            p[i] = i*20;
        }
        for (int i = 0;i< p.length;i++) {
            System.out.println(p[i]);
        }
        System.out.println();
        int[] z = {1,2,3,4};
        int f = 4;
        for (int x:z) {
            f = f+x;
        } System.out.println(f);

    }
}