import java.util.Stack;

class Solution {
    public boolean canBeValid(String s, String locked) {
        // Check if the string length is odd
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            char lock = locked.charAt(i);

            if (current == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    // Balance a locked '(' with ')'
                    stack.pop();
                } else if (lock == '0') {
                    // Treat unlocked ')' as '(' to allow flexibility
                    stack.push('(');
                } else {
                    return false; // No way to balance
                }
            } else if (current == '(') {
                if (lock == '0' && !stack.isEmpty() && stack.peek() == '(') {
                    // Use unlocked '(' to balance another '('
                    stack.pop();
                } else {
                    stack.push(current);
                }
            }
        }

        // If the stack is empty, the string is balanced
        return stack.isEmpty();
    }
}

// Title: Check if a Parentheses String Can Be Valid
