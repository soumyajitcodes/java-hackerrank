package introduction.stdin_stdout;

import java.util.Scanner;

public class StdinStdout02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String str = sc.nextLine();
        sc.close();

        System.out.print("String: " + str);
        System.out.println();
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
