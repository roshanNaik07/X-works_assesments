package com.xworkz.park.internal;

import com.xworkz.park.external.TrainingDTO;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Training {

    public static void main(String[] args) {

        Collection<TrainingDTO> collection = new LinkedList<>();

        collection.add(new TrainingDTO("X-workz","Rajajinagar","Omkar",2,"Rajajinagar & BTM",15000,"FSD",3,true,60));
        collection.add(new TrainingDTO("TechMinds","BTM Layout","Sneha",1,"BTM & Indiranagar",12000,"Java",2,true,45));
        collection.add(new TrainingDTO("CodeCraft","Whitefield","Arjun",3,"Whitefield & Marathahalli",18000,"Python",4,false,50));
        collection.add(new TrainingDTO("SkillUp","Electronic City","Priya",2,"Electronic City & Koramangala",15500,"Web Dev",3,true,40));
        collection.add(new TrainingDTO("DevMasters","Indiranagar","Vikas",1,"Indiranagar & Jayanagar",14000,"Data Science",2,false,55));
        collection.add(new TrainingDTO("FutureCoders","Koramangala","Kavya",2,"Koramangala & Rajajinagar",16000,"FSD",3,true,48));
        collection.add(new TrainingDTO("LogicLabs","Marathahalli","Rohit",1,"Marathahalli & BTM",13500,"Android",2,true,35));
        collection.add(new TrainingDTO("InnovateIT","HSR Layout","Nisha",3,"HSR & Silk Board",17500,"ML/AI",4,false,65));
        collection.add(new TrainingDTO("NextGenTech","Jayanagar","Deepak",2,"Jayanagar & Banashankari",15000,"Cybersecurity",3,true,52));
        collection.add(new TrainingDTO("AlphaLearn","Banashankari","Meera",1,"Banashankari & RR Nagar",13000,"Cloud",2,false,38));

        Iterator<TrainingDTO> iterator = collection.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());

        }


    }

}
