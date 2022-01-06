package data_structures.array_1d;

import java.util.Scanner;

public class Array1D_2 {
    public static boolean canWin(int leap, int[] game) {
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int index) {
        if (index<0 || game[index] == 1) {
            return false;
        }

        if (index == game.length-1 || index+leap > game.length-1) {
            return true;
        }

        game[index] = 1;
        return (isSolvable(leap, game, index-1)) ||
                (isSolvable(leap, game, index+1)) ||
                (isSolvable(leap, game, index+leap));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
