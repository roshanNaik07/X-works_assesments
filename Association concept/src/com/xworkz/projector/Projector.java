package com.xworkz.projector;

public class Projector {

    private String projectorName;
    private int projectorPrice;
    Lens lens;
    Lamp lamp;
    Port port;
    Wire wire;
    Board board;

    Projector(String projectorName , int projectorPrice , Lens lens , Lamp lamp,Port port,Wire wire,
              Board board){
        this.projectorName=projectorName;
        this.projectorPrice=projectorPrice;
        this.lens=lens;
        this.lamp=lamp;
        this.port=port;
        this.wire=wire;
        this.board=board;
    }

    void onProjector(){
        System.out.println("Running onProjector in Projector");

        this.lens.fixLens();
        this.lamp.onLamp();
        this.port.protDetails();
        this.wire.wireDetails();
        this.board.boardDetails();
    }


}
