package com.xworkz.classParameter;

public class Runner {
    public static void main(String[] args) {

        Display display=new Display();
        Shop shop=new Shop();
        shop.ads(display);

        System.out.println("-----------------------\n-------------------------");


        Poster poster=new Poster();
        Show show = new Show();
        show.movieDetails(poster);

        System.out.println("-----------------------\n-------------------------");

        IplTeams iplTeams= new IplTeams();
        IPL ipl = new IPL();
        ipl.getDetails(iplTeams);

        System.out.println("-----------------------\n-------------------------");

        SpaceX spaceX=new SpaceX();
        Space space =new Space();
        space.spaceAgency(spaceX);

        System.out.println("-----------------------\n-------------------------");

        Dolo dolo = new Dolo();
        Medicine medicine = new Medicine();
        medicine.medicineBrand(dolo);

        System.out.println("-----------------------\n-------------------------");

    }
}
