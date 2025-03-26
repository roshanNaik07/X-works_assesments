package com.xworkz;

import com.xworkz.IdCard.IdCard;
import com.xworkz.IdCard.StudentId;
import com.xworkz.Jail.Jail;
import com.xworkz.Jail.Jailer;
import com.xworkz.Satelite.ISRO;
import com.xworkz.Satelite.Satelite;

public class MainRunner {
    public static void main(String[] args) {

        Jail jail = new Jail();
        Jailer jailer = new Jailer();

        jailer.maintainJail();

        jail.setName("RAJ Jail");
        jailer.jailName(jail);

        jailer.jailLocation();

        Jail jail1=new Jail();
        jail1.setName("Bantai Jail");
        Jail jail2=new Jail();
        jail2.setName("Mango Jail");

        Jail[] jails={jail1,jail2};
        jailer.oldJails(jails);

        System.out.println("------------------------------------------------------------");

        Satelite satelite = new Satelite();
        ISRO isro = new ISRO();
        isro.firstSatelite();

        isro.sateliteTypes();

        isro.SateliteWeight(satelite);

        Satelite satelite1 = new Satelite();
        satelite1.setLoadCapacity(300);
        Satelite satelite2 = new Satelite();
        satelite2.setLoadCapacity(400);

        Satelite[] satelites ={satelite1,satelite2};
        isro.loadCapacity(satelites);

        System.out.println("------------------------------------------------------------");

        StudentId studentId = new StudentId();
        studentId.idMaterial();

        IdCard idCard = new IdCard();
        studentId.idColors();
    }
}
