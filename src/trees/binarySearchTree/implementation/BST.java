package trees.binarySearchTree.implementation;



import java.util.Scanner;

public class BST {
    private static class Node{
        private int value;
        private Node left;
        private Node right;

        private int height;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }
    }

    private Node root;

    public BST(){


    }

    private int height(Node node){
       return node==null?-1:node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void insert(int value){
        root = insert(value,root);
    }


    private  Node insert(int value,Node node){
        if(node==null){
            node = new Node(value);
            return node;
        }
        if(value< node.getValue()){
            node.left = insert(value,node.left);
        }else {
            node.right  = insert(value, node.right);
        }

        node.height = Math.max(height(node.left),height(node.right))+1;

        return node;
    }


public boolean balanced(){
        return balanced(root);
}

private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1  && balanced(node.left) && balanced(node.right);
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

    public void populate(int[] nums){
        for(int i:nums){
            insert(i);
        }
    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");

    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 3, 1};

        BST tree = new BST();

        tree.populate(arr);
//         tree.display();

//        System.out.println(tree.balanced());
//        System.out.println(tree.isEmpty());

        tree.inOrder();
        System.out.println();
        tree.preOrder();
        System.out.println();
        tree.postOrder();
    }


}
