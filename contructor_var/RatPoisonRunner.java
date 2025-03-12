class RatPoisonRunner{
	
	public static void main(String[]args){
		
	String brand="Mortein ";
	String color="Red";
	int price=64;
	
	RatPoison ratPoison1=new RatPoison(brand,color,price);
	
	System.out.println("RatPoison 1:");
	System.out.println("brand: "+ratPoison1.brand+"\ncolor :"
		+ratPoison1.color+"\nprice: "+ratPoison1.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String brand1="HIT";
	String color1="blue";
	int price1=25;
	
	RatPoison ratPoison2 = new RatPoison(brand1,color1,price1);
	
	System.out.println("RatPoison 2:");
	System.out.println("brand: "+ratPoison2.brand+"\ncolor :"
		+ratPoison2.color+"\nprice: "+ratPoison2.price);
	
	System.out.println("---------------------------\n-----------------------");
	
	String brand2="Ratkil ";
	String color2="Yellow";
	int price2=3700;
	
	RatPoison ratPoison3 = new RatPoison(brand2,color2,price2);
	
	System.out.println("RatPoison 3:");
	System.out.println("brand: "+ratPoison3.brand+"\ncolor :"
		+ratPoison3.color+"\nprice: "+ratPoison3.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String brand3="Diamond";
	String color3="Brown";
	int price3=770;
	
	RatPoison ratPoison4 = new RatPoison(brand3,color3,price3);
	
	System.out.println("RatPoison 4:");
	System.out.println("brand: "+ratPoison4.brand+"\ncolor :"
		+ratPoison4.color+"\nprice: "+ratPoison4.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String brand4="Racumin";
	String color4="Blue";
	int price4=200;
	
	RatPoison ratPoison5 = new RatPoison(brand4,color4,price4);
	
	System.out.println("RatPoison 5:");
	System.out.println("brand: "+ratPoison5.brand+"\ncolor :"
		+ratPoison5.color+"\nprice: "+ratPoison5.price);
	

	}
}