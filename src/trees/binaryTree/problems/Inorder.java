package trees.binaryTree.problems;


import trees.binaryTree.implementation.BinaryTree;

import java.util.Scanner;

public class Inorder {
    public static void inorder(BinaryTree.Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.value);
        inorder(root.right);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        inorder(tree.getRoot());

    }
}
