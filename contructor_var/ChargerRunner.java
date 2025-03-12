class ChargerRunner{
	
	public static void main(String[]args){
		
	String brand="Samsung";
	String watt="35V";
	int price=1000;
	
	Charger charger1=new Charger(brand,watt,price);
	
	System.out.println("Charger 1:");
	System.out.println("brand: "+charger1.brand+"\nwatt :"
		+charger1.watt+"\nprice: "+charger1.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String brand1="Mi";
	String watt1="65V";
	int price1=850;
	
	Charger charger2 = new Charger(brand1,watt1,price1);
	
	System.out.println("Charger 2:");
	System.out.println("brand: "+charger2.brand+"\nwatt :"
		+charger2.watt+"\nprice: "+charger2.price);
	
	System.out.println("---------------------------\n-----------------------");
	
	String brand2="Vivo";
	String watt2="25";
	int price2=700;
	
	Charger charger3 = new Charger(brand2,watt2,price2);
	
	System.out.println("Charger 3:");
	System.out.println("brand: "+charger3.brand+"\nwatt :"
		+charger3.watt+"\nprice: "+charger3.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String brand3="iphone";
	String watt3="35V";
	int price3=1800;
	
	Charger charger4 = new Charger(brand3,watt3,price3);
	
	System.out.println("Charger 4:");
	System.out.println("brand: "+charger4.brand+"\nwatt :"
		+charger4.watt+"\nprice: "+charger4.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String brand4="Oppo";
	String watt4="50V";
	int price4=900;
	
	Charger charger5 = new Charger(brand4,watt4,price4);
	
	System.out.println("Charger 5:");
	System.out.println("brand: "+charger5.brand+"\nwatt :"
		+charger5.watt+"\nprice: "+charger5.price);
	

	}
}