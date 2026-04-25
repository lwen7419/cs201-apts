public class HeightLabel {
        public TreeNode rewire(TreeNode t) {
            if (t == null) return null;
            
            TreeNode left = rewire(t.left);
            TreeNode right = rewire(t.right);

            int height = 1 + Math.max(
                left == null ? 0: left.info,
                right == null ? 0 : right.info
            );
            return new TreeNode(height,left,right);
        }
    }