import java.util.*;

class Solution {
    public String countOfAtoms(String formula) {
        Stack<Map<String, Integer>> stack = new Stack<>();
        Map<String, Integer> currentMap = new HashMap<>();
        int i = 0, n = formula.length();

        while (i < n) {
            char c = formula.charAt(i);

            if (c == '(') {
                stack.push(currentMap);
                currentMap = new HashMap<>();
                i++;
            } else if (c == ')') {
                i++;
                int start = i;
                int multiplier = 1;

                while (i < n && Character.isDigit(formula.charAt(i))) {
                    i++;
                }

                if (i > start) {
                    multiplier = Integer.parseInt(formula.substring(start, i));
                }

                if (!stack.isEmpty()) {
                    Map<String, Integer> tempMap = currentMap;
                    currentMap = stack.pop();
                    for (String key : tempMap.keySet()) {
                        currentMap.put(key, currentMap.getOrDefault(key, 0) + tempMap.get(key) * multiplier);
                    }
                }
            } else {
                int start = i;
                i++;

                while (i < n && Character.isLowerCase(formula.charAt(i))) {
                    i++;
                }

                String element = formula.substring(start, i);
                start = i;

                while (i < n && Character.isDigit(formula.charAt(i))) {
                    i++;
                }

                int count = (i > start) ? Integer.parseInt(formula.substring(start, i)) : 1;
                currentMap.put(element, currentMap.getOrDefault(element, 0) + count);
            }
        }

        StringBuilder result = new StringBuilder();
        List<String> keys = new ArrayList<>(currentMap.keySet());
        Collections.sort(keys);

        for (String key : keys) {
            result.append(key);
            int count = currentMap.get(key);
            if (count > 1) {
                result.append(count);
            }
        }

        return result.toString();
    }
}

// Title: Number of Atoms
