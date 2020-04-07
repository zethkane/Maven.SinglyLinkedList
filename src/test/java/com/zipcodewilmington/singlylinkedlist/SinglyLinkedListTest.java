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
        SinglyLinkedList<Integer> mylist = new SinglyLinkedList();
        int data = 4;
        int data2 = 15;
        int data3 = 24;
        mylist.addNode(data);
        mylist.addNode(data2);
        mylist.addNode(data3);

        Assert.assertTrue( mylist.sizeMethod() == 3);

    }


    @Test
    public void containsTest(){
        SinglyLinkedList mylist = new SinglyLinkedList();
        int data = 4;
        int data2 = 32;
        int data3 = 54;

        mylist.addNode(data);
        mylist.addNode(data2);
        mylist.addNode(data3);

        Assert.assertTrue(mylist.containsMethod(data3));

    }

    @Test
    public void getMethodTest(){
        SinglyLinkedList myList = new SinglyLinkedList<Integer>();
        int data = 4;
        int data2 = 21;
        int data3 = 43;

        myList.addNode(data);
        myList.addNode(data2);
        myList.addNode(data3);

        int expected = data3;

        Assert.assertEquals(data3, myList.getMethod(2));
    }

    @Test
    public void findTest(){
        SinglyLinkedList myList = new SinglyLinkedList<Integer>();
        int data = 4;
        int data2 = 21;
        int data3 = 43;

        myList.addNode(data);
        myList.addNode(data2);
        myList.addNode(data3);

        int expected = 1;

        Assert.assertEquals(expected, myList.findMethod(data2));
    }
}
