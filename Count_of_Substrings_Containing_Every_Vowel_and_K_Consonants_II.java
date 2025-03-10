class Solution {
    public long countOfSubstrings(String word, int k) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            int temp = k;
            for (int j = i; j < word.length(); j++) {
                if (word.charAt(j) == ('a') || word.charAt(j) == ('e') || word.charAt(j) == ('i')
                        || word.charAt(j) == ('o') || word.charAt(j) == ('u')) {
                    map.put(word.charAt(j), map.getOrDefault(word.charAt(j), 0) + 1);
                } else {
                    temp--;
                }
                if (temp == 0 && (map.containsKey('a') && map.containsKey('e') && map.containsKey('i')
                        && map.containsKey('o') && map.containsKey('u'))) {
                    count++;
                    
                }
            }
        }
        return count;

    }
}