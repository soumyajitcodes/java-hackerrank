package strings.string_reverse;

import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = "";

        char[] C = A.toCharArray();

        for (int i = C.length - 1; i >= 0; i--) {
            B += C[i];
        }
        if (A.equalsIgnoreCase(B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
