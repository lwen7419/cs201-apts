public class PathSum {
        public int hasPath(int target, TreeNode tree){
            if (tree == null) return 0;

            if (tree.left == null&&tree.right == null){
                return (tree.info==target) ? 1:0;
            }

            int remain = target-tree.info;
            if(hasPath(remain, tree.left)==1) return 1;
            if (hasPath(remain, tree.right)==1) return 1;
            return 0;
        }
    }