package com.xworkz.Internal;

public class ArmStrong {

    int value=0;

    public int checkArmStrong(int number){

        if(number>0){
            int remainder=number%10;
            value+=(remainder*remainder*remainder);
            number=number/10;
            if (number>0) {
                checkArmStrong(number);
            }
        }
        return value;
    }

    public void display(int number,int returnValue){
        if (number==returnValue){
            System.out.println(number+" is a armStrong number");
        }
        else
            System.out.println(number+" is not a armStrong number");
    }
}
