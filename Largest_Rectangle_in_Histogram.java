class Solution {
    public int largestRectangleArea(int[] heights) {
         int size = heights.length;
        int max = 0;
        int[] Lsmall = new int[size];
        int[] Rsmall = new int[size];
        
        smaller_right(heights, Rsmall);
        smaller_Left(heights, Lsmall);
        
        for(int i = 0; i < size; i++){
            int height = heights[i];
            int width = Rsmall[i] - Lsmall[i] - 1;
            int area = height * width;
            if(area > max){
                max = area;
            }
        }
        return max;
        
    }

    //right small
     public static void smaller_right(int[] heights, int[] Rsmall){
        Stack<Integer> s1 = new Stack<>();
        for(int i = heights.length - 1; i >= 0; i--){
            while(!s1.isEmpty() && heights[i] < heights[s1.peek()]){
                s1.pop();
            }
            if(s1.isEmpty()){
                Rsmall[i] = heights.length;
            } else {
                Rsmall[i] = s1.peek();
            }
            s1.push(i);
        }
     }
        //left small
         public static void smaller_Left(int[] heights, int[] Lsmall){
        Stack<Integer> s1 = new Stack<>();
        for(int i = 0; i < heights.length; i++){
            while(!s1.isEmpty() && heights[i] < heights[s1.peek()]){
                s1.pop();
            }
            if(s1.isEmpty()){
                Lsmall[i] = -1;
            } else {
                Lsmall[i] = s1.peek();
            }
            s1.push(i);
        }
    }

    }
