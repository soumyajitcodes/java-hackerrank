package strings.introduction;

import java.util.Scanner;

public class StringsIntroduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String A2 = A.substring(0, 1).toUpperCase() + A.substring(1, A.length());
        String B2 = B.substring(0, 1).toUpperCase() + B.substring(1, B.length());

        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0? "Yes":"No");
        System.out.println(A2+" "+B2);
    }
}
