package com.xworkz.external;

import com.xworkz.internal.ElectricityBoard;

public class House {
    ElectricityBoard board;

    public House(ElectricityBoard board) {
        this.board = board;
        System.out.println("House constructor with ElectricityBoard");
    }

    public void getElectricity() {
        if (board != null) {
            System.out.println("House is getting electricity");
            board.supplyPower();
        }
    }
}
