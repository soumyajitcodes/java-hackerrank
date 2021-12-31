package introduction.stdin_stdout;

import java.util.Scanner;

public class StdinStdout01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int myInt1 = scan.nextInt();
        int myInt2 = scan.nextInt();
        int myInt3 = scan.nextInt();
        scan.close();

        System.out.println(myInt1);
        System.out.println(myInt2);
        System.out.println(myInt3);
    }
}
