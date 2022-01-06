package data_structures.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Lists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> L = new ArrayList<Integer>(N);
        for (int i=0; i<N; i++) {
            L.add(sc.nextInt());
        }

        int Q = sc.nextInt();
        for (int i=0; i<Q; i++) {
            String s = sc.next();

            if (s.equalsIgnoreCase("insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                L.add(x, y);
            }
            if (s.equalsIgnoreCase("delete")) {
                int x = sc.nextInt();
                L.remove(x);
            }
        }

        sc.close();

        for (int X:L) {
            System.out.print(X+" ");
        }
    }
}
