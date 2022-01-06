//import java.util.*;
//import java.util.regex.*;
//
//// Write your code here. DO NOT use an access modifier in your class declaration.
//
//class Parser{
//    static boolean isBalanced(String s)
//    {
//        Stack<Character> stack = new Stack<Character>();
//        for (int i=0; i<s.length();++i){
//            if (s.charAt(i) == '(') stack.push('(');
//            else if (s.charAt(i) == '{') stack.push('{');
//            else if (s.charAt(i) == '[') stack.push('[');
//            else if (s.charAt(i) == ')') {
//                if (stack.isEmpty()) return false;
//                if (stack.pop() != '(') return false;
//            }
//            else if (s.charAt(i) == '}') {
//                if (stack.isEmpty()) return false;
//                if (stack.pop() != '{') return false;
//            }
//            else if (s.charAt(i) == ']') {
//                if (stack.isEmpty()) return false;
//                if (stack.pop() != '[') return false;
//            }
//        }
//        return stack.isEmpty();
//    }
//
//}
//class Solution {
//
//    public static void main(String[] args) {
//        Parser parser = new Parser();
//
//        Scanner in = new Scanner(System.in);
//
//        while (in.hasNext()) {
//            System.out.println(parser.isBalanced(in.next()));
//        }
//
//        in.close();
//    }
//}
//
//public class Braces {
//}
