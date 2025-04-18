package com.xworkz.External;

import com.xworkz.Internal.ArmStrong;

public class Runner {

    public static void main(String[] args) {


        ArmStrong armStrong = new ArmStrong();

        int number = 1634;
        int returnValue = armStrong.checkArmStrong(number);

        System.out.println(returnValue);
        armStrong.display(number,returnValue);

    }
}
