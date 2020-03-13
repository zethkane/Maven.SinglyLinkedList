package com.zipcodewilmington.singlylinkedlist;

import com.sun.tools.internal.xjc.model.CElement;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    private Node head;
    private Node tail;
    private int length;

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
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public T removeMethod(int index){
        for (int i = 0; i < index ; i++) {
//            if (index !=)
        }
        return null;
    }

    public boolean containsMethod(T object){
        return false;
    }

    public T getMethod(int index){
        //for (int i = 0; i <  ; i++) {

        //}
        return null;
    }

    public Integer sizeMethod(){return null;}

    public void findMethod(){}

    public void copyMethod(){}

    public void sortMethod(){}
}
