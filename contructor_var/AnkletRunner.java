class AnkletRunner{
	
	public static void main(String[]args){
		
	String brand="Jenny Bird";
	String material="Gold or silver-plated brass";
	int price=18000;
	
	Anklet anklet1=new Anklet(brand,material,price);
	
	System.out.println("Anklet 1:");
	System.out.println("brand: "+anklet1.brand+"\nmaterial :"
		+anklet1.material+"\nprice: "+anklet1.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String brand1="Pura Vida";
	String material1="Gold-plated brass with enamel";
	int price1=57000;
	
	Anklet anklet2 = new Anklet(brand1,material1,price1);
	
	System.out.println("Anklet 2:");
	System.out.println("brand: "+anklet2.brand+"\nmaterial :"
		+anklet2.material+"\nprice: "+anklet2.price);
	
	System.out.println("---------------------------\n-----------------------");
	
	String brand2="Earthbound";
	String material2="Silver-tone metal";
	int price2=4500;
	
	Anklet anklet3 = new Anklet(brand2,material2,price2);
	
	System.out.println("Anklet 3:");
	System.out.println("brand: "+anklet3.brand+"\nmaterial :"
		+anklet3.material+"\nprice: "+anklet3.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String brand3="Royal Chain ";
	String material3="Silver";
	int price3=8900;
	
	Anklet anklet4 = new Anklet(brand3,material3,price3);
	
	System.out.println("Anklet 4:");
	System.out.println("brand: "+anklet4.brand+"\nmaterial :"
		+anklet4.material+"\nprice: "+anklet4.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String brand4="Rain Jewelry";
	String material4="Mixed Metal";
	int price4=1990;
	
	Anklet anklet5 = new Anklet(brand4,material4,price4);
	
	System.out.println("Anklet 5:");
	System.out.println("brand: "+anklet5.brand+"\nmaterial :"
		+anklet5.material+"\nprice: "+anklet5.price);
	

	}
}