package LinkedList.implementation;

public class SLL extends LL{

   private static class Node{
       int value;
       Node next;

       public Node(int value) {
           this.value = value;
           this.next = null;
       }
   }

   private Node head;
    private Node tail;


   int size =0;




    public void insertFirst(int val){
     Node temp = new Node(val);
     temp.next = head;
     head = temp;
        if(size==0){
            tail=head;
        }
     size++;
    }
    public void insertEnd(int val){
        Node temp = new Node(val);
        tail.next=temp;
        tail=temp;
        size++;
    }
    public void insert(int position,int val){

        if (position==1){
            insertFirst(val);
            return;
        }
        if(position==size){
            insertEnd(val);
            return;
        }
        Node temp = new Node(val);
        Node p = head;
        for(int i=0;i<position-2;i++){
            p = p.next;
        }
        temp.next = p.next;
        p.next=temp;
        size++;

    }

     public int deleteFirst(){
        if(size==0){
            return -1;
        }
        int retValue = head.value;
        head = head.next;
         size--;

        return retValue;
     }
     public int deleteEnd(){
         if(size==0){
             return -1;
         }
         int retValue = tail.value;
         Node p =head;
         for(int i=0;i<size-1;i++){
             p=p.next;
         }
         tail = p;
         tail.next = null;

         size--;
         return retValue;


     }
     public int deleteByPosition(int position){
        if(position==1){
            return deleteFirst();
        }
         if(position==size){
             return deleteEnd();
         }
         Node p =head;
         for(int i=0;i<position-2;i++){
             p = p.next;
         }

         int value = (p.next).value;
         p.next = (p.next).next;
         size--;
         return value;

     }
     public int deleteByValue(int val){
        Node p =head;
        for(int i=0;i<size;i++){
            if(p.value==val){
                return deleteByPosition(i+1);
            }
            p = p.next;
        }
         return -1;

     }


     public int getValue(int position){
        if(position>size){
            return -1;
        }
        Node p = head;
        for(int i=0;i<position-2;i++){
            p = p.next;
        }
         return p.value;

     }
     public int getIndex(int value){
         Node p =head;
         for(int i=0;i<size;i++){
             if(p.value==value){
                 return i;
             }
             p = p.next;
         }
         return -1;


     }
     public void display(){
        Node p = head;
         for (int i = 0; i < size; i++) {
             System.out.print(p.value+", ");
             p=p.next;
         }
     }
     public int size(){
         return size;

     }


    public static void main(String[] args) {
        SLL list = new SLL();

        // Test Case 1: Insert at the beginning and end
        list.insertFirst(10);
        list.insertFirst(5);
        list.insertEnd(15);
        list.display();  // Expected Output: 5, 10, 15

        // Test Case 2: Insert at a specific position
        list.insert(2, 8);
        list.insert(3, 12);
        list.display();  // Expected Output: 5, 8, 12, 10, 15

        // Test Case 3: Delete from the beginning and end
        list.deleteFirst();
        list.deleteEnd();
        list.display();  // Expected Output: 8, 12, 10

        // Test Case 4: Delete at a specific position
        list.deleteByPosition(2);
        list.display();  // Expected Output: 8, 10

        // Test Case 5: Delete by value
        list.deleteByValue(10);
        list.display();  // Expected Output: 8

        // Test Case 6: Get value at a specific position
        System.out.println("Value at position 1: " + list.getValue(1));  // Expected Output: 8

        // Test Case 7: Get index of a value
        System.out.println("Index of value 8: " + list.getIndex(8));  // Expected Output: 0

        // Test Case 8: Display size of the list
        System.out.println("Size of the list: " + list.size());  // Expected Output: 1
    }

}
