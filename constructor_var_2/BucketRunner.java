public class BucketRunner {

    public static void main(String...args) {
        
        Bucket bucket1 = new Bucket("Aqua Max","Blue","Large",1,299,2000);
        
        System.out.println("Bucket 1 Details :");
        bucket1.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Bucket bucket2 = new Bucket("Eco Carry","Green","Medium",2,399,1500);
        
        System.out.println("Bucket 2 Details :");
        bucket2.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Bucket bucket3 = new Bucket("Steel Guard","Silver","Extra Large",1,599,2500);
        
        System.out.println("Bucket 3 Details :");
        bucket3.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Bucket bucket4 = new Bucket("Plastic King","Red","Small",3,199,1000);
        
        System.out.println("Bucket 4 Details :");
        bucket4.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Bucket bucket5 = new Bucket("Premium Tough","Black","Large",2,499,2200);
        
        System.out.println("Bucket 5 Details :");
        bucket5.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Bucket bucket6 = new Bucket("Classic Bucket","White","Medium",4,299,1800);
        
        System.out.println("Bucket 6 Details :");
        bucket6.display();
        
        System.out.println("----------------------\n--------------------------");
    }
}
