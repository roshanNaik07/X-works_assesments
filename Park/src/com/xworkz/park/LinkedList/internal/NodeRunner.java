package com.xworkz.park.LinkedList.internal;

import com.xworkz.park.LinkedList.external.Node;

public class NodeRunner {

    public static void main(String[] args) {

        Node node = new Node("Roshan");
        Node node1 = new Node("Rishi");
        Node node2 = new Node("Vaibhav");

        node.next = node1;
        node1.next = node2;

        Node currentNode = node;

        while (currentNode!=null){
            System.out.print(currentNode.value + " --> ");
            currentNode = currentNode.next;
        }
    }
}
