package com.xworkz.external;

import com.xworkz.internal.Constitution;
import com.xworkz.internal.Laptop;

public class OperatingSystem {

    Laptop laptop;

    public OperatingSystem(Laptop laptop) {
        System.out.println("Running no arg const of OperatingSystem");
        this.laptop = laptop;
    }

    public void run() {
        if (this.laptop != null) {
            System.out.println("Running run in OperatingSystem");
            this.laptop.process();
        } else {
            System.err.println("Laptop is null");
        }
    }
}
