package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Apsara;
import com.xworkz.AfterYugadi.Internal.Rular;

public class RularBrand {

    public void type(Rular rular){
        rular.buy();
        rular.length();
        rular.use();
        rular.price();
        rular.color();

        if (rular instanceof Apsara){
            Apsara apsara = (Apsara) rular;
            apsara.material();
        }
    }
}
