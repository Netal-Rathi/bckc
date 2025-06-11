public class Codec {

    public String serialize(TreeNode root) {
        if (root == null) return "null";

        StringBuilder ans = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node == null) {
                ans.append("null,");
                continue;
            }
            ans.append(node.val).append(",");
            q.offer(node.left);
            q.offer(node.right);
        }

        return ans.toString();
    }


    public TreeNode deserialize(String data) {
        if (data.equals("null")) return null;

        String[] arr = data.split(",");
        int i = 0;
        TreeNode root = new TreeNode(Integer.parseInt(arr[i++]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty() && i < arr.length) {
            TreeNode node = q.poll();

            
            if (!arr[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(arr[i]));
                q.offer(node.left);
            }
            i++;

            // Right child
            if (i < arr.length && !arr[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(arr[i]));
                q.offer(node.right);
            }
            i++;
        }

        return root;
    }
}
