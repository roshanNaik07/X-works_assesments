public class EggRunner{
	
	public static void main(String...args){
		
		Egg egg1 = new Egg("Protein Rich","Brown","Large",1,10,60);
		
		System.out.println("Egg 1 Details :");
		egg1.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Egg egg2 = new Egg("High Omega-3","White","Medium",2,15,55);
		
		System.out.println("Egg 2 Details :");
		egg2.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Egg egg3 = new Egg("Vitamin Packed","Speckled","Small",6,50,45);
		
		System.out.println("Egg 3 Details :");
		egg3.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Egg egg4 = new Egg("Low Cholesterol","Blue","Extra Large",12,120,70);
		
		System.out.println("Egg 4 Details :");
		egg4.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Egg egg5 = new Egg("Organic","Brown","Jumbo",30,250,75);
		
		System.out.println("Egg 5 Details :");
		egg5.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Egg egg6 = new Egg("Sunflare","Yellow","Warm",2,699,88);
		
		System.out.println("Egg 6 Details :");
		egg6.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Egg egg7 = new Egg("Free Range","White","Large",6,60,65);
		
		System.out.println("Egg 7 Details :");
		egg7.display();
		
		System.out.println("----------------------\n--------------------------");
		
	}
}