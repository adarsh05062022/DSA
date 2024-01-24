package LinkedList.implementation;

abstract public class LL {
    abstract void insertFirst(int data);
    abstract void insertEnd(int data);
    abstract void insert(int position,int data);
    abstract public int deleteFirst();
    abstract public int deleteEnd();
    abstract public int deleteByPosition(int index);
    abstract public int deleteByValue(int value);
    abstract public int getValue(int index);
    abstract public int getIndex(int value);
    abstract public void display();
    abstract public int size();





}
