package com.xworkz.park.comparator_task.runner;

import com.xworkz.park.comparator_task.dto.PersonDTO;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonRunner {

    public static void main(String[] args) {

        Comparator<PersonDTO> comparator1 = (p1, p2) -> Long.compare(p1.getPhoneNo(), p2.getPhoneNo());

        Comparator<PersonDTO> comparator = (p1, p2) -> p1.getPersonName().compareTo(p2.getPersonName());

        Comparator<PersonDTO> comparator2 = Comparator.comparing(PersonDTO::getPersonName).thenComparing(PersonDTO::getEmail);

        Comparator<PersonDTO> comparator3 = Comparator.comparing(PersonDTO::getPhoneNo).thenComparing(PersonDTO::getPersonName);

        PersonDTO personDTO = new PersonDTO("Roshan", "roshan@gmail.com", 9110863479L, LocalDate.parse("2002-12-14"));
        PersonDTO personDTO1 = new PersonDTO("Ketan", "ketan@outlook.com", 4353511686L, LocalDate.parse("2003-06-21"));
        PersonDTO personDTO2 = new PersonDTO("Abhi", "abhi@yahoo.com", 12654646556L, LocalDate.parse("2003-02-26"));
        PersonDTO personDTO3 = new PersonDTO("Rishi", "rishi@gmail.com", 31664646565L, LocalDate.parse("2004-06-25"));
        PersonDTO personDTO4 = new PersonDTO("Vaibhav", "vaibhav@gmail.com", 23368994568L, LocalDate.parse("2003-05-01"));
        PersonDTO personDTO5 = new PersonDTO("Anjali", "anjali@gmail.com", 9876543210L, LocalDate.parse("2001-03-17"));
        PersonDTO personDTO6 = new PersonDTO("Rahul", "rahul@yahoo.com", 9123456789L, LocalDate.parse("2000-08-22"));
        PersonDTO personDTO7 = new PersonDTO("Sneha", "sneha@outlook.com", 9988776655L, LocalDate.parse("2002-11-05"));
        PersonDTO personDTO8 = new PersonDTO("Arjun", "arjun@gmail.com", 9345678123L, LocalDate.parse("2003-02-28"));
        PersonDTO personDTO9 = new PersonDTO("Pooja", "pooja@yahoo.com", 9876123450L, LocalDate.parse("2004-09-15"));
        PersonDTO personDTO10 = new PersonDTO("Yash", "yash@rediff.com", 9765432101L, LocalDate.parse("2002-06-10"));
        PersonDTO personDTO11 = new PersonDTO("Divya", "divya@live.com", 9234567890L, LocalDate.parse("2001-01-30"));
        PersonDTO personDTO12 = new PersonDTO("Nikhil", "nikhil@gmail.com", 9110863479L, LocalDate.parse("2000-12-09"));
        PersonDTO personDTO13 = new PersonDTO("Megha", "megha@hotmail.com", 9767891234L, LocalDate.parse("2003-07-25"));
        PersonDTO personDTO14 = new PersonDTO("Roshan", "karan@live.com", 9112233445L, LocalDate.parse("2002-10-19"));
        PersonDTO personDTO15 = new PersonDTO("Simran", "simran@yahoo.com", 9874312567L, LocalDate.parse("2004-04-03"));
        PersonDTO personDTO16 = new PersonDTO("Amit", "amit@gmail.com", 9345687123L, LocalDate.parse("2001-08-12"));
        PersonDTO personDTO17 = new PersonDTO("Ishita", "ishita@outlook.com", 9784567890L, LocalDate.parse("2000-06-04"));
        PersonDTO personDTO18 = new PersonDTO("Manish", "manish@rediff.com", 9234789056L, LocalDate.parse("2002-05-20"));
        PersonDTO personDTO19 = new PersonDTO("Neha", "neha@gmail.com", 9812345678L, LocalDate.parse("2003-03-13"));


        List<PersonDTO> list = Stream.of(
                personDTO, personDTO1, personDTO2, personDTO3, personDTO4,
                personDTO5, personDTO6, personDTO7, personDTO8, personDTO9,
                personDTO10, personDTO11, personDTO12, personDTO13, personDTO14,
                personDTO15, personDTO16, personDTO17, personDTO18, personDTO19
        ).collect(Collectors.toList());

        System.out.println("Before sorting ");
        list.forEach(System.out::println);

        System.out.println();
        System.out.println("Sorting based on phNo");
        list.stream().sorted(comparator1).forEach(System.out::println);

        System.out.println();
        System.out.println("Sorted based on names : ");
        list.stream().sorted(comparator).forEach(System.out::println);

        System.out.println();
        System.out.println("Sorting by name and email : ");
        list.stream().sorted(comparator2).forEach(System.out::println);

        System.out.println();
        System.out.println("Sorting by phNO and name : ");
        list.stream().sorted(comparator3).forEach(System.out::println);

    }

}
