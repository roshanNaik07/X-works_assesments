public class NailPolishRunner { 

    public static void main(String...args) {
        
        NailPolish polish1 = new NailPolish("Lakmé","Red","Glossy",10,250,7);
        
        System.out.println("Nail Polish 1 Details:");
        polish1.display();
        
        System.out.println("----------------------\n--------------------------");
        
        NailPolish polish2 = new NailPolish("Maybelline","Pink","Matte",12,300,10);
        
        System.out.println("Nail Polish 2 Details:");
        polish2.display();
        
        System.out.println("----------------------\n--------------------------");
        
        NailPolish polish3 = new NailPolish("Colorbar","Blue","Shimmery",15,400,12);
        
        System.out.println("Nail Polish 3 Details:");
        polish3.display();
        
        System.out.println("----------------------\n--------------------------");
        
        NailPolish polish4 = new NailPolish("Revlon","Purple","Metallic",8,350,9);
        
        System.out.println("Nail Polish 4 Details:");
        polish4.display();
        
        System.out.println("----------------------\n--------------------------");
        
        NailPolish polish5 = new NailPolish("Nykaa","Black","Gel",11,280,8);
        
        System.out.println("Nail Polish 5 Details:");
        polish5.display();
        
        System.out.println("----------------------\n--------------------------");
        
        NailPolish polish6 = new NailPolish("OPI","Gold","Pearl",14,500,14);
        
        System.out.println("Nail Polish 6 Details:");
        polish6.display();
        
        System.out.println("----------------------\n--------------------------");
    }
}
