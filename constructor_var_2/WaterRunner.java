public class WaterRunner { 

    public static void main(String...args) {
        
        Water water1 = new Water("Bisleri","Clear","Spring",500,20,99);
        
        System.out.println("Water 1 Details:");
        water1.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Water water2 = new Water("Aquafina","Clear","Purified",1000,30,98);
        
        System.out.println("Water 2 Details:");
        water2.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Water water3 = new Water("Kinley","Clear","Mineral",1500,40,97);
        
        System.out.println("Water 3 Details:");
        water3.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Water water4 = new Water("Himalayan","Clear","Glacier",750,50,100);
        
        System.out.println("Water 4 Details:");
        water4.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Water water5 = new Water("Tata Copper+","Clear","Copper Infused",500,35,99);
        
        System.out.println("Water 5 Details:");
        water5.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Water water6 = new Water("Evian","Clear","Natural Spring",1000,100,100);
        
        System.out.println("Water 6 Details:");
        water6.display();
        
        System.out.println("----------------------\n--------------------------");
    }
}
