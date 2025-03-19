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

    }
}
