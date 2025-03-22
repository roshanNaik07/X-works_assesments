public class GunRunner { 

    public static void main(String...args) {
        
        Gun gun1 = new Gun("Glock 19","Black","Semi-Automatic",15,50000,700);
        
        System.out.println("Gun 1 Details :");
        gun1.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Gun gun2 = new Gun("Colt M1911","Silver","Pistol",7,60000,1100);
        
        System.out.println("Gun 2 Details :");
        gun2.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Gun gun3 = new Gun("AK-47","Brown","Assault Rifle",30,75000,4300);
        
        System.out.println("Gun 3 Details :");
        gun3.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Gun gun4 = new Gun("MP5","Gray","Submachine Gun",25,85000,3500);
        
        System.out.println("Gun 4 Details :");
        gun4.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Gun gun5 = new Gun("Desert Eagle","Gold","Handgun",9,95000,1500);
        
        System.out.println("Gun 5 Details :");
        gun5.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Gun gun6 = new Gun("Remington 870","Matte Black","Shotgun",5,70000,3800);
        
        System.out.println("Gun 6 Details :");
        gun6.display();
        
        System.out.println("----------------------\n--------------------------");
    }
}
