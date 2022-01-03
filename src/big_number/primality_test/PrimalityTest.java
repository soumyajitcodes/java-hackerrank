package big_number.primality_test;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();

        if (n.isProbablePrime(100)) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
