package com.xworkz.projector;

public class ProjectorRunner {

    public static void main(String[] args) {
    Lens lens = new Lens("M",800);

    Lamp lamp = new Lamp(500,"rombus",new Warrenty("2025","2028"));

    Port port = new Port("B",5,new PortType(300,"2 years"));

    Wire wire = new Wire(30,"Red",new Quality("Plastic"));

    Board board = new Board("Green","Small",new Capacitor("15 watt",30));

    Projector projector = new Projector("Epson",10000,lens,lamp, port,wire,board);
    projector.onProjector();


    }
}
