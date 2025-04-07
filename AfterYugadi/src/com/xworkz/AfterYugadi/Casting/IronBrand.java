package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Bajaj;
import com.xworkz.AfterYugadi.Internal.IronBox;

public class IronBrand {

    public void brandName(IronBox ironBox){
        ironBox.buy();
        ironBox.sell();
        ironBox.iron();
        ironBox.color();
        ironBox.price();

        if (ironBox instanceof Bajaj){
            Bajaj bajaj = (Bajaj) ironBox;
            bajaj.company();
        }
    }
}
