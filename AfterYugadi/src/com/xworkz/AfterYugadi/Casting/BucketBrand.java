package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Bucket;
import com.xworkz.AfterYugadi.Internal.Joyo;

public class BucketBrand {

    public void type(Bucket bucket){
        bucket.buy();
        bucket.color();
        bucket.sell();
        bucket.wash();
        bucket.price();

        if (bucket instanceof Joyo){
            Joyo joyo = (Joyo) bucket;
            joyo.manufacture();
        }
    }
}
