package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Pop;
import com.xworkz.AfterYugadi.Internal.Singer;

public class PopCulture {

    public void songType(Singer singer){
        singer.concert();
        singer.getPaid();
        singer.learn();
        singer.perform();
        singer.sings();

        if (singer instanceof Pop){

            Pop pop = (Pop) singer;
            pop.culture();
        }
    }
}
