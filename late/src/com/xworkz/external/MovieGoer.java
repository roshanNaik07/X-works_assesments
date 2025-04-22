package com.xworkz.external;

import com.xworkz.internal.MovieTicket;

public class MovieGoer {
    MovieTicket movieTicket;

    public MovieGoer(MovieTicket movieTicket) {
        this.movieTicket = movieTicket;
        System.out.println("Running MovieTicket param const in MovieGoer");
    }

    public void enjoyMovie() {
        System.out.println("Running enjoyMovie in MovieGoer");
        this.movieTicket.bookTicket();
    }
}
