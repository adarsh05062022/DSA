package trees.binarySearchTree.implementation;

public class AVL_Tree {

    private class Node {
        private int value,height;
        private Node left,right;

        public Node(int value){
            this.value = value;
        }
    }

    public AVL_Tree(){

    }


    private Node root;

    public int getHeight() {
        return getHeight(root);
    }
    private int getHeight(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public void insert(int value){
       root =  insert(root,value);
    }

    private Node insert(Node node,int value){
        if(node==null){
            node = new Node(value);
            return node;
        }
        if(value<node.value){
            node.left = insert(node.left,value);
        }
        if(value>node.value){
            node.right = insert(node.right,value);
        }

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        return rotate(node);

    }

    private Node rotate(Node node){

        if(getHeight(node.left)-getHeight(node.right)>1){
            // left heavy
            if(getHeight(node.left.left)-getHeight(node.left.right)>0){
                // left_left rotation
                return rightRotate(node);

            }
            if(getHeight(node.left.left)-getHeight(node.left.right)<0){
                // left_right rotation
                node.left = leftRotate(node.left);
                return rightRotate(node);

            }
        }
        if(getHeight(node.left)-getHeight(node.right)<-1){
            // left heavy
            if(getHeight(node.right.left)-getHeight(node.right.right)<0){
                // right_right rotation

                return leftRotate(node);

            }
            if(getHeight(node.right.left)-getHeight(node.right.right)>0){
                // right_left rotation
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }




        return node;
    }


    private Node leftRotate(Node c){

        Node p = c.right;
        Node temp = p.left;

        p.left = c;
        c.right =temp;

        c.height = Math.max(getHeight(c.left),getHeight(c.right))+1;
        p.height = Math.max(getHeight(p.left),getHeight(p.right))+1;

        return p;
    }
    private Node rightRotate(Node p){
        Node c = p.left;
        Node temp = c.right;

        c.right = p;
        p.left = temp;

        p.height = Math.max(getHeight(p.left),getHeight(p.right))+1;
        c.height = Math.max(getHeight(c.left),getHeight(c.right))+1;

        return c;
    }


    public boolean isBalanced(){
       return isBalanced(root);
    }

    private boolean isBalanced(Node node){
        if(node==null ){
            return true;
        }
        return Math.abs(getHeight(node.left)-getHeight(node.right))<=1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            System.out.println(indent + "null");
            return;
        }
        System.out.println(indent + node.value);
        System.out.println(indent + "└── Left:");
        display(node.left, indent + "    │  ");
        System.out.println(indent + "└── Right:");
        display(node.right, indent + "     ");
    }

    public void populate(int[] num){
        for(int i:num){
            insert(i);
        }
    }


    public static void main(String[] args) {
        AVL_Tree tree = new AVL_Tree();

        int[] arr = {1,2,3,4,5,6,7,8};
        tree.populate(arr);
        System.out.println(tree.isBalanced());
        tree.display();
    }


}
