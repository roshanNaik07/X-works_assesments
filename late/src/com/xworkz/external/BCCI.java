package com.xworkz.external;

import com.xworkz.internal.ICC;

public class BCCI {

    ICC icc;

    public BCCI(ICC icc){
        this.icc=icc;
        System.out.println("Running icc parameter const in BCCI");
    }

    public void conductTournament(){

        if (icc != null){
            System.out.println("Running conductTournament in BCCI");
            this.icc.fairplay();
        }
        else {
            System.err.println("icc is null");
        }

    }

}
