package com.zipcodewilmington.singlylinkedlist;

import com.sun.tools.internal.xjc.model.CElement;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    private Node head;
    private Node tail;
    private Integer length;

    public SinglyLinkedList(Node data) {
        this.head = data;
    }

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void addNode(T element){
        Node<T> newNode = new Node<T>(element);
        if (head == null){
            head = newNode;
            tail = newNode;
            newNode.setIndex(0);
        }
        else {
            tail.next = newNode;
            tail = newNode;
            newNode.setIndex(sizeMethod());
        }
        length++;
    }

    public void removeMethod(int index){
        if (index == 0){
            Node newHead = head.getNext();
            head.setNext(null);
            head = newHead;
            head.setIndex(0);
        }
        if (index != 0 ){
            for (int i = index; i < sizeMethod() ; i++) {
               // getMethod(i) = getMethod(i + 1);
            }
        }

    }

    public boolean containsMethod(T object){
        Node<T> tempNode = head;
        if (head == null){
            return false;
        } else {
            for (int i = 0; i < this.sizeMethod() ; i++) {
                if(tempNode.getData() == object){
                    return true;
                } else {
                    tempNode = tempNode.getNext();
                }
            }
        }
        return false;
    }

    public T getMethod(int index){
        Node<T> tempNode = head;
        if (head == null) {
            return null;
        } else {
        for (int i = 0; i < this.sizeMethod() ; i++) {
            if (tempNode.getIndex() == index){
                return tempNode.getData();
            } else {
                tempNode = tempNode.getNext();
            }

            }}

        return null;
    }

    public Integer sizeMethod(){return length;}

    public void findMethod( T data){
    }

    public void copyMethod(){}

    public void sortMethod(){}
}
