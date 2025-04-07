package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.KeyBoard;
import com.xworkz.AfterYugadi.Internal.Zebronics;

public class Electronics {

    public void type(KeyBoard keyBoard){
        keyBoard.buy();
        keyBoard.click();
        keyBoard.color();
        keyBoard.operate();
        keyBoard.price();

        if (keyBoard instanceof Zebronics){

            Zebronics zebronics = (Zebronics) keyBoard;
            zebronics.material();
        }
    }
}
