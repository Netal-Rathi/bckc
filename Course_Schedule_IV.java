class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<Boolean> ans = new ArrayList<>();
        for (int query[] : queries) {
            ans.add(dfs(prerequisites, query[1], query[0]));
        }
        return ans;

    }

    public Boolean dfs(int[][] p, int s, int t) {

        for (int arr[] : p) {
            if (arr[1] == s) {
                if (arr[0] == t) {
                    return true;
                 //   break;
                } else {
                   if( dfs(p, arr[0], t)){
                    return true;
                   }
                }

            }
        }
        return false;
    }
}
// Title: Course Schedule IV
