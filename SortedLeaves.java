import java.util.*;
public class SortedLeaves {
        public String[] values(TreeNode tree) {
            if (tree == null) return new String[0];
            if (tree.left == null && tree.right == null){
                return new String[] {String.valueOf((char) tree.info)};
            }
            String[] left = values(tree.right);
            String[] right = values(tree.left);

            ArrayList<String> mer = new ArrayList<>();
            for (String s : left) mer.add(s);
            for (String s:right) mer.add(s);
            Collections.sort(mer);
            return mer.toArray(new String[0]);
        }
    }