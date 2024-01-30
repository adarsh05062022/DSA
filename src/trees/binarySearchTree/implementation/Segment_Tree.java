package trees.binarySearchTree.implementation;

public class Segment_Tree {

    private static class Node{
        int data;
        int startInterval,endInterval;
        Node left,right;




        public Node(int startInterval,int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;

        }


    }

    private Node root;

    public Segment_Tree(int[] arr){
        this.root = constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr,int start,int end){
        if(start==end){
            // leaf node
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }

        // create the node with the index you are at

        Node node = new Node(start,end);

        int mid = start + (end-start)/2;

        node.left = this.constructTree(arr,start,mid);
        node.right = this.constructTree(arr,mid+1,end);

        node.data = node.left.data+node.right.data;
        return node;
    }

    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str = "";

        if(node.left!=null){
            str = str + "Interval=["+ node.left.startInterval+" - "+node.left.endInterval+"] and data : "+ node.left.data;
        }
        else {
            str = str+"No left child";
        }

        // for current node

        str = str + "Interval=["+ node.startInterval+" - "+node.endInterval+"] and data : "+ node.data;


        if(node.right!=null){
            str = str + "Interval=["+ node.right.startInterval+" - "+node.right.endInterval+"] and data : "+ node.right.data;
        }
        else {
            str = str+" No right child";
        }

        System.out.println(str);

        // recursion

        if(node.left!=null){
            display(node.left);
        }
        if(node.right!=null){
            display(node.right);
        }
    }

    // query

    public int query(int qsi,int qei){
        return query(this.root,qsi,qei);
    }

    private int query(Node node,int qsi,int qei){
           if(node.startInterval>=qsi && node.endInterval<=qei){
               // node completely lying in the query
               return node.data;
           } else if (node.startInterval > qei || node.endInterval < qsi) {
               return 0;
           }
           else {
               return this.query(node.left,qsi,qei) + this.query(node.right,qsi,qei);
           }
    }
    // update
    public void update(int index,int value){
        this.root.data = update(this.root,index,value);
    }

    private int update(Node node,int index ,int value){
        if(index>=node.startInterval && index<=node.endInterval){
            if(index==node.startInterval && index==node.endInterval){
                  node.data = value;
                  return node.data;
            }else {
                int leftAnswer = update(node.left,index,value);
                int rightAnswer = update(node.right,index,value);

                node.data = leftAnswer+rightAnswer;
                return node.data;

            }
        }
        return node.data;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        Segment_Tree tree = new Segment_Tree(arr);
//        tree.display();
        System.out.println(tree.query(2,5));
        tree.update(2,10);
        System.out.println(tree.query(2,5));

    }


}
