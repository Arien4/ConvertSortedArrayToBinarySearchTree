package practice;

import java.util.Iterator;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

//    public String toString() {
//        StringBuilder sb = new StringBuilder(50);
//        print(sb, "", "");
//        return sb.toString();
//    }
//
//    private void print(StringBuilder buffer, String prefix, String childrenPrefix) {
//        buffer.append(prefix);
//        buffer.append(Integer.toString(val));
//        buffer.append('\n');
//
//        TreeNode node = this;
//        while (node != null) {
//
//            if (node.left != null) {
//                node.print(buffer, childrenPrefix + "├── ", childrenPrefix + "│   ");
//            } else {
//                node.print(buffer, childrenPrefix + "└── ", childrenPrefix + "    ");
//            }
//
//            if (node.right != null) {
//                node.print(buffer, childrenPrefix + "├── ", childrenPrefix + "│   ");
//            } else {
//                node.print(buffer, childrenPrefix + "└── ", childrenPrefix + "    ");
//            }
//        }
//    }


}