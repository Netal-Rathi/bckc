class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new ArrayList<>();

        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        check(digits, map, 0, ans, sb);
        return ans;
    }

    public void check(String digits, HashMap<Integer, String> map, int no, List<String> ans, StringBuilder sb) {
        if (no == digits.length()) {
            ans.add(sb.toString());
            return;
        }

        int digit = digits.charAt(no) - '0';
        String letters = map.get(digit);

        if (letters != null) {
            for (int i = 0; i < letters.length(); i++) {
                sb.append(letters.charAt(i));
                check(digits, map, no + 1, ans, sb);
                sb.deleteCharAt(sb.length() - 1); // backtrack
            }
        }
    }
}

// Title: Letter Combinations of a Phone Number
