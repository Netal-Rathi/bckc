class Solution {
    void buildTree(int[][] points, int depth, int i, int j) {
        if (j - i <= 1) {
            return;
        }
        int k = (1-depth) & 1; 
        int m = i + (j - i) / 2;

        Arrays.sort(points, i, j, (a, b) -> Integer.compare(a[k], b[k])); 

        buildTree(points, depth + 1, i, m);
        buildTree(points, depth + 1, m + 1, j);
    }

    boolean isPointInside(int[] point, int[] circle) {
        return (point[0] - circle[0]) * (point[0] - circle[0]) + (point[1] - circle[1]) * (point[1] - circle[1]) <= circle[2] * circle[2];
    }

    int pointsInside(int[][] tree, int[] query, int depth, int i, int j) {
        if (j == i) {
            return 0;
        }
        else if (j - i == 1){ 
            return isPointInside(tree[i], query) ? 1 : 0;
        }

        int k = 1 - depth & 1;
        int m = i + (j - i) / 2;
        int diff = tree[m][k] - query[k];
        if (diff > query[2]) {
            return pointsInside(tree, query, depth + 1, i, m);
        } else if (diff < -query[2]) {
            return pointsInside(tree, query, depth + 1, m + 1, j);
        } else {
            return pointsInside(tree, query, depth + 1, i, m) + (isPointInside(tree[m], query) ? 1 : 0)  + pointsInside(tree, query, depth + 1, m + 1, j);
        }
    }

    public int[] countPoints(int[][] points, int[][] queries) {
     
         System.out.println();
        buildTree(points, 0, 0, points.length);
        for(int i=0;i<points.length;i++){
            for(int j=0;j<points[0].length;j++){
                System.out.print(points[i][j]);
            }
        }
        System.out.println();
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = pointsInside(points, queries[i], 0, 0, points.length);
        }
        return result;
    }
}