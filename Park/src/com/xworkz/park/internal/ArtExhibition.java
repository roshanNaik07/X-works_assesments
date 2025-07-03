package com.xworkz.park.internal;

import com.xworkz.park.external.ArtDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArtExhibition {

    public static void main(String[] args) {

        Collection<ArtDTO> collection = new ArrayList<>();

        collection.add(new ArtDTO("Kala","Bangalore","Solo","Roshan","Mansoon","Watercolor",30000,"Canvas","12 X 15",true));
        collection.add(new ArtDTO("Rang","Mysore","Group","Sneha","Spring","Oil",45000,"Canvas","24 X 36",false));
        collection.add(new ArtDTO("Chitra","Bangalore","Solo","Arjun","Autumn","Acrylic",28000,"Wood","18 X 24",true));
        collection.add(new ArtDTO("KalaRasa","Hubli","Group","Kavya","Winter","Ink",35000,"Paper","16 X 20",true));
        collection.add(new ArtDTO("Rupak","Mangalore","Solo","Rohan","Summer","Mixed Media",40000,"Canvas","20 X 30",false));
        collection.add(new ArtDTO("Aakruti","Bangalore","Group","Priya","Dawn","Charcoal",25000,"Paper","14 X 18",true));
        collection.add(new ArtDTO("Shilpa","Udupi","Solo","Vikas","Twilight","Pastel",32000,"Canvas","22 X 28",false));
        collection.add(new ArtDTO("Kalpana","Belgaum","Group","Meera","Evening","Watercolor",27000,"Wood","15 X 20",true));
        collection.add(new ArtDTO("Chayachitra","Dharwad","Solo","Deepak","Night","Acrylic",36000,"Canvas","19 X 25",false));
        collection.add(new ArtDTO("Roop","Bangalore","Group","Nisha","Monsoon","Oil",42000,"Paper","21 X 29",true));

        Iterator<ArtDTO> iterator = collection.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }


}
