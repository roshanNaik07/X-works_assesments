public class TomatoRunner { 

    public static void main(String...args) {
        
        Tomato tomato1 = new Tomato("Smooth","Red","Sweet",200,10,150);
        
        System.out.println("Tomato 1 Details :");
        tomato1.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Tomato tomato2 = new Tomato("Firm","Green","Slightly Sour",180,12,130);
        
        System.out.println("Tomato 2 Details :");
        tomato2.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Tomato tomato3 = new Tomato("Juicy","Yellow","Mildly Sweet",220,15,170);
        
        System.out.println("Tomato 3 Details :");
        tomato3.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Tomato tomato4 = new Tomato("Soft","Orange","Tangy",250,18,160);
        
        System.out.println("Tomato 4 Details :");
        tomato4.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Tomato tomato5 = new Tomato("Plump","Purple","Rich & Sweet",210,20,180);
        
        System.out.println("Tomato 5 Details :");
        tomato5.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Tomato tomato6 = new Tomato("Firm","Black","Earthy",190,25,200);
        
        System.out.println("Tomato 6 Details :");
        tomato6.display();
        
        System.out.println("----------------------\n--------------------------");
    }
}
