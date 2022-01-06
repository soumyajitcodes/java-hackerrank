package data_structures.hashsets;

import java.util.HashSet;
import java.util.Scanner;

public class Hashsets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> hs = new HashSet<>();

        int t = scan.nextInt();
        String []left = new String[t];
        String []right = new String[t];

        for (int i=0; i<t; i++) {
            left[i] = scan.next();
            right[i] = scan.next();
            hs.add("{"+left[i]+", "+right[i]+"}");
            System.out.println(hs.size());
        }
//        System.out.println(hs);
    }
}
