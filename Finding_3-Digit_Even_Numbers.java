class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Arrays.sort(digits);
        List<Integer> list=new ArrayList<>();

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] % 2 == 0) {
                for (int j = 0; j < digits.length - 1; j++) {

                    for (int k = j + 1; k < digits.length; k++) {
                        if (i != j && i!=k) {
                            if (digits[j] != 0) {
                                int num1=digits[j] * 100 + digits[k] * 10 + digits[i];
                                if(!list.contains(num1)){
                                list.add(num1);
                                }
                            }
                            if (digits[k] != 0) {
                                int num2=digits[k] * 100 + digits[j] * 10 + digits[i];

                                if(!list.contains(num2)){
                                list.add(num2);
                                }
                            }
                        }

                    }
                }
            }
        }
        Collections.sort(list);
        int ans[]=list.stream().mapToInt(i->i).toArray();
        return ans;
        
        

    }
}
// Title: Finding 3-Digit Even Numbers
