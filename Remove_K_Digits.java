class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        // if you remove all or more digits than length, result is "0"
        if (k >= n) return "0";

        Deque<Character> stack = new ArrayDeque<>();
        for (char c : num.toCharArray()) {
            // 1) Greedy pop
            while (!stack.isEmpty() && k > 0 && stack.peekLast() > c) {
                stack.removeLast();
                k--;
            }
            // 2) Push current
            stack.addLast(c);
        }
        // 3) Pop any remaining from end
        while (k > 0) {
            stack.removeLast();
            k--;
        }
        // 4) Build result and strip leading zeros
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.removeFirst());
        }
        // remove leading '0's
        int idx = 0;
        while (idx < sb.length() && sb.charAt(idx) == '0') {
            idx++;
        }
        String res = sb.substring(idx);
        return res.isEmpty() ? "0" : res;
    }
}
