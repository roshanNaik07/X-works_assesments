public class BaloonRunner{
	
	public static void main(String...args){
		
		
		Baloon baloon1 = new Baloon("red","Oval","Medium",5,25,3);
		
		System.out.println("Baloon 1 Details :");
		baloon1.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Baloon baloon2 = new Baloon("white","Alphabet","Large",1,50,2);
		
		System.out.println("Baloon 2 Details :");
		baloon2.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Baloon baloon3 = new Baloon("Yellow","Heart","small",3,75,1);
		
		System.out.println("Baloon 3 Details :");
		baloon3.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Baloon baloon4 = new Baloon("Purple","oval","Medium",2,10,3);
		
		System.out.println("Baloon 4 Details :");
		baloon4.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Baloon baloon5 = new Baloon("Blue","Heart","Small",5,25,1);
		
		System.out.println("Baloon 5 Details :");
		baloon5.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Baloon baloon6 = new Baloon("pink","Alphabet","Large",3,75,2);
		
		System.out.println("Baloon 6 Details :");
		baloon6.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Baloon baloon7 = new Baloon("silver","oval","Medium",5,15,1);
		
		System.out.println("Baloon 7 Details :");
		baloon7.display();
		
		System.out.println("----------------------\n--------------------------");
		
	}
}