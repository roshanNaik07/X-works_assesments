package com.xworkz.external;

import com.xworkz.internal.BookStore;

public class Reader {
    BookStore bookStore;

    public Reader(BookStore bookStore) {
        this.bookStore = bookStore;
        System.out.println("Running BookStore param const in Reader");
    }

    public void read() {
        System.out.println("Running read in Reader");
        this.bookStore.purchaseBook();
    }
}
