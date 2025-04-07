package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Chair;
import com.xworkz.AfterYugadi.Internal.WheelChair;

public class ChairBrand {

    public void properties(Chair chair){
        chair.breakChair();
        chair.buyChair();
        chair.price();
        chair.color();
        chair.manufacture();

        if(chair instanceof WheelChair){

            WheelChair wheelChair = (WheelChair) chair;
            wheelChair.move();
        }
    }
}
