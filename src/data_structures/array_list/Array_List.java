
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Input for no. of test cases */
        int n = sc.nextInt();

        /* creating separate lines */
        String s = sc.nextLine();

        /* Creating a ArrayList */
        ArrayList<ArrayList<String>> array = new ArrayList<ArrayList<String>>(n);

        for (int i=0; i<n; i++) {
            s = sc.nextLine();
            array.add(i, new ArrayList<String>(Arrays.asList(s.split("\\s"))));
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x <= array.size() && y < array.get(x-1).size() && y >= 0) {
                System.out.println(array.get(x-1).get(y));
            }
            else {
                System.out.println("ERROR!");
            }
        }

        sc.close();

        // System.out.println(array);
    }
}
