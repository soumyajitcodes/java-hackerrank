package data_structures.array_1d;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] array = new int[n];
        for(int i=0; i<n; i++) {
            array[i] = scan.nextInt();
        }

        for(int i=0; i<n; i++) {
            System.out.println(array[i]);
        }
    }
}
