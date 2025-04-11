class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map1.put(t.charAt(i), map1.getOrDefault(t.charAt(i), 0) + 1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        int start = 0, res = 0, valid = 0, left = 0;
        //   String min_req="";
        int min_len = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char d = s.charAt(i);
            //  if (t.contains(String.valueOf(d)))
            if (map1.containsKey(d)) {
                map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0) + 1);
                if (map2.get(s.charAt(i)).equals(map1.get(s.charAt(i)))) {
                    valid++;
                }
            }

            while (valid == map1.size()) {

                if (i - start + 1 < min_len) {
                    min_len = i - start + 1;
                    left = start;
                }
                //   left=start;
                char l = s.charAt(start);
                if (map1.containsKey(l)) {
                    if (map2.containsKey(l)) {
                        map2.put(l, map2.get(l)-1);
                        // if (map2.get(s.charAt(start)) == 0) {
                        //     map2.remove(s.charAt(start));
                        // }

                        if (map2.get(l) < map1.get(l)) {
                            valid--;
                        }
                    }

                }
                start++;
            }

        }
        System.out.println(min_len);
        return min_len == Integer.MAX_VALUE ? "" : s.substring(left, left + min_len);
    }
}