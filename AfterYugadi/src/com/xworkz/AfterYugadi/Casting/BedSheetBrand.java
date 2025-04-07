package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.BedSheet;
import com.xworkz.AfterYugadi.Internal.Cloth;

public class BedSheetBrand {

    public void brand(Cloth cloth){

        cloth.buy();
        cloth.fold();
        cloth.size();
        cloth.color();
        cloth.price();

        if (cloth instanceof BedSheet){

            BedSheet bedSheet = (BedSheet) cloth;
            bedSheet.design();
        }
    }
}
