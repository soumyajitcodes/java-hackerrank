package strings.pattern_syntax_checker;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while(testCases>0) {
            String reg_text = sc.nextLine();

            try {
                Pattern.compile(reg_text);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
