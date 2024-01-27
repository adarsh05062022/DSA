package trees.binarySearchTree.implementation;



import java.util.Scanner;

public class BST {
    private static class Node{
        int value;
        Node left;
        Node right;

        int height;

        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public int getValue(){
            return this.value;
        }
    }

    private Node root;


    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }



    public void insert(int value){

    }




    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            System.out.println(indent + "null");
            return;
        }
        System.out.println(indent + node.getValue());
        System.out.println(indent + "└── Left:");
        display(node.left, indent + "    │  ");
        System.out.println(indent + "└── Right:");
        display(node.right, indent + "     ");
    }
}
