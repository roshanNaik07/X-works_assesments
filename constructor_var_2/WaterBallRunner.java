public class WaterBallRunner { 

    public static void main(String...args) {
        
        WaterBall waterBall1 = new WaterBall("Rubber","Red","Round",15,50,300);
        
        System.out.println("WaterBall 1 Details :");
        waterBall1.display();
        
        System.out.println("----------------------\n--------------------------");
        
        WaterBall waterBall2 = new WaterBall("Plastic","Green","Oval",12,40,250);
        
        System.out.println("WaterBall 2 Details :");
        waterBall2.display();
        
        System.out.println("----------------------\n--------------------------");
        
        WaterBall waterBall3 = new WaterBall("Silicone","Yellow","Round",18,60,320);
        
        System.out.println("WaterBall 3 Details :");
        waterBall3.display();
        
        System.out.println("----------------------\n--------------------------");
        
        WaterBall waterBall4 = new WaterBall("Foam","Orange","Egg-Shaped",10,30,180);
        
        System.out.println("WaterBall 4 Details :");
        waterBall4.display();
        
        System.out.println("----------------------\n--------------------------");
        
        WaterBall waterBall5 = new WaterBall("Latex","Purple","Round",14,55,280);
        
        System.out.println("WaterBall 5 Details :");
        waterBall5.display();
        
        System.out.println("----------------------\n--------------------------");
        
        WaterBall waterBall6 = new WaterBall("Polyurethane","Black","Square",20,70,350);
        
        System.out.println("WaterBall 6 Details :");
        waterBall6.display();
        
        System.out.println("----------------------\n--------------------------");
    }
}
