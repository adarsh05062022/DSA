package trees.binaryTree.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int data) {
        this.val = data;
        left = right = null;
    }
}

public class preOrderTraversal {
    public static void main(String[] args) {

    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();

        if(root==null){
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()){
            TreeNode topNode = stack.peek();
            list.add(topNode.val);
            stack.pop();
            if(topNode.right!=null){
                stack.push(topNode.right);
            }
            if(topNode.left!=null){
                stack.push(topNode.left);
            }
           
        }
        return list;

    }
}
