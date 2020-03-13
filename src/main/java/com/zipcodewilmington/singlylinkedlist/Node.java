package com.zipcodewilmington.singlylinkedlist;

public class Node<T> {

    private T data;
    public Node next;
    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Node(T data){
        this.data = data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    public String toString(){
        return data + "";
    }

}
