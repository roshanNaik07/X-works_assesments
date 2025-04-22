package com.xworkz.external;

import com.xworkz.internal.Publisher;

public class Author {
    Publisher publisher;

    public Author(Publisher publisher) {
        this.publisher = publisher;
        System.out.println("Author constructor with Publisher");
    }

    public void writeBook() {
        if (publisher != null) {
            System.out.println("Writing book...");
            publisher.publishBook();
        }
    }
}
