import java.util.Stack;

public class Solution {

    public static String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        char[] arr = s.toCharArray();

        System.out.println("Input: " + s);

        // Traverse the string
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(i);
                System.out.println("Push: " + i);
            } else if (arr[i] == ')') {
                int start = stack.pop();
                System.out.println("Pop: " + start);
                reverse(arr, start + 1, i - 1);
                System.out.println("Reversed: " + new String(arr));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (c != '(' && c != ')') {
                sb.append(c);
            }
        }

        String result = sb.toString();
        System.out.println("Result: " + result);

        return result;
    }

    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
// Title: Reverse Substrings Between Each Pair of Parentheses
