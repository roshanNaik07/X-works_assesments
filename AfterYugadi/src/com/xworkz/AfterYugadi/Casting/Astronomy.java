package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Book;
import com.xworkz.AfterYugadi.Internal.Physics;

public class Astronomy {

    public void learnAstrology(Book book){
        book.buy();
        book.learn();
        book.price();
        book.read();
        book.writer();
        if (book instanceof Physics){
            Physics physics = (Physics) book;
            physics.takeClass();
        }
    }
}
