public class UniqueTreeValues {
        public int[] unique(TreeNode root) {
            Set<Integer> seen = new HashSet<>();
            collectValues(root, seen);

            ArrayList<Integer> sorted = new ArrayList<>(seen);
            Collections.sort(sorted);

            int[] result = new int[sorted.size()];
            for (int i = 0, i < sorted.size(); i++){
                result[i] = sorted.get(i);
            }
            return result;
        }
        public void CollectValues(TreeNode node, Set<Integer> seen){
            if (node == null) return;
            seen.add(node.val);
            collectValues(node.left, seen);
            collectValues(node.right, seen);
        }
    }