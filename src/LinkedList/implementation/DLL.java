package LinkedList.implementation;

public class DLL extends LL{

    private static class Node{
        int value;
        Node next;
        Node prev;


        public Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;


    int size =0;




    public void insertFirst(int val){
        Node temp = new Node(val);
        temp.next = head;
        head.prev = temp;
        head = temp;
        if(size==0){
            tail=head;
        }
        size++;
    }
    public void insertEnd(int val){
        Node temp = new Node(val);
        tail.next=temp;
        temp.prev = tail;
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
        temp.prev = p;
        (p.next).prev = temp;
        p.next=temp;
        size++;

    }

    public int deleteFirst(){
        if(size==0){
            return -1;
        }
        int retValue = head.value;
        head = head.next;
        head.prev = null;
        size--;

        return retValue;
    }
    public int deleteEnd(){
        if(size==0){
            return -1;
        }
        int retValue = tail.value;

        tail = tail.prev;
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
        p.next.next.prev = (p.next).prev;
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

        list.insertFirst(10);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(5);
        list.insertFirst(9);
        list.insertEnd(83);
        list.insert(3,11);
        list.deleteFirst();
        list.deleteEnd();
        list.deleteByPosition(2);
        list.deleteByValue(5);
//        System.out.println(list.getValue(4));
        System.out.println(list.getIndex(8));


        list.display();
//        System.out.println(list.size);
    }

}
