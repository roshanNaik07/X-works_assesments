class BarRunner{
	
	public static void main(String[]args){
		
	String brand="OldMonk";
	String type="Hot";
	int price=899;
	
	Bar bar1=new Bar(brand,type,price);
	
	System.out.println("Bar 1:");
	System.out.println("brand: "+bar1.brand+"\ntype :"
		+bar1.type+"\nprice: "+bar1.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String brand1="BroCode";
	String type1="Beer";
	int price1=150;
	
	Bar bar2 = new Bar(brand1,type1,price1);
	
	System.out.println("Bar 2:");
	System.out.println("brand: "+bar2.brand+"\ntype :"
		+bar2.type+"\nprice: "+bar2.price);
	
	System.out.println("---------------------------\n-----------------------");
	
	String brand2="Jack Denial";
	String type2="Wiskey";
	int price2=2500;
	
	Bar bar3 = new Bar(brand2,type2,price2);
	
	System.out.println("Bar 3:");
	System.out.println("brand: "+bar3.brand+"\ntype :"
		+bar3.type+"\nprice: "+bar3.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String brand3="Bullet";
	String type3="Beer";
	int price3=160;
	
	Bar bar4 = new Bar(brand3,type3,price3);
	
	System.out.println("Bar 4:");
	System.out.println("brand: "+bar4.brand+"\ntype :"
		+bar4.type+"\nprice: "+bar4.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String brand4="King Fisher";
	String type4="Beer";
	int price4=100;
	
	Bar bar5 = new Bar(brand4,type4,price4);
	
	System.out.println("Bar 5:");
	System.out.println("brand: "+bar5.brand+"\ntype :"
		+bar5.type+"\nprice: "+bar5.price);
	

	}
}