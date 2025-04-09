package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Pamoil;
import com.xworkz.AfterYugadi.Internal.Pepsi;
import com.xworkz.AfterYugadi.Internal.SoftDrink;

public class SoftDrinkBrand {

    public void flovour(SoftDrink softDrink){
        softDrink.buy();
        softDrink.drink();
        softDrink.price();
        softDrink.sell();
        softDrink.price();
        if (softDrink instanceof Pepsi){
            Pepsi pepsi = (Pepsi) softDrink;
            pepsi.brand();
        }
    }
}
