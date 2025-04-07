package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Colgate;
import com.xworkz.AfterYugadi.Internal.Paste;

public class PasteBrand {

    public void brand(Paste paste){
        paste.apply();
        paste.buy();
        paste.color();
        paste.sell();
        paste.price();
        if (paste instanceof Colgate){
            Colgate colgate = (Colgate) paste;
            colgate.manufacture();
        }
    }
}
