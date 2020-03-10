package com.zipcodewilmington.singlylinkedlist;

public class Node<T> {

    private T data;
    public Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }

    public String toString(){
        return data + "";
    }

}
