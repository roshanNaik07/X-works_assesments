package com.xworkz.park.LinkedList.internal;


import com.xworkz.park.LinkedList.external.TrainNode;

public class TrainRunner {

    public static void main(String[] args) {

        TrainNode node = new TrainNode("Bangalore");
        TrainNode node1 = new TrainNode("Mysore");
        TrainNode node2 = new TrainNode("Mandya");

        node.next = node1;
        node1.next = node2;

        TrainNode currentStation = node;

        while (currentStation!=null){
            System.out.print(currentStation.Station + " --> ");
            currentStation = currentStation.next;
        }

    }

}
