import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String numberToWords(int num) {
        List<Integer> numbers = Arrays.asList(
            1000000000, 1000000, 1000, 100, 90, 80, 70, 60, 50, 40, 30, 20,
            19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
        );

        List<String> words = Arrays.asList(
            "Billion", "Million", "Thousand", "Hundred", "Ninety", "Eighty",
            "Seventy", "Sixty", "Fifty", "Forty", "Thirty", "Twenty",
            "Nineteen", "Eighteen", "Seventeen", "Sixteen", "Fifteen", "Fourteen",
            "Thirteen", "Twelve", "Eleven", "Ten", "Nine", "Eight", "Seven",
            "Six", "Five", "Four", "Three", "Two", "One"
        );

        if (num == 0) return "Zero";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numbers.size(); i++) {
            if (num >= numbers.get(i)) {
                if (num >= 100) {
                    result.append(numberToWords(num / numbers.get(i))).append(" ").append(words.get(i)).append(" ");
                } else {
                    result.append(words.get(i)).append(" ");
                }

                num %= numbers.get(i);

                if (num == 0) break;
            }
        }

        return result.toString().trim();
    }

  
}
