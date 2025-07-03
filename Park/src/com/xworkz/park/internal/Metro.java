package com.xworkz.park.internal;

import com.xworkz.park.external.MetroDTO;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Metro {
    public static void main(String[] args) {

        Collection <MetroDTO> collection = new LinkedList<>();
        collection.add(new MetroDTO("Bangalore","Purple","Attiguppe","KSR",30,3,350,6,7,"online"));
        collection.add(new MetroDTO("Delhi", "Yellow", "Huda City Centre", "Samaypur Badli", 37, 4, 450, 8, 5, "offline"));
        collection.add(new MetroDTO("Mumbai", "Red", "Versova", "Ghatkopar", 20, 2, 300, 5, 4, "online"));
        collection.add(new MetroDTO("Kolkata", "Blue", "Dum Dum", "Kavi Subhash", 30, 3, 320, 6, 6, "offline"));
        collection.add(new MetroDTO("Hyderabad", "Green", "Miyapur", "LB Nagar", 29, 3, 310, 6, 5, "online"));
        collection.add(new MetroDTO("Chennai", "Purple", "Airport", "Washermenpet", 23, 2, 280, 5, 4, "offline"));
        collection.add(new MetroDTO("Lucknow", "Orange", "Charbagh", "Munshipulia", 22, 2, 270, 5, 3, "online"));
        collection.add(new MetroDTO("Nagpur", "Aqua", "Sitabuldi", "Khadgaon", 18, 2, 260, 4, 4, "offline"));
        collection.add(new MetroDTO("Jaipur", "Pink", "Mansarovar", "Chandpole", 12, 1, 200, 3, 2, "online"));
        collection.add(new MetroDTO("Noida", "Magenta", "Botanical Garden", "Janakpuri West", 28, 3, 340, 6, 5, "offline"));

        Iterator<MetroDTO> iterator = collection.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());

        }

    }

}
