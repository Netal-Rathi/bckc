class Solution {
    public char processStr(String s, long k) {
        List<Character> sb = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '#') {
                if ((long)sb.size() * 2 > k + 1) break; // prevent MLE
                List<Character> copy = new ArrayList<>(sb);
                sb.addAll(copy);
            } else if (ch == '%') {
                Collections.reverse(sb);
            } else if (ch == '*') {
                if (!sb.isEmpty()) sb.remove(sb.size() - 1);
            } else {
                sb.add(ch);
            }

            if (sb.size() > k) break;
        }

        return k < sb.size() ? sb.get((int)k) : '.';
    }
}
