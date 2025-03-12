class HarpicRunner{
	
	public static void main(String[]args){
		
	String brand="Harpic";
	String color="Blue";
	int price=199;
	
	Harpic harpic1=new Harpic(brand,color,price);
	
	System.out.println("Harpic 1:");
	System.out.println("brand: "+harpic1.brand+"\ncolor :"
		+harpic1.color+"\nprice: "+harpic1.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String brand1="Domex ";
	String color1="White";
	int price1=157;
	
	Harpic harpic2 = new Harpic(brand1,color1,price1);
	
	System.out.println("Harpic 2:");
	System.out.println("brand: "+harpic2.brand+"\ncolor :"
		+harpic2.color+"\nprice: "+harpic2.price);
	
	System.out.println("---------------------------\n-----------------------");
	
	String brand2="B-Loo";
	String color2="Blue";
	int price2=45;
	
	Harpic harpic3 = new Harpic(brand2,color2,price2);
	
	System.out.println("Harpic 3:");
	System.out.println("brand: "+harpic3.brand+"\ncolor :"
		+harpic3.color+"\nprice: "+harpic3.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String brand3="Frosch ";
	String color3="white";
	int price3=289;
	
	Harpic harpic4 = new Harpic(brand3,color3,price3);
	
	System.out.println("Harpic 4:");
	System.out.println("brand: "+harpic4.brand+"\ncolor :"
		+harpic4.color+"\nprice: "+harpic4.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String brand4="Vooki ";
	String color4="white";
	int price4=199;
	
	Harpic harpic5 = new Harpic(brand4,color4,price4);
	
	System.out.println("Harpic 5:");
	System.out.println("brand: "+harpic5.brand+"\ncolor :"
		+harpic5.color+"\nprice: "+harpic5.price);
	

	}
}