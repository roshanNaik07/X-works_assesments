package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.ClinicPlus;
import com.xworkz.AfterYugadi.Internal.Shampoo;

public class ShampooBrand {

    public void type(Shampoo shampoo){
        shampoo.apply();
        shampoo.buy();
        shampoo.sell();
        shampoo.price();
        shampoo.wash();

        if (shampoo instanceof ClinicPlus){
            ClinicPlus clinicPlus = (ClinicPlus) shampoo;
            clinicPlus.brand();
        }
    }
}
