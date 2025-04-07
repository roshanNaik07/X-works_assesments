package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Game;
import com.xworkz.AfterYugadi.Internal.Gold;
import com.xworkz.AfterYugadi.Internal.Metal;

public class RoseGold {

    public void buyGold(Metal metal){
        metal.buy();
        metal.giveShape();
        metal.color();
        metal.sell();
        metal.price();

        if (metal instanceof Gold){
            Gold gold = (Gold) metal;
            gold.bill();
        }
    }
}
