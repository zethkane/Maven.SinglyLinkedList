package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addNodeTest(){
        SinglyLinkedList mylist = new SinglyLinkedList();
        int data = 4;
        int data2 = 15;
        int data3 = 24;
        mylist.addNode(data);
        mylist.addNode(data2);
        mylist.addNode(data3);

    }

}
