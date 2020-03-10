package com.zipcodewilmington.singlylinkedlist;

public class Node<T> {

    private int data;
    public Node<T> next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public String toString(){
        return data + "";
    }

}
