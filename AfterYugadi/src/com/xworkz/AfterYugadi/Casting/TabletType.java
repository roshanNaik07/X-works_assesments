package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Dolo650;
import com.xworkz.AfterYugadi.Internal.Medicine;

public class TabletType {

    public void type(Medicine medicine){
        medicine.apply();
        medicine.drink();
        medicine.buy();
        medicine.sell();
        medicine.price();

        if (medicine instanceof Dolo650){
            Dolo650 dolo650 = (Dolo650) medicine;
            dolo650.manufacture();
        }
    }
}
