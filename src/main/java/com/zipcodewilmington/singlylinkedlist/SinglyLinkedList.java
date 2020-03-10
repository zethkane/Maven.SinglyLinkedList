package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public SinglyLinkedList(Node<T> data) {
        this.head = data;
    }

    public SinglyLinkedList() {
    }

    public void addNode(int data){
        Node<T> newNode = new Node<T>(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeMethod(){
    }

    public boolean containsMethod(){
        return false;
    }

    public void getMethod(){}

    public Integer sizeMethod(){return null;}

    public void findMethod(){}

    public void copyMethod(){}

    public void sortMethod(){}
}
